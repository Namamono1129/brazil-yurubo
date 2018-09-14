package teambrazil.yurubo.service;

import org.seasar.doma.Select;
import org.seasar.doma.jdbc.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teambrazil.yurubo.entity.Brazilian;
import teambrazil.yurubo.repository.BrazilianRepository;

/**
 * Service class for @see teambrazil.yurubo.entity.Brazilian
 */
@Service
public class BrazilianService {

    @Autowired
    BrazilianRepository brazilianRepository;

    public Brazilian findBrazilianByLoginUsername(String loginUsername) throws NoResultException {
        return brazilianRepository.findBrazilianByLoginUsername(loginUsername);
    }
}
