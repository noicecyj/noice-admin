package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CatalogVo extends BaseVoBean {

    public static final String VO = "Catalog";

    private String catalogCode;

    private String catalogName;

}