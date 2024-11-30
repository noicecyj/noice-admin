package noice.handler.factory.relation;

import com.baomidou.mybatisplus.extension.toolkit.SqlRunner;
import noice.common.utils.BeanUtils;
import noice.entity.po.bean.AppServicePo;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.builder.assembler.relation.AssemblerRelationBuilder;
import noice.handler.builder.controller.relation.ControllerRelationBuilder;
import noice.handler.builder.converter.relation.ConverterRelationBuilder;
import noice.handler.builder.entity.dml.relation.DMLRelationBuilder;
import noice.handler.builder.entity.dml.relation.DMLRelationFieldAlterBuilder;
import noice.handler.builder.entity.dml.relation.DMLRelationTableBuilder;
import noice.handler.builder.entity.dto.relation.DtoRelationBuilder;
import noice.handler.builder.entity.po.relation.PoRelationBuilder;
import noice.handler.builder.entity.vo.relation.VoRelationBuilder;
import noice.handler.builder.mapper.relation.MapperRelationBuilder;
import noice.handler.builder.repository.relation.RepositoryRelationBuilder;
import noice.handler.builder.service.relation.ServiceRelationBuilder;
import noice.handler.factory.ClassFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static noice.constant.CreateConstant.*;

@Component
public class ClassRelationFactoryImpl extends ClassFactoryImpl {

    private static final Logger logger = LoggerFactory.getLogger(ClassRelationFactoryImpl.class);

    private static final String RELATION = "relation";

    private DMLRelationBuilder dmlRelationBuilder;

    private DMLRelationTableBuilder.DMLRelationTableDropBuilder dmlRelationTableDropBuilder;

    private DMLRelationTableBuilder.DMLRelationTableAddBuilder dmlRelationTableAddBuilder;

    private DMLRelationFieldAlterBuilder.DMLRelationFieldDropAlterBuilder dmlRelationFieldDropAlterBuilder;

    private DMLRelationFieldAlterBuilder.DMLRelationFieldAddAlterBuilder dmlRelationFieldAddAlterBuilder;

    private PoRelationBuilder poRelationBuilder;

    private DtoRelationBuilder dtoRelationBuilder;

    private VoRelationBuilder voRelationBuilder;

    private MapperRelationBuilder mapperRelationBuilder;

    private ConverterRelationBuilder.ConverterServiceRelationBuilder converterServiceRelationBuilder;

    private ConverterRelationBuilder.ConverterControllerRelationBuilder converterControllerRelationBuilder;

    private AssemblerRelationBuilder.AssemblerServiceRelationBuilder assemblerServiceRelationBuilder;

    private AssemblerRelationBuilder.AssemblerControllerRelationBuilder assemblerControllerRelationBuilder;

    private RepositoryRelationBuilder repositoryRelationBuilder;

    private ServiceRelationBuilder serviceRelationBuilder;

    private ControllerRelationBuilder controllerRelationBuilder;

    @Autowired
    public void setDmlRelationBuilder(DMLRelationBuilder dmlRelationBuilder) {
        this.dmlRelationBuilder = dmlRelationBuilder;
    }

    @Autowired
    public void setPoRelationBuilder(PoRelationBuilder poRelationBuilder) {
        this.poRelationBuilder = poRelationBuilder;
    }

    @Autowired
    public void setDtoRelationBuilder(DtoRelationBuilder dtoRelationBuilder) {
        this.dtoRelationBuilder = dtoRelationBuilder;
    }

    @Autowired
    public void setVoRelationBuilder(VoRelationBuilder voRelationBuilder) {
        this.voRelationBuilder = voRelationBuilder;
    }

    @Autowired
    public void setMapperRelationBuilder(MapperRelationBuilder mapperRelationBuilder) {
        this.mapperRelationBuilder = mapperRelationBuilder;
    }

    @Autowired
    public void setConverterServiceRelationBuilder(ConverterRelationBuilder.ConverterServiceRelationBuilder converterServiceRelationBuilder) {
        this.converterServiceRelationBuilder = converterServiceRelationBuilder;
    }

    @Autowired
    public void setConverterControllerRelationBuilder(ConverterRelationBuilder.ConverterControllerRelationBuilder converterControllerRelationBuilder) {
        this.converterControllerRelationBuilder = converterControllerRelationBuilder;
    }

    @Autowired
    public void setAssemblerServiceRelationBuilder(AssemblerRelationBuilder.AssemblerServiceRelationBuilder assemblerServiceRelationBuilder) {
        this.assemblerServiceRelationBuilder = assemblerServiceRelationBuilder;
    }

    @Autowired
    public void setAssemblerControllerRelationBuilder(AssemblerRelationBuilder.AssemblerControllerRelationBuilder assemblerControllerRelationBuilder) {
        this.assemblerControllerRelationBuilder = assemblerControllerRelationBuilder;
    }

    @Autowired
    public void setRepositoryRelationBuilder(RepositoryRelationBuilder repositoryRelationBuilder) {
        this.repositoryRelationBuilder = repositoryRelationBuilder;
    }

    @Autowired
    public void setServiceRelationBuilder(ServiceRelationBuilder serviceRelationBuilder) {
        this.serviceRelationBuilder = serviceRelationBuilder;
    }

    @Autowired
    public void setControllerRelationBuilder(ControllerRelationBuilder controllerRelationBuilder) {
        this.controllerRelationBuilder = controllerRelationBuilder;
    }

    @Autowired
    public void setDmlRelationTableDropBuilder(DMLRelationTableBuilder.DMLRelationTableDropBuilder dmlRelationTableDropBuilder) {
        this.dmlRelationTableDropBuilder = dmlRelationTableDropBuilder;
    }

    @Autowired
    public void setDmlRelationTableAddBuilder(DMLRelationTableBuilder.DMLRelationTableAddBuilder dmlRelationTableAddBuilder) {
        this.dmlRelationTableAddBuilder = dmlRelationTableAddBuilder;
    }

    @Autowired
    public void setDmlRelationFieldDropAlterBuilder(DMLRelationFieldAlterBuilder.DMLRelationFieldDropAlterBuilder dmlRelationFieldDropAlterBuilder) {
        this.dmlRelationFieldDropAlterBuilder = dmlRelationFieldDropAlterBuilder;
    }

    @Autowired
    public void setDmlRelationFieldAddAlterBuilder(DMLRelationFieldAlterBuilder.DMLRelationFieldAddAlterBuilder dmlRelationFieldAddAlterBuilder) {
        this.dmlRelationFieldAddAlterBuilder = dmlRelationFieldAddAlterBuilder;
    }

    @Override
    public void create() {
        String root = getRoot();
        for (PersistentPo persistentPo : findByType(RELATION)) {
            List<PersistentPropertyPo> persistentPropertyPoList = findByPersistentId(persistentPo.getId());
            if (persistentPo.getStatus()) {
                createEntityDML(root, persistentPo, persistentPropertyPoList);
                createEntityPO(root, persistentPo, persistentPropertyPoList);
                createEntityDTO(root, persistentPo, persistentPropertyPoList);
                createEntityVO(root, persistentPo, persistentPropertyPoList);
                createMapper(root, persistentPo);
                createConverter(root, persistentPo, persistentPropertyPoList);
                createAssembler(root, persistentPo, persistentPropertyPoList);
                createRepository(root, persistentPo, persistentPropertyPoList);
                createService(root, persistentPo, persistentPropertyPoList);
                createController(root, persistentPo);
            } else {
//                deleteEntityDML(root, persistentPo, persistentPropertyPoList);
//                deleteEntityPO(root, persistentPo, persistentPropertyPoList);
//                deleteEntityDTO(root, persistentPo, persistentPropertyPoList);
//                deleteEntityVO(root, persistentPo, persistentPropertyPoList);
//                deleteMapper(root, persistentPo);
//                deleteConverter(root, persistentPo);
//                deleteRepository(root, persistentPo);
//                deleteService(root, persistentPo);
//                deleteController(root, persistentPo);
            }
        }
    }

    @Override
    public void initData() {
        for (PersistentPo persistentPo : findByType(RELATION)) {
            if (persistentPo.getStatus()) {
//                createRelationInterface(persistentPo);
            } else {
                deleteRelationInterface(persistentPo);
            }
        }
    }

    private void deleteRelationInterface(PersistentPo persistentPo) {

    }

    private void deleteEntityDML(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        BeanUtils.deleteSqlFile(rootPath + ENTITY_PATH + "dml/" + RELATION, dmlRelationBuilder.builder(persistentPo, persistentPropertyPoList, DATABASE).getFileName());
        deleteDataDML(persistentPo, persistentPropertyPoList);
    }

    private void deleteEntityPO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        BeanUtils.deleteJavaFile(rootPath + ENTITY_PATH + "po/" + RELATION, poRelationBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
    }

    private void deleteEntityDTO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        BeanUtils.deleteJavaFile(rootPath + ENTITY_PATH + "dto/" + RELATION, dtoRelationBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
    }

    private void deleteEntityVO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        BeanUtils.deleteJavaFile(rootPath + ENTITY_PATH + "vo/" + RELATION, voRelationBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
    }


    public void deleteMapper(String rootPath, PersistentPo persistentPo) {
        BeanUtils.deleteJavaFile(rootPath + MAPPER_PATH + RELATION, mapperRelationBuilder.builder(persistentPo).getClassName());
    }

    public void deleteConverter(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        BeanUtils.deleteJavaFile(rootPath + SERVICE_CONVERTER_PATH + RELATION, converterServiceRelationBuilder.builder(persistentPo).getClassName());
        BeanUtils.deleteJavaFile(rootPath + CONTROLLER_CONVERTER_PATH + RELATION, converterControllerRelationBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
    }

    public void deleteAssembler(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        BeanUtils.deleteJavaFile(rootPath + SERVICE_ASSEMBLER_PATH + RELATION, assemblerServiceRelationBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
        BeanUtils.deleteJavaFile(rootPath + CONTROLLER_ASSEMBLER_PATH + RELATION, assemblerControllerRelationBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
    }

    public void deleteRepository(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        BeanUtils.deleteJavaFile(rootPath + REPOSITORY_PATH + RELATION, repositoryRelationBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
    }


    public void deleteService(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        BeanUtils.deleteJavaFile(rootPath + SERVICE_PATH + RELATION, serviceRelationBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
    }

    public void deleteController(String rootPath, PersistentPo persistentPo) {
        AppServicePo appService = getAppService(persistentPo.getAppServiceId());
        BeanUtils.deleteJavaFile(rootPath + CONTROLLER_PATH + RELATION, controllerRelationBuilder.builder(persistentPo, appService).getClassName());
    }

    public void createEntityDML(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        dmlRelationBuilder.builder(persistentPo, persistentPropertyPoList, DATABASE);
        try {
            super.createAndSaveHistory(rootPath + ENTITY_PATH + "dml/" + RELATION, rootPath + HISTORY_ENTITY_PATH + RELATION + "/dml",
                    dmlRelationBuilder.getFileName(), dmlRelationBuilder.toString(), "sql");
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
        createDataDML(persistentPo, persistentPropertyPoList);
    }

    public void createEntityPO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        poRelationBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + ENTITY_PATH + "po/" + RELATION, rootPath + HISTORY_ENTITY_PATH + RELATION + "/po",
                    poRelationBuilder.getClassName(), poRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    public void createEntityDTO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        dtoRelationBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + ENTITY_PATH + "dto/" + RELATION, rootPath + HISTORY_ENTITY_PATH + RELATION + "/dto",
                    dtoRelationBuilder.getClassName(), dtoRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    public void createEntityVO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        voRelationBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + ENTITY_PATH + "vo/" + RELATION, rootPath + HISTORY_ENTITY_PATH + RELATION + "/vo",
                    voRelationBuilder.getClassName(), voRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createMapper(String rootPath, PersistentPo persistentPo) {
        mapperRelationBuilder.builder(persistentPo);
        try {
            super.createAndSaveHistory(rootPath + MAPPER_PATH + RELATION, rootPath + HISTORY_MAPPER_PATH + RELATION,
                    mapperRelationBuilder.getClassName(), mapperRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    public void createConverter(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        converterServiceRelationBuilder.builder(persistentPo);
        converterControllerRelationBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + SERVICE_CONVERTER_PATH + RELATION, rootPath + HISTORY_SERVICE_CONVERTER_PATH + RELATION,
                    converterServiceRelationBuilder.getClassName(), converterServiceRelationBuilder.toString());
            super.createAndSaveHistory(rootPath + CONTROLLER_CONVERTER_PATH + RELATION, rootPath + HISTORY_CONTROLLER_CONVERTER_PATH + RELATION,
                    converterControllerRelationBuilder.getClassName(), converterControllerRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    public void createAssembler(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        assemblerServiceRelationBuilder.builder(persistentPo, persistentPropertyPoList);
        assemblerControllerRelationBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + SERVICE_ASSEMBLER_PATH + RELATION, rootPath + HISTORY_SERVICE_ASSEMBLER_PATH + RELATION,
                    assemblerServiceRelationBuilder.getClassName(), assemblerServiceRelationBuilder.toString());
            super.createAndSaveHistory(rootPath + CONTROLLER_ASSEMBLER_PATH + RELATION, rootPath + HISTORY_CONTROLLER_ASSEMBLER_PATH + RELATION,
                    assemblerControllerRelationBuilder.getClassName(), assemblerControllerRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    public void createRepository(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        repositoryRelationBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + REPOSITORY_PATH + RELATION, rootPath + HISTORY_REPOSITORY_PATH + RELATION,
                    repositoryRelationBuilder.getClassName(), repositoryRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    public void createService(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        serviceRelationBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + SERVICE_PATH + RELATION, rootPath + HISTORY_SERVICE_PATH + RELATION,
                    serviceRelationBuilder.getClassName(), serviceRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    public void createController(String rootPath, PersistentPo persistentPo) {
        AppServicePo appService = getAppService(persistentPo.getAppServiceId());
        controllerRelationBuilder.builder(persistentPo, appService);
        try {
            super.createAndSaveHistory(rootPath + CONTROLLER_PATH + RELATION, rootPath + HISTORY_CONTROLLER_PATH + RELATION,
                    controllerRelationBuilder.getClassName(), controllerRelationBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

//    public void createRelationInterface(PersistentPo persistentPo) {
//        AppServicePo appService = getAppService(persistentPo.getAppServiceId());
//        createInterfaceType(persistentPo, appService, "set", "保存");
//        createInterfaceType(persistentPo, appService, "get", "查询");
//    }

    public void createDataDML(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String tableName = "t_" + persistentPo.getPersistentCode();
        long tableFlag = SqlRunner.db().selectCount("SELECT COUNT(1) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = {0}", tableName);
        if (tableFlag == 0) {
            SqlRunner.db().insert(dmlRelationTableAddBuilder.builder(persistentPo, persistentPropertyPoList, DATABASE).toString());
        } else {
            logger.info(tableName + ":已存在");
        }
        for (PersistentPropertyPo po : persistentPropertyPoList) {
            String columnName = po.getPersistentPropertyCode();
            long columnFlag = SqlRunner.db().selectCount("SELECT COUNT(1) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = {0} AND COLUMN_NAME = {1}", tableName, columnName);
            if (columnFlag == 0) {
                SqlRunner.db().insert(dmlRelationFieldAddAlterBuilder.builder(po, tableName, DATABASE).toString());
            } else {
                logger.info(tableName + ":" + columnName + ":已存在");
            }
        }
    }

    public void deleteDataDML(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String tableName = "t_" + persistentPo.getPersistentCode();
        long tableFlag = SqlRunner.db().selectCount("SELECT COUNT(1) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = {0}", tableName);
        if (tableFlag == 1) {
            SqlRunner.db().insert(dmlRelationTableDropBuilder.builder(tableName, DATABASE).toString());
        } else {
            logger.info(tableName + ":不存在");
        }
        for (PersistentPropertyPo po : persistentPropertyPoList) {
            String columnName = po.getPersistentPropertyCode();
            long columnFlag = SqlRunner.db().selectCount("SELECT COUNT(1) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = {0} AND COLUMN_NAME = {1}", tableName, columnName);
            if (columnFlag == 1) {
                SqlRunner.db().insert(dmlRelationFieldDropAlterBuilder.builder(po, tableName, DATABASE).toString());
            } else {
                logger.info(tableName + ":" + columnName + ":不存在");
            }
        }
    }

}
