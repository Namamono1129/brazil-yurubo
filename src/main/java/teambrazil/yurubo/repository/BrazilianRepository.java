package teambrazil.yurubo.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.NoResultException;
import teambrazil.yurubo.entity.Brazilian;

@Dao
@ConfigAutowireable
public interface BrazilianRepository {

    @Select(ensureResult = true)
    public Brazilian findBrazilianByLoginUsername(String loginUsername) throws NoResultException;

}
