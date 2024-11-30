package noice.handler.builder.assembler.relation;

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
public class AssemblerRelationBuilder extends ClassBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private PersistentPo persistentPo;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class AssemblerServiceRelationBuilder extends AssemblerRelationBuilder {

        public PersistentRepository persistentRepository;

        private AssemblerRelationMethodBuilder.poToDtoBuilder poToDtoBuilder;

        private AssemblerRelationMethodBuilder.poListToDtoListBuilder poListToDtoListBuilder;

        private AssemblerRelationMethodBuilder.poSetToDtoSetBuilder poSetToDtoSetBuilder;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        @Autowired
        public void setPoToDtoBuilder(AssemblerRelationMethodBuilder.poToDtoBuilder poToDtoBuilder) {
            this.poToDtoBuilder = poToDtoBuilder;
        }

        @Autowired
        public void setPoListToDtoListBuilder(AssemblerRelationMethodBuilder.poListToDtoListBuilder poListToDtoListBuilder) {
            this.poListToDtoListBuilder = poListToDtoListBuilder;
        }

        @Autowired
        public void setPoSetToDtoSetBuilder(AssemblerRelationMethodBuilder.poSetToDtoSetBuilder poSetToDtoSetBuilder) {
            this.poSetToDtoSetBuilder = poSetToDtoSetBuilder;
        }

        public AssemblerServiceRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            super.setPersistentPropertyPoList(persistentPropertyPoList);
            super.setPersistentPo(persistentPo);
            this.setClassName(poName + "ServiceAssembler");
            this.setClassType(ClassEnum.INTERFACE);
            this.setClassStatement(StatementEnum.PUBLIC);
            this.setPackageName("package noice.assembler.relation;");
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
            importPackageList.add("import noice.handler.assembler.relation.BaseRelationAssembler;");
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
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseRelationAssembler.class, uses = {" + String.join(", ", poNameList) + "})");
            } else {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseRelationAssembler.class)");
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
            sb.append(poToDtoBuilder.builder(getPersistentPo(), getPersistentPropertyPoList())).append("\n");
            sb.append("\n");
            sb.append(poListToDtoListBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append(poSetToDtoSetBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append("}");
            return sb.toString();
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class AssemblerControllerRelationBuilder extends AssemblerRelationBuilder {

        public PersistentRepository persistentRepository;

        private AssemblerRelationMethodBuilder.dtoToVoBuilder dtoToVoBuilder;

        private AssemblerRelationMethodBuilder.dtoListToVoListBuilder dtoListToVoListBuilder;

        private AssemblerRelationMethodBuilder.dtoSetToVoSetBuilder dtoSetToVoSetBuilder;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        @Autowired
        public void setDtoToVoBuilder(AssemblerRelationMethodBuilder.dtoToVoBuilder dtoToVoBuilder) {
            this.dtoToVoBuilder = dtoToVoBuilder;
        }

        @Autowired
        public void setDtoListToVoListBuilder(AssemblerRelationMethodBuilder.dtoListToVoListBuilder dtoListToVoListBuilder) {
            this.dtoListToVoListBuilder = dtoListToVoListBuilder;
        }

        @Autowired
        public void setDtoSetToVoSetBuilder(AssemblerRelationMethodBuilder.dtoSetToVoSetBuilder dtoSetToVoSetBuilder) {
            this.dtoSetToVoSetBuilder = dtoSetToVoSetBuilder;
        }

        public AssemblerControllerRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            super.setPersistentPropertyPoList(persistentPropertyPoList);
            super.setPersistentPo(persistentPo);
            this.setClassName(poName + "ControllerAssembler");
            this.setClassType(ClassEnum.INTERFACE);
            this.setClassStatement(StatementEnum.PUBLIC);
            this.setPackageName("package noice.assembler.relation;");
            this.setClassNote();
            this.setImportList(poName);
            this.setClassAnnotationList();
            this.setExtendsClassName(poName);
            return this;
        }

        public void setImportList(String poName) {
            importPackageList = new ArrayList<>();
            List<String> poNameList = new ArrayList<>();
            for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                    PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                    String relationPo = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                    if (!poNameList.contains(relationPo)) {
                        importPackageList.add("import noice.assembler.bean." + relationPo + "ServiceAssembler;");
                        poNameList.add(relationPo);
                    }
                }
            }
            importPackageList.add("import noice.entity.dto.relation." + poName + "Dto;");
            importPackageList.add("import noice.entity.vo.relation." + poName + "Vo;");
            importPackageList.add("import noice.handler.assembler.relation.BaseRelationAssembler;");
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
                    String relationPo = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode())) + "ServiceAssembler.class";
                    if (!poNameList.contains(relationPo)) {
                        poNameList.add(relationPo);
                    }
                }
            }
            if (CollUtil.isNotEmpty(poNameList)) {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseRelationAssembler.class, uses = {" + String.join(", ", poNameList) + "})");
            } else {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseRelationAssembler.class)");
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
            sb.append(dtoToVoBuilder.builder(getPersistentPo(), getPersistentPropertyPoList())).append("\n");
            sb.append("\n");
            sb.append(dtoListToVoListBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append(dtoSetToVoSetBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append("}");
            return sb.toString();
        }

    }

}
