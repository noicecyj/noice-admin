package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.CatalogDto;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CatalogDictionaryVo extends BaseVoBean {

    public static final String VO = "CatalogDictionary";

    private String catalogDictionaryCode;

    private String catalogDictionaryName;

    private String catalogId;

    private CatalogDto catalogDto;

}