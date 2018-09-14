package teambrazil.yurubo.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import teambrazil.yurubo.entity.Brazil;

@ConfigAutowireable
@Dao
public interface BrazilRepository {

    @Select
    public Brazil findBrazilByStringId(String stringId);
}
