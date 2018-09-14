package teambrazil.yurubo.entity;

import lombok.Getter;
import org.springframework.security.core.authority.AuthorityUtils;

public class LoginUser extends org.springframework.security.core.userdetails.User {

    @Getter
    private Brazilian wrappedBrazilian;

    /**
     * Default constructor
     * @param sourceBrazilian User entity class. Wrapped by this class
     */
    public LoginUser(Brazilian sourceBrazilian) {
        super(sourceBrazilian.getLoginUsername(), sourceBrazilian.getPasswordHash(),
                AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.wrappedBrazilian = sourceBrazilian;
    }
}
