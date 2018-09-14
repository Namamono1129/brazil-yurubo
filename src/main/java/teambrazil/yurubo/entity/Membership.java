package teambrazil.yurubo.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

@Entity
public class Membership {
    @Column(name = "brazil_id")
    public int brazilId;

    @Column(name = "brazilian_id")
    public int brazilianId;
}
