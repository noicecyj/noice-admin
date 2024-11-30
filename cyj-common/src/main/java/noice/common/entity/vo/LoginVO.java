package noice.common.entity.vo;

import lombok.Data;

/**
 * @author Noice
 */

@Data
public class LoginVO {

    private String username;
    private String password;
    private boolean autoLogin;
    private String token;

}
