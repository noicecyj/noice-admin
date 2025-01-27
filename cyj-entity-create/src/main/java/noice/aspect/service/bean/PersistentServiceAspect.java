package noice.aspect.service.bean;

import com.alibaba.fastjson2.JSONObject;
import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanServiceAspectInterface;
import noice.repository.bean.PersistentFormRepository;
import noice.repository.bean.PersistentPropertyRepository;
import noice.repository.bean.PersistentTableRepository;
import noice.service.OperateTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static noice.common.contants.Constant.DEFAULT_FORM;
import static noice.common.contants.Constant.PARAM_BASE_DTO_BEAN;

/**
 * @author Noice
 */
@Component
public class PersistentServiceAspect implements BeanServiceAspectInterface {

    private PersistentPropertyRepository persistentPropertyRepository;

    private PersistentFormRepository persistentFormRepository;

    private PersistentTableRepository persistentTableRepository;

    private OperateTableService operateTableService;

    @Autowired
    public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
        this.persistentPropertyRepository = persistentPropertyRepository;
    }

    @Autowired
    public void setPersistentFormRepository(PersistentFormRepository persistentFormRepository) {
        this.persistentFormRepository = persistentFormRepository;
    }

    @Autowired
    public void setPersistentTableRepository(PersistentTableRepository persistentTableRepository) {
        this.persistentTableRepository = persistentTableRepository;
    }

    @Autowired
    public void setOperateTableService(OperateTableService operateTableService) {
        this.operateTableService = operateTableService;
    }

    @Override
    public void addOneAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        BeanServiceAspectInterface.super.addOneAfter(param, result, beforeInfo);
        PersistentDto persistentDto = param.getObject(PARAM_BASE_DTO_BEAN, PersistentDto.class);
        this.addDefaultFormAndTable(persistentDto);
        operateTableService.addTable(persistentDto);
    }

    @Override
    public void updateOneAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        BeanServiceAspectInterface.super.updateOneAfter(param, result, beforeInfo);
        PersistentDto persistentDto = param.getObject(PARAM_BASE_DTO_BEAN, PersistentDto.class);
        this.updateDefaultFormAndTable(persistentDto);
        operateTableService.updateTable(persistentDto);
    }

    @Override
    public void deleteOneAfter(JSONObject param, JSONObject result, JSONObject beforeInfo) {
        BeanServiceAspectInterface.super.deleteOneAfter(param, result, beforeInfo);
        PersistentDto persistentDto = param.getObject(PARAM_BASE_DTO_BEAN, PersistentDto.class);
        this.deleteDefaultFormAndTable(persistentDto);
        operateTableService.dropTable(persistentDto);
    }

    /**
     * 新增默认表单与表格
     *
     * @param persistentDto 方法参数
     */
    private void addDefaultFormAndTable(PersistentDto persistentDto) {
        PersistentFormPo persistentFormPo = persistentFormRepository.find(new PersistentFormPo()
                .eqPersistentId(persistentDto.getId()).eqPersistentFormType(DEFAULT_FORM).getQueryWrapper());
        if (persistentFormPo == null) {
            persistentFormPo = new PersistentFormPo();
            persistentFormPo.setPersistentFormCode(persistentDto.getPersistentCode());
            persistentFormPo.setPersistentFormName(persistentDto.getPersistentName());
            persistentFormPo.setPersistentFormType(DEFAULT_FORM);
            int formAdd = persistentFormRepository.add(persistentFormPo);
            if (formAdd > 0) {
                logger.info("formAdd:{}", persistentFormPo);
            }
        }
        PersistentTablePo persistentTablePo = persistentTableRepository.find(new PersistentTablePo()
                .eqPersistentId(persistentDto.getId()).getQueryWrapper());
        if (persistentTablePo == null) {
            persistentTablePo = new PersistentTablePo();
            persistentTablePo.setPersistentTableCode(persistentDto.getPersistentCode());
            persistentTablePo.setPersistentTableName(persistentDto.getPersistentName());
            int tableAdd = persistentTableRepository.add(persistentTablePo);
            if (tableAdd > 0) {
                logger.info("tableAdd:{}", persistentTablePo);
            }
        }
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
                logger.info("formUpdate:{}", persistentFormPo);
            }
        }
        PersistentTablePo persistentTablePo = persistentTableRepository.find(new PersistentTablePo()
                .eqPersistentId(persistentDto.getId()).getQueryWrapper());
        if (persistentTablePo != null) {
            persistentTablePo.setPersistentTableCode(persistentDto.getPersistentCode());
            persistentTablePo.setPersistentTableName(persistentDto.getPersistentName());
            int tableUpdate = persistentTableRepository.update(persistentTablePo);
            if (tableUpdate > 0) {
                logger.info("tableUpdate:{}", persistentTablePo);
            }
        }
    }

    /**
     * 删除默认表单与表格
     *
     * @param persistentDto 方法参数
     */
    private void deleteDefaultFormAndTable(PersistentDto persistentDto) {
        int delete = persistentPropertyRepository.delete(new PersistentPropertyPo()
                .eqPersistentId(persistentDto.getId()).getQueryWrapper());
        if (delete > 0) {
            logger.info("delete:{}", persistentDto);
        }
        PersistentFormPo persistentFormPo = persistentFormRepository
                .find(new PersistentFormPo().eqPersistentId(persistentDto.getId())
                        .eqPersistentFormType(DEFAULT_FORM).getQueryWrapper());
        if (persistentFormPo != null) {
            int formDelete = persistentFormRepository.delete(persistentFormPo.getId());
            if (formDelete > 0) {
                logger.info("formDelete:{}", persistentFormPo);
            }
        }
        PersistentTablePo persistentTablePo = persistentTableRepository.find(new PersistentTablePo()
                .eqPersistentId(persistentDto.getId()).getQueryWrapper());
        if (persistentTablePo != null) {
            int tableDelete = persistentTableRepository.delete(persistentTablePo.getId());
            if (tableDelete > 0) {
                logger.info("tableDelete:{}", persistentTablePo);
            }
        }
    }

}