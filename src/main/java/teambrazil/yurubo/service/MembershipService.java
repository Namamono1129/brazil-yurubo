package teambrazil.yurubo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teambrazil.yurubo.entity.Membership;
import teambrazil.yurubo.repository.MembershipRepository;

@Service
public class MembershipService {

    @Autowired
    MembershipRepository membershipRepository;

    public boolean isMember(Integer brazilianId, Integer brazilId) {
        return (membershipRepository.getMembership(brazilianId, brazilId) > 0);
    }

    public void addMembership(Integer brazilianId, Integer brazilId) {
        Membership newMembership = new Membership();
        newMembership.brazilianId = brazilianId;
        newMembership.brazilId = brazilId;
        membershipRepository.addMembership(newMembership);
    }
}
