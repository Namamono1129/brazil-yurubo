package teambrazil.yurubo.entity;

import lombok.Getter;
import lombok.Setter;
import org.seasar.doma.*;
import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Entity class representing an user.
 * Used for authentication with Spring Security.
 */
@Entity
public class Brazilian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Integer id;

    @Column(name = "login_username")
    @Getter
    @Setter
    private String loginUsername;

    @Column(name = "password_hash")
    @Getter
    @Setter
    private String passwordHash;

    @Getter
    @Setter
    private String name;
}
