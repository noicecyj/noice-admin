package noice.entity.auth.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.auth.po.bean.AuthorityPo;
import noice.entity.auth.po.bean.MenuPo;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MenuDto extends BaseDtoBean {

    public static final String DTO = "Menu";

    private String authorityId;

    private AuthorityPo authorityPo;

    private String menuCode;

    private String menuIcon;

    private String menuId;

    private MenuPo menuPo;

    private String menuName;

    private String menuUrl;

}