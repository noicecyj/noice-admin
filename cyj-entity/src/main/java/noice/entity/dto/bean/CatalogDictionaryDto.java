package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.CatalogPo;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CatalogDictionaryDto extends BaseDtoBean {

    public static final String DTO = "CatalogDictionary";

    private String catalogDictionaryCode;

    private String catalogDictionaryName;

    private String catalogId;

    private CatalogPo catalogPo;

}