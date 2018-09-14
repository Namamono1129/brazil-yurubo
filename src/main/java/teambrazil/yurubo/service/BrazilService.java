package teambrazil.yurubo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teambrazil.yurubo.entity.Brazil;
import teambrazil.yurubo.exception.BrazilNotFoundException;
import teambrazil.yurubo.repository.BrazilRepository;

@Service
public class BrazilService {

    @Autowired
    BrazilRepository brazilRepository;

    public Brazil findBrazilByStringId(String stringId) throws BrazilNotFoundException {
        Brazil brazilFound = brazilRepository.findBrazilByStringId(stringId);

        if (brazilFound == null) {
            throw new BrazilNotFoundException();
        }

        return brazilFound;

    }
}
