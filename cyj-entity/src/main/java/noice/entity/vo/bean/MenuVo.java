package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.MenuDto;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MenuVo extends BaseVoBean {

    public static final String VO = "Menu";

    private String authorityId;

    private AuthorityDto authorityDto;

    private String menuCode;

    private String menuIcon;

    private String menuId;

    private MenuDto menuDto;

    private String menuName;

    private String menuUrl;

}