package noice.entity.vo;

import lombok.Data;

/**
 * @author Noice
 */
@Data
public class LoginResultVo {

    private Boolean success = true;

    private String token;

}
