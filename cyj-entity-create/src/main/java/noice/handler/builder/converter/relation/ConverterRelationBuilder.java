package noice.handler.builder.converter.relation;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.ClassBase;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;
import noice.repository.bean.PersistentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class ConverterRelationBuilder extends ClassBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private PersistentPo persistentPo;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ConverterServiceRelationBuilder extends ConverterRelationBuilder {

        private ConverterRelationMethodBuilder.dtoToPoBuilder dtoToPoBuilder;

        private ConverterRelationMethodBuilder.dtoListToPoListBuilder dtoListToPoListBuilder;

        private ConverterRelationMethodBuilder.dtoSetToPoSetBuilder dtoSetToPoSetBuilder;

        @Autowired
        public void setDtoToPoBuilder(ConverterRelationMethodBuilder.dtoToPoBuilder dtoToPoBuilder) {
            this.dtoToPoBuilder = dtoToPoBuilder;
        }

        @Autowired
        public void setDtoListToPoListBuilder(ConverterRelationMethodBuilder.dtoListToPoListBuilder dtoListToPoListBuilder) {
            this.dtoListToPoListBuilder = dtoListToPoListBuilder;
        }

        @Autowired
        public void setDtoSetToPoSetBuilder(ConverterRelationMethodBuilder.dtoSetToPoSetBuilder dtoSetToPoSetBuilder) {
            this.dtoSetToPoSetBuilder = dtoSetToPoSetBuilder;
        }

        public ConverterServiceRelationBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            super.setPersistentPo(persistentPo);
            this.setClassName(poName + "ServiceConverter");
            this.setClassType(ClassEnum.INTERFACE);
            this.setClassStatement(StatementEnum.PUBLIC);
            this.setPackageName("package noice.converter.relation;");
            this.setClassNote();
            this.setImportList(poName);
            this.setClassAnnotationList();
            this.setExtendsClassName(poName);
            return this;
        }

        public void setImportList(String poName) {
            importPackageList = new ArrayList<>();
            importPackageList.add("import noice.entity.dto.relation." + poName + "Dto;");
            importPackageList.add("import noice.entity.po.relation." + poName + "Po;");
            importPackageList.add("import noice.handler.converter.relation.BaseRelationConverter;");
            importPackageList.add("import org.mapstruct.Mapper;");
            importPackageList.add("");
            importPackageList.add("import java.util.List;");
            importPackageList.add("import java.util.Set;");

        }

        public void setClassAnnotationList() {
            classAnnotationList = new ArrayList<>();
            classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseRelationConverter.class)");
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getPackageName()).append("\n");
            sb.append("\n");
            List<String> importList = getImportPackageList();
            for (String importStr : importList) {
                sb.append(importStr).append("\n");
            }
            sb.append("\n");
            List<String> classNoteList = getClassNote();
            for (String classNote : classNoteList) {
                sb.append(classNote).append("\n");
            }
            List<String> classAnnotationList = getClassAnnotationList();
            for (String classAnnotation : classAnnotationList) {
                sb.append(classAnnotation).append("\n");
            }
            sb.append(getClassStatement().getStatement()).append(" ").append(getClassType().getClassType()).append(" ").append(getClassName()).append(" {\n");
            sb.append("\n");
            sb.append(dtoToPoBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append(dtoListToPoListBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append(dtoSetToPoSetBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append("}");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ConverterControllerRelationBuilder extends ConverterRelationBuilder {

        public PersistentRepository persistentRepository;

        private ConverterRelationMethodBuilder.voToDtoBuilder voToDtoBuilder;

        private ConverterRelationMethodBuilder.voListToDtoListBuilder voListToDtoListBuilder;

        private ConverterRelationMethodBuilder.voSetToDtoSetBuilder voSetToDtoSetBuilder;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        @Autowired
        public void setVoToDtoBuilder(ConverterRelationMethodBuilder.voToDtoBuilder voToDtoBuilder) {
            this.voToDtoBuilder = voToDtoBuilder;
        }

        @Autowired
        public void setVoListToDtoListBuilder(ConverterRelationMethodBuilder.voListToDtoListBuilder voListToDtoListBuilder) {
            this.voListToDtoListBuilder = voListToDtoListBuilder;
        }

        @Autowired
        public void setVoSetToDtoSetBuilder(ConverterRelationMethodBuilder.voSetToDtoSetBuilder voSetToDtoSetBuilder) {
            this.voSetToDtoSetBuilder = voSetToDtoSetBuilder;
        }

        public ConverterControllerRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            super.setPersistentPropertyPoList(persistentPropertyPoList);
            super.setPersistentPo(persistentPo);
            this.setClassName(poName + "ControllerConverter");
            this.setClassType(ClassEnum.INTERFACE);
            this.setClassStatement(StatementEnum.PUBLIC);
            this.setPackageName("package noice.converter.relation;");
            this.setClassNote();
            this.setImportList(poName);
            this.setClassAnnotationList();
            this.setExtendsClassName(poName);
            return this;
        }

        public void setImportList(String poName) {
            importPackageList = new ArrayList<>();
            importPackageList.add("import noice.entity.dto.relation." + poName + "Dto;");
            importPackageList.add("import noice.entity.vo.relation." + poName + "Vo;");
            importPackageList.add("import noice.handler.converter.relation.BaseRelationConverter;");
            List<String> poNameList = new ArrayList<>();
            for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                    PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                    String relationPo = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                    if (!poNameList.contains(relationPo)) {
                        importPackageList.add("import noice.repository.bean." + relationPo + "Repository;");
                        poNameList.add(relationPo);
                    }
                }
            }
            importPackageList.add("import org.mapstruct.Mapper;");
            if (CollUtil.isNotEmpty(poNameList)) {
                importPackageList.add("import org.mapstruct.Mapping;");
            }
            importPackageList.add("");
            importPackageList.add("import java.util.List;");
            importPackageList.add("import java.util.Set;");

        }

        public void setClassAnnotationList() {
            classAnnotationList = new ArrayList<>();
            List<String> poNameList = new ArrayList<>();
            for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                    PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                    String relationPo = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode())) + "Repository.class";
                    if (!poNameList.contains(relationPo)) {
                        poNameList.add(relationPo);
                    }
                }
            }
            if (CollUtil.isNotEmpty(poNameList)) {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseRelationConverter.class, uses = {" + String.join(", ", poNameList) + "})");
            } else {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseRelationConverter.class)");
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getPackageName()).append("\n");
            sb.append("\n");
            List<String> importList = getImportPackageList();
            for (String importStr : importList) {
                sb.append(importStr).append("\n");
            }
            sb.append("\n");
            List<String> classNoteList = getClassNote();
            for (String classNote : classNoteList) {
                sb.append(classNote).append("\n");
            }
            List<String> classAnnotationList = getClassAnnotationList();
            for (String classAnnotation : classAnnotationList) {
                sb.append(classAnnotation).append("\n");
            }
            sb.append(getClassStatement().getStatement()).append(" ").append(getClassType().getClassType()).append(" ").append(getClassName()).append(" {\n");
            sb.append("\n");
            sb.append(voToDtoBuilder.builder(getPersistentPo(), getPersistentPropertyPoList())).append("\n");
            sb.append("\n");
            sb.append(voListToDtoListBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append(voSetToDtoSetBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append("}");
            return sb.toString();
        }

    }

}
