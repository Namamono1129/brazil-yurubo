package teambrazil.yurubo.service;

import org.seasar.doma.jdbc.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import teambrazil.yurubo.entity.Brazilian;
import teambrazil.yurubo.entity.LoginUser;
import teambrazil.yurubo.repository.BrazilianRepository;

@Service
public class LoginUserService implements UserDetailsService {

    @Autowired
    BrazilianRepository brazilianRepository;

    public UserDetails loadUserByUsername(String loginUserId)
    throws UsernameNotFoundException {
        Brazilian brazilian = null;

        try {
            brazilian = brazilianRepository.findBrazilianByLoginUsername(loginUserId);
        } catch (NoResultException e) {
            throw new UsernameNotFoundException("Username " + loginUserId +" not found");
        }

        return new LoginUser(brazilian);
    }
}
