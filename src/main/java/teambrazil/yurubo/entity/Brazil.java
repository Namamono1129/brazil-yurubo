package teambrazil.yurubo.entity;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.*;

@Entity
public class Brazil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column(name = "string_id")
    @Getter
    @Setter
    private String stringId;

    @Column(name = "password_hash")
    @Getter
    @Setter
    private String passwordHash;

    @Getter
    @Setter
    private String name;
}
