package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CatalogDto extends BaseDtoBean {

    public static final String DTO = "Catalog";

    private String catalogCode;

    private String catalogName;

}