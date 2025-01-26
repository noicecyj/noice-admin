package noice.aspect.service.bean;

import com.alibaba.fastjson2.JSONObject;
import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanServiceAspectInterface;
import noice.repository.bean.PersistentFormRepository;
import noice.repository.bean.PersistentTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static noice.common.contants.Constant.DEFAULT_FORM;
import static noice.common.contants.Constant.PARAM_BASE_DTO_BEAN;

/**
 * @author Noice
 */
@Component
public class PersistentServiceAspect implements BeanServiceAspectInterface {

    private PersistentFormRepository persistentFormRepository;

    private PersistentTableRepository persistentTableRepository;

    @Autowired
    public void setPersistentFormRepository(PersistentFormRepository persistentFormRepository) {
        this.persistentFormRepository = persistentFormRepository;
    }

    @Autowired
    public void setPersistentTableRepository(PersistentTableRepository persistentTableRepository) {
        this.persistentTableRepository = persistentTableRepository;
    }

    @Override
    public void updateOneAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        BeanServiceAspectInterface.super.updateOneAfter(param, result, beforeInfo);
        PersistentDto persistentDto = param.getObject(PARAM_BASE_DTO_BEAN, PersistentDto.class);
        this.updateDefaultFormAndTable(persistentDto);
    }

    /**
     * 更新默认表单与表格
     *
     * @param persistentDto 方法参数
     */
    private void updateDefaultFormAndTable(PersistentDto persistentDto) {
        PersistentFormPo persistentFormPo = persistentFormRepository
                .find(new PersistentFormPo().eqPersistentId(persistentDto.getId())
                        .eqPersistentFormType(DEFAULT_FORM).getQueryWrapper());
        if (persistentFormPo != null) {
            persistentFormPo.setPersistentFormCode(persistentDto.getPersistentCode());
            persistentFormPo.setPersistentFormName(persistentDto.getPersistentName());
            int formUpdate = persistentFormRepository.update(persistentFormPo);
            if (formUpdate > 0) {
                logger.info(persistentFormPo.toString());
            }
        }
        PersistentTablePo persistentTablePo = persistentTableRepository.find(new PersistentTablePo()
                .eqPersistentId(persistentDto.getId()).getQueryWrapper());
        if (persistentTablePo != null) {
            persistentTablePo.setPersistentTableCode(persistentDto.getPersistentCode());
            persistentTablePo.setPersistentTableName(persistentDto.getPersistentName());
            int tableUpdate = persistentTableRepository.update(persistentTablePo);
            if (tableUpdate > 0) {
                logger.info(persistentTablePo.toString());
            }
        }
    }

    private void updateDBSQl(PersistentDto persistentDto) {

    }
}