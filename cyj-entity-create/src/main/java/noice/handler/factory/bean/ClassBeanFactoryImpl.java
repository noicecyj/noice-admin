package noice.handler.factory.bean;

import com.baomidou.mybatisplus.extension.toolkit.SqlRunner;
import noice.entity.po.bean.AppServicePo;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.builder.assembler.bean.AssemblerBeanBuilder;
import noice.handler.builder.controller.bean.ControllerBeanBuilder;
import noice.handler.builder.converter.bean.ConverterBeanBuilder;
import noice.handler.builder.entity.dml.bean.DMLBeanBuilder;
import noice.handler.builder.entity.dml.bean.DMLBeanFieldAlterBuilder;
import noice.handler.builder.entity.dml.bean.DMLBeanTableBuilder;
import noice.handler.builder.entity.dto.bean.DtoBeanBuilder;
import noice.handler.builder.entity.po.bean.PoBeanBuilder;
import noice.handler.builder.entity.vo.bean.VoBeanBuilder;
import noice.handler.builder.mapper.bean.MapperBeanBuilder;
import noice.handler.builder.repository.bean.RepositoryBeanBuilder;
import noice.handler.builder.service.bean.ServiceBeanBuilder;
import noice.handler.factory.ClassFactoryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static noice.common.contants.Constant.DATABASE;
import static noice.constant.CreateConstant.CONTROLLER_ASSEMBLER_PATH;
import static noice.constant.CreateConstant.CONTROLLER_CONVERTER_PATH;
import static noice.constant.CreateConstant.CONTROLLER_PATH;
import static noice.constant.CreateConstant.ENTITY_PATH;
import static noice.constant.CreateConstant.HISTORY_CONTROLLER_ASSEMBLER_PATH;
import static noice.constant.CreateConstant.HISTORY_CONTROLLER_CONVERTER_PATH;
import static noice.constant.CreateConstant.HISTORY_CONTROLLER_PATH;
import static noice.constant.CreateConstant.HISTORY_ENTITY_PATH;
import static noice.constant.CreateConstant.HISTORY_MAPPER_PATH;
import static noice.constant.CreateConstant.HISTORY_REPOSITORY_PATH;
import static noice.constant.CreateConstant.HISTORY_SERVICE_ASSEMBLER_PATH;
import static noice.constant.CreateConstant.HISTORY_SERVICE_CONVERTER_PATH;
import static noice.constant.CreateConstant.HISTORY_SERVICE_PATH;
import static noice.constant.CreateConstant.MAPPER_PATH;
import static noice.constant.CreateConstant.REPOSITORY_PATH;
import static noice.constant.CreateConstant.SERVICE_ASSEMBLER_PATH;
import static noice.constant.CreateConstant.SERVICE_CONVERTER_PATH;
import static noice.constant.CreateConstant.SERVICE_PATH;

@Component
public class ClassBeanFactoryImpl extends ClassFactoryImpl {

    private static final Logger logger = LoggerFactory.getLogger(ClassBeanFactoryImpl.class);

    private static final String BEAN = "bean";

    private DMLBeanBuilder dmlBeanBuilder;

    private DMLBeanTableBuilder.DMLBeanTableDropBuilder dmlBeanTableDropBuilder;

    private DMLBeanTableBuilder.DMLBeanTableAddBuilder dmlBeanTableAddBuilder;

    private DMLBeanFieldAlterBuilder.DMLBeanFieldDropAlterBuilder dmlBeanFieldDropAlterBuilder;

    private DMLBeanFieldAlterBuilder.DMLBeanFieldAddAlterBuilder dmlBeanFieldAddAlterBuilder;

    private PoBeanBuilder poBeanBuilder;

    private DtoBeanBuilder dtoBeanBuilder;

    private VoBeanBuilder voBeanBuilder;

    private MapperBeanBuilder mapperBeanBuilder;

    private RepositoryBeanBuilder repositoryBeanBuilder;

    private ConverterBeanBuilder.ConverterServiceBeanBuilder converterServiceBeanBuilder;

    private ConverterBeanBuilder.ConverterControllerBeanBuilder converterControllerBeanBuilder;

    private AssemblerBeanBuilder.AssemblerServiceBeanBuilder assemblerServiceBeanBuilder;

    private AssemblerBeanBuilder.AssemblerControllerBeanBuilder assemblerControllerBeanBuilder;

    private ServiceBeanBuilder serviceBeanBuilder;

    private ControllerBeanBuilder controllerBeanBuilder;

    @Autowired
    public void setDmlBeanBuilder(DMLBeanBuilder dmlBeanBuilder) {
        this.dmlBeanBuilder = dmlBeanBuilder;
    }

    @Autowired
    public void setPoBeanBuilder(PoBeanBuilder poBeanBuilder) {
        this.poBeanBuilder = poBeanBuilder;
    }

    @Autowired
    public void setDtoBeanBuilder(DtoBeanBuilder dtoBeanBuilder) {
        this.dtoBeanBuilder = dtoBeanBuilder;
    }

    @Autowired
    public void setVoBeanBuilder(VoBeanBuilder voBeanBuilder) {
        this.voBeanBuilder = voBeanBuilder;
    }

    @Autowired
    public void setMapperBeanBuilder(MapperBeanBuilder mapperBeanBuilder) {
        this.mapperBeanBuilder = mapperBeanBuilder;
    }

    @Autowired
    public void setRepositoryBeanBuilder(RepositoryBeanBuilder repositoryBeanBuilder) {
        this.repositoryBeanBuilder = repositoryBeanBuilder;
    }

    @Autowired
    public void setConverterServiceBeanBuilder(ConverterBeanBuilder.ConverterServiceBeanBuilder converterServiceBeanBuilder) {
        this.converterServiceBeanBuilder = converterServiceBeanBuilder;
    }

    @Autowired
    public void setConverterControllerBeanBuilder(ConverterBeanBuilder.ConverterControllerBeanBuilder converterControllerBeanBuilder) {
        this.converterControllerBeanBuilder = converterControllerBeanBuilder;
    }

    @Autowired
    public void setAssemblerServiceBeanBuilder(AssemblerBeanBuilder.AssemblerServiceBeanBuilder assemblerServiceBeanBuilder) {
        this.assemblerServiceBeanBuilder = assemblerServiceBeanBuilder;
    }

    @Autowired
    public void setAssemblerControllerBeanBuilder(AssemblerBeanBuilder.AssemblerControllerBeanBuilder assemblerControllerBeanBuilder) {
        this.assemblerControllerBeanBuilder = assemblerControllerBeanBuilder;
    }

    @Autowired
    public void setServiceBeanBuilder(ServiceBeanBuilder serviceBeanBuilder) {
        this.serviceBeanBuilder = serviceBeanBuilder;
    }

    @Autowired
    public void setControllerBeanBuilder(ControllerBeanBuilder controllerBeanBuilder) {
        this.controllerBeanBuilder = controllerBeanBuilder;
    }

    @Autowired
    public void setDmlBeanTableDropBuilder(DMLBeanTableBuilder.DMLBeanTableDropBuilder dmlBeanTableDropBuilder) {
        this.dmlBeanTableDropBuilder = dmlBeanTableDropBuilder;
    }

    @Autowired
    public void setDmlBeanTableAddBuilder(DMLBeanTableBuilder.DMLBeanTableAddBuilder dmlBeanTableAddBuilder) {
        this.dmlBeanTableAddBuilder = dmlBeanTableAddBuilder;
    }

    @Autowired
    public void setDmlBeanFieldDropAlterBuilder(DMLBeanFieldAlterBuilder.DMLBeanFieldDropAlterBuilder dmlBeanFieldDropAlterBuilder) {
        this.dmlBeanFieldDropAlterBuilder = dmlBeanFieldDropAlterBuilder;
    }

    @Autowired
    public void setDmlBeanFieldAddAlterBuilder(DMLBeanFieldAlterBuilder.DMLBeanFieldAddAlterBuilder dmlBeanFieldAddAlterBuilder) {
        this.dmlBeanFieldAddAlterBuilder = dmlBeanFieldAddAlterBuilder;
    }

    @Override
    public void create() {
        long startTime = System.nanoTime();
        String root = getRoot();
        for (PersistentPo persistentPo : super.findByType(BEAN)) {
            List<PersistentPropertyPo> persistentPropertyPoList = super.findByPersistentId(persistentPo.getId());
            List<Map<String, PersistentPo>> poList = findNtoNAndRelationById(persistentPo.getId());
            if (persistentPo.getStatus()) {
                this.createEntityDML(root, persistentPo, persistentPropertyPoList);
                this.createEntityPO(root, persistentPo, persistentPropertyPoList);
                this.createEntityDTO(root, persistentPo, persistentPropertyPoList, poList);
                this.createEntityVO(root, persistentPo, persistentPropertyPoList, poList);
                this.createMapper(root, persistentPo);
                this.createConverter(root, persistentPo, persistentPropertyPoList);
                this.createAssembler(root, persistentPo, persistentPropertyPoList, poList);
                this.createRepository(root, persistentPo, persistentPropertyPoList);
                this.createService(root, persistentPo, persistentPropertyPoList, poList);
                this.createController(root, persistentPo, poList);
            } else {
//                deleteEntityDML(root, persistentPo, persistentPropertyPoList);
//                deleteEntityPO(root, persistentPo, persistentPropertyPoList);
//                deleteEntityDTO(root, persistentPo, persistentPropertyPoList, NtoNPoList);
//                deleteEntityVO(root, persistentPo, persistentPropertyPoList);
//                deleteMapper(root, persistentPo);
//                deleteConverter(root, persistentPo);
//                deleteRepository(root, persistentPo);
//                deleteService(root, persistentPo);
//                deleteController(root, persistentPo);
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // 转换为毫秒
        logger.info("===============执行耗时：" + duration + " 毫秒");

    }

    @Override
    public void initData() {
//        super.createBeanInterface();
//        super.createMenu();
        for (PersistentPo persistentPo : super.findByType(BEAN)) {
            List<PersistentPropertyPo> persistentPropertyPoList = super.findByPersistentId(persistentPo.getId());
            if (persistentPo.getStatus()) {
//                this.createBeanInterface(persistentPo);
                this.createFormAndTable(persistentPo, persistentPropertyPoList);
            } else {
//                this.deleteBeanInterface(persistentPo);
//                this.deleteFormAndTable(persistentPo, persistentPropertyPoList);
            }
        }
    }

//    private void deleteFormAndTable(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
//    }
//
//    private void deleteBeanInterface(PersistentPo persistentPo) {
//
//    }
//
//
//    private void deleteEntityDML(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
//        BeanUtils.deleteSqlFile(rootPath + ENTITY_PATH + "dml/" + BEAN, dmlBeanBuilder.builder(persistentPo, persistentPropertyPoList, DATABASE).getFileName());
//        this.deleteDataDML(persistentPo, persistentPropertyPoList);
//    }
//
//    private void deleteEntityPO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
//        BeanUtils.deleteJavaFile(rootPath + ENTITY_PATH + "po/" + BEAN, poBeanBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
//    }
//
//    private void deleteEntityDTO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
//        BeanUtils.deleteJavaFile(rootPath + ENTITY_PATH + "dto/" + BEAN, dtoBeanBuilder.builder(persistentPo, persistentPropertyPoList, NtoNPoList).getClassName());
//    }
//
//    private void deleteEntityVO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<PersistentPo> NtoNPoList) {
//        BeanUtils.deleteJavaFile(rootPath + ENTITY_PATH + "vo/" + BEAN, voBeanBuilder.builder(persistentPo, persistentPropertyPoList, NtoNPoList).getClassName());
//    }
//
//
//    private void deleteMapper(String rootPath, PersistentPo persistentPo) {
//        BeanUtils.deleteJavaFile(rootPath + MAPPER_PATH + BEAN, mapperBeanBuilder.builder(persistentPo).getClassName());
//    }
//
//    private void deleteConverter(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
//        BeanUtils.deleteJavaFile(rootPath + SERVICE_CONVERTER_PATH + BEAN, converterServiceBeanBuilder.builder(persistentPo).getClassName());
//        BeanUtils.deleteJavaFile(rootPath + CONTROLLER_CONVERTER_PATH + BEAN, converterControllerBeanBuilder.builder(persistentPo, persistentPropertyPoList).getClassName());
//    }
//
//    private void deleteAssembler(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<PersistentPo> NtoNPoList) {
//        BeanUtils.deleteJavaFile(rootPath + SERVICE_ASSEMBLER_PATH + BEAN, assemblerServiceBeanBuilder.builder(persistentPo, persistentPropertyPoList, NtoNPoList).getClassName());
//        BeanUtils.deleteJavaFile(rootPath + CONTROLLER_ASSEMBLER_PATH + BEAN, assemblerControllerBeanBuilder.builder(persistentPo, persistentPropertyPoList, NtoNPoList).getClassName());
//    }
//
//    private void deleteRepository(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<PersistentPo> NtoNPoList, List<PersistentPo> relationPoList) {
//        BeanUtils.deleteJavaFile(rootPath + REPOSITORY_PATH + BEAN, repositoryBeanBuilder.builder(persistentPo, persistentPropertyPoList, NtoNPoList, relationPoList).getClassName());
//    }
//
//
//    private void deleteService(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<PersistentPo> NtoNPoList, List<PersistentPo> relationPoList) {
//        BeanUtils.deleteJavaFile(rootPath + SERVICE_PATH + BEAN, serviceBeanBuilder.builder(persistentPo, persistentPropertyPoList, NtoNPoList, relationPoList).getClassName());
//    }
//
//    private void deleteController(String rootPath, PersistentPo persistentPo) {
//        AppServicePo appService = getAppService(persistentPo.getAppServiceId());
//        BeanUtils.deleteJavaFile(rootPath + CONTROLLER_PATH + BEAN, controllerBeanBuilder.builder(persistentPo, appService).getClassName());
//    }

    private void createEntityDML(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        dmlBeanBuilder.builder(persistentPo, persistentPropertyPoList, DATABASE);
        try {
            super.createAndSaveHistory(rootPath + ENTITY_PATH + "dml/" + BEAN, rootPath + HISTORY_ENTITY_PATH + BEAN + "/dml",
                    dmlBeanBuilder.getFileName(), dmlBeanBuilder.toString(), "sql");
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
        this.createDataDML(persistentPo, persistentPropertyPoList);
    }

    private void createEntityPO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        poBeanBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + ENTITY_PATH + "po/" + BEAN, rootPath + HISTORY_ENTITY_PATH + BEAN + "/po",
                    poBeanBuilder.getClassName(), poBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createEntityDTO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
        dtoBeanBuilder.builder(persistentPo, persistentPropertyPoList, poList);
        try {
            super.createAndSaveHistory(rootPath + ENTITY_PATH + "dto/" + BEAN, rootPath + HISTORY_ENTITY_PATH + BEAN + "/dto",
                    dtoBeanBuilder.getClassName(), dtoBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createEntityVO(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
        voBeanBuilder.builder(persistentPo, persistentPropertyPoList, poList);
        try {
            super.createAndSaveHistory(rootPath + ENTITY_PATH + "vo/" + BEAN, rootPath + HISTORY_ENTITY_PATH + BEAN + "/vo",
                    voBeanBuilder.getClassName(), voBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createMapper(String rootPath, PersistentPo persistentPo) {
        mapperBeanBuilder.builder(persistentPo);
        try {
            super.createAndSaveHistory(rootPath + MAPPER_PATH + BEAN, rootPath + HISTORY_MAPPER_PATH + BEAN,
                    mapperBeanBuilder.getClassName(), mapperBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createConverter(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        converterServiceBeanBuilder.builder(persistentPo);
        converterControllerBeanBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + SERVICE_CONVERTER_PATH + BEAN, rootPath + HISTORY_SERVICE_CONVERTER_PATH + BEAN,
                    converterServiceBeanBuilder.getClassName(), converterServiceBeanBuilder.toString());
            super.createAndSaveHistory(rootPath + CONTROLLER_CONVERTER_PATH + BEAN, rootPath + HISTORY_CONTROLLER_CONVERTER_PATH + BEAN,
                    converterControllerBeanBuilder.getClassName(), converterControllerBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createAssembler(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
        assemblerServiceBeanBuilder.builder(persistentPo, persistentPropertyPoList, poList);
        assemblerControllerBeanBuilder.builder(persistentPo, persistentPropertyPoList, poList);
        try {
            super.createAndSaveHistory(rootPath + SERVICE_ASSEMBLER_PATH + BEAN, rootPath + HISTORY_SERVICE_ASSEMBLER_PATH + BEAN,
                    assemblerServiceBeanBuilder.getClassName(), assemblerServiceBeanBuilder.toString());
            super.createAndSaveHistory(rootPath + CONTROLLER_ASSEMBLER_PATH + BEAN, rootPath + HISTORY_CONTROLLER_ASSEMBLER_PATH + BEAN,
                    assemblerControllerBeanBuilder.getClassName(), assemblerControllerBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createRepository(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        repositoryBeanBuilder.builder(persistentPo, persistentPropertyPoList);
        try {
            super.createAndSaveHistory(rootPath + REPOSITORY_PATH + BEAN, rootPath + HISTORY_REPOSITORY_PATH + BEAN,
                    repositoryBeanBuilder.getClassName(), repositoryBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createService(String rootPath, PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
        serviceBeanBuilder.builder(persistentPo, persistentPropertyPoList, poList);
        try {
            super.createAndSaveHistory(rootPath + SERVICE_PATH + BEAN, rootPath + HISTORY_SERVICE_PATH + BEAN,
                    serviceBeanBuilder.getClassName(), serviceBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }

    private void createController(String rootPath, PersistentPo persistentPo, List<Map<String, PersistentPo>> poList) {
        AppServicePo appService = getAppService(persistentPo.getAppServiceId());
        controllerBeanBuilder.builder(persistentPo, appService, poList);
        try {
            super.createAndSaveHistory(rootPath + CONTROLLER_PATH + BEAN, rootPath + HISTORY_CONTROLLER_PATH + BEAN,
                    controllerBeanBuilder.getClassName(), controllerBeanBuilder.toString());
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
        }
    }


    private void createDataDML(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String tableName = "t_" + persistentPo.getPersistentCode();
        long tableFlag = SqlRunner.db().selectCount("SELECT COUNT(1) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = {0}", tableName);
        if (tableFlag == 0) {
            SqlRunner.db().insert(dmlBeanTableAddBuilder.builder(persistentPo, persistentPropertyPoList, DATABASE).toString());
        } else {
            logger.info(tableName + ":已存在");
        }
        for (PersistentPropertyPo po : persistentPropertyPoList) {
            String columnName = po.getPersistentPropertyCode();
            long columnFlag = SqlRunner.db().selectCount("SELECT COUNT(1) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = {0} AND COLUMN_NAME = {1}", tableName, columnName);
            if (columnFlag == 0) {
                SqlRunner.db().insert(dmlBeanFieldAddAlterBuilder.builder(po, tableName, DATABASE).toString());
            } else {
                logger.info(tableName + ":" + columnName + ":已存在");
            }
        }
    }

    private void deleteDataDML(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String tableName = "t_" + persistentPo.getPersistentCode();
        long tableFlag = SqlRunner.db().selectCount("SELECT COUNT(1) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = {0}", tableName);
        if (tableFlag == 1) {
            SqlRunner.db().insert(dmlBeanTableDropBuilder.builder(tableName, DATABASE).toString());
        } else {
            logger.info(tableName + ":不存在");
        }
        for (PersistentPropertyPo po : persistentPropertyPoList) {
            String columnName = po.getPersistentPropertyCode();
            long columnFlag = SqlRunner.db().selectCount("SELECT COUNT(1) FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = {0} AND COLUMN_NAME = {1}", tableName, columnName);
            if (columnFlag == 1) {
                SqlRunner.db().insert(dmlBeanFieldDropAlterBuilder.builder(po, tableName, DATABASE).toString());
            } else {
                logger.info(tableName + ":" + columnName + ":不存在");
            }
        }
    }


}
