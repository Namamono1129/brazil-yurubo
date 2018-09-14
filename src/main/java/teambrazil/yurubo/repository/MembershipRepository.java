package teambrazil.yurubo.repository;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;
import teambrazil.yurubo.entity.Membership;

@ConfigAutowireable
@Dao
public interface MembershipRepository {

    @Select
    public int getMembership(Integer brazilianId, Integer brazilId);

    @Insert
    public int addMembership(Membership newMembership);
}
