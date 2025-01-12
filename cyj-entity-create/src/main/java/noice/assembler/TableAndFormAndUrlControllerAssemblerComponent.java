package noice.assembler;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.common.entity.dto.FieldPropsDTO;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.entity.po.bean.CatalogDictionaryPo;
import noice.entity.po.bean.CatalogPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
import noice.repository.bean.CatalogRepository;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Noice
 */
@Component
public class TableAndFormAndUrlControllerAssemblerComponent {

    private CatalogRepository catalogRepository;

    private CatalogDictionaryRepository catalogDictionaryRepository;

    private CatalogDictionaryServiceAssembler catalogDictionaryServiceAssembler;

    private TableAndFormAndUrlServiceAssembler tableAndFormAndUrlServiceAssembler;

    @Autowired
    public void setTableAndFormAndUrlServiceAssembler(TableAndFormAndUrlServiceAssembler tableAndFormAndUrlServiceAssembler) {
        this.tableAndFormAndUrlServiceAssembler = tableAndFormAndUrlServiceAssembler;
    }

    @Autowired
    public void setCatalogRepository(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Autowired
    public void setCatalogDictionaryRepository(CatalogDictionaryRepository catalogDictionaryRepository) {
        this.catalogDictionaryRepository = catalogDictionaryRepository;
    }

    @Autowired
    public void setCatalogDictionaryServiceAssembler(CatalogDictionaryServiceAssembler catalogDictionaryServiceAssembler) {
        this.catalogDictionaryServiceAssembler = catalogDictionaryServiceAssembler;
    }

    public List<CatalogDictionaryDto> getDict(String dataSourceCode) {
        CatalogPo catalogPo = catalogRepository.find(new CatalogPo().eqCatalogCode(dataSourceCode).getQueryWrapper());
        if (ObjectUtil.isNotNull(catalogPo)) {
            return catalogDictionaryServiceAssembler.poListToDtoList(catalogDictionaryRepository.findList(new CatalogDictionaryPo().eqCatalogId(catalogPo.getId()).getQueryWrapper()));
        }
        return null;
    }

    @Named("dataSourceToOptionList")
    public List dataSourceToOptionList(String dataSourceCode) {
        if (StrUtil.isEmpty(dataSourceCode)) {
            return null;
        }
        List<String> split = StrUtil.split(dataSourceCode, "#");
        String type = split.get(0);
        String name = split.get(1);
        if ("Entity".equals(type)) {
            Map<String, BeanService> beansOfType = SpringUtil.getBeansOfType(BeanService.class);
            BeanService beanService = beansOfType.get(StrUtil.lowerFirst(name) + "Service");
            if (ObjectUtil.isNotNull(beanService)) {
                return beanService.getOptions();
            }
        } else if ("Dict".equals(type)) {
            List<CatalogDictionaryDto> dict = this.getDict(name);
            return tableAndFormAndUrlServiceAssembler.dtoCatalogDictionaryListToDtoOptionList(dict);
        }
        return null;
    }

    @Named("defaultValueStringToObject")
    public Object defaultValueStringToObject(String defaultValue) {
        if ("true".equals(defaultValue)) {
            return true;
        } else if ("false".equals(defaultValue)) {
            return false;
        }
        return defaultValue;
    }

    @Named("dataSourceToFieldProps")
    public FieldPropsDTO dataSourceToFieldProps(String dataSourceCode) {
        FieldPropsDTO fieldPropsDTO = new FieldPropsDTO();
        fieldPropsDTO.setOptions(dataSourceToOptionList(dataSourceCode));
        return fieldPropsDTO;
    }

}