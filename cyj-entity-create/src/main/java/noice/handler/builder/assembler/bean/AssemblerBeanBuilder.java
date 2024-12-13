package noice.handler.builder.assembler.bean;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.ClassBase;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;
import noice.repository.bean.PersistentPropertyRepository;
import noice.repository.bean.PersistentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class AssemblerBeanBuilder extends ClassBase {

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private PersistentPo persistentPo;

    private List<Map<String, PersistentPo>> poList;

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class AssemblerServiceBeanBuilder extends AssemblerBeanBuilder {

        public PersistentRepository persistentRepository;

        private PersistentPropertyRepository persistentPropertyRepository;

        private AssemblerBeanMethodBuilder.poToDtoBuilder poToDtoBuilder;

        private AssemblerBeanMethodBuilder.poToDtoNtoNBuilder poToDtoNtoNBuilder;

        private AssemblerBeanMethodBuilder.poListToDtoListBuilder poListToDtoListBuilder;

        private AssemblerBeanMethodBuilder.poSetToDtoSetBuilder poSetToDtoSetBuilder;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        @Autowired
        public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
            this.persistentPropertyRepository = persistentPropertyRepository;
        }

        @Autowired
        public void setPoToDtoBuilder(AssemblerBeanMethodBuilder.poToDtoBuilder poToDtoBuilder) {
            this.poToDtoBuilder = poToDtoBuilder;
        }

        @Autowired
        public void setPoToDtoNtoNBuilder(AssemblerBeanMethodBuilder.poToDtoNtoNBuilder poToDtoNtoNBuilder) {
            this.poToDtoNtoNBuilder = poToDtoNtoNBuilder;
        }

        @Autowired
        public void setPoListToDtoListBuilder(AssemblerBeanMethodBuilder.poListToDtoListBuilder poListToDtoListBuilder) {
            this.poListToDtoListBuilder = poListToDtoListBuilder;
        }

        @Autowired
        public void setPoSetToDtoSetBuilder(AssemblerBeanMethodBuilder.poSetToDtoSetBuilder poSetToDtoSetBuilder) {
            this.poSetToDtoSetBuilder = poSetToDtoSetBuilder;
        }

        public AssemblerServiceBeanBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            super.poList = poList;
            super.setPersistentPropertyPoList(persistentPropertyPoList);
            super.setPersistentPo(persistentPo);
            this.setClassName(poName + "ServiceAssembler");
            this.setClassType(ClassEnum.INTERFACE);
            this.setClassStatement(StatementEnum.PUBLIC);
            this.setPackageName("package noice.assembler.bean;");
            this.setClassNote();
            this.setImportList(poName);
            this.setClassAnnotationList();
            this.setExtendsClassName(poName);
            return this;
        }

        public void setImportList(String poName) {
            importPackageList = new ArrayList<>();

            importPackageList.add("import noice.entity.dto.bean." + poName + "Dto;");
            List<String> poNameList = new ArrayList<>();
            for (Map<String, PersistentPo> NtoNMap : getPoList()) {
                String NtoNpoName = StrUtil.upperFirst(StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode()));
                if (!poNameList.contains(NtoNpoName)) {
                    importPackageList.add("import noice.entity.po.bean." + NtoNpoName + "Po;");
                    poNameList.add(NtoNpoName);
                }
            }
            importPackageList.add("import noice.entity.po.bean." + poName + "Po;");
            importPackageList.add("import noice.handler.assembler.bean.BaseBeanAssembler;");
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
            importPackageList.add("import org.springframework.context.annotation.Primary;");
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
            classAnnotationList.add("@Primary");
            if (CollUtil.isNotEmpty(poNameList)) {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseBeanAssembler.class, uses = {" + String.join(", ", poNameList) + "})");
            } else {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseBeanAssembler.class)");
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
            if (!getPoList().isEmpty()) {
                sb.append(poToDtoNtoNBuilder.builder(getPersistentPo(), getPersistentPropertyPoList(), getPoList())).append("\n");
                sb.append("\n");
            }
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
    public static class AssemblerControllerBeanBuilder extends AssemblerBeanBuilder {

        public PersistentRepository persistentRepository;

        private AssemblerBeanMethodBuilder.dtoToVoBuilder dtoToVoBuilder;

        private AssemblerBeanMethodBuilder.dtoToVoNtoNBuilder dtoToVoNtoNBuilder;

        private AssemblerBeanMethodBuilder.dtoListToVoListBuilder dtoListToVoListBuilder;

        private AssemblerBeanMethodBuilder.dtoSetToVoSetBuilder dtoSetToVoSetBuilder;

        @Autowired
        public void setPersistentRepository(PersistentRepository persistentRepository) {
            this.persistentRepository = persistentRepository;
        }

        @Autowired
        public void setDtoToVoBuilder(AssemblerBeanMethodBuilder.dtoToVoBuilder dtoToVoBuilder) {
            this.dtoToVoBuilder = dtoToVoBuilder;
        }

        @Autowired
        public void setDtoToVoNtoNBuilder(AssemblerBeanMethodBuilder.dtoToVoNtoNBuilder dtoToVoNtoNBuilder) {
            this.dtoToVoNtoNBuilder = dtoToVoNtoNBuilder;
        }

        @Autowired
        public void setDtoListToVoListBuilder(AssemblerBeanMethodBuilder.dtoListToVoListBuilder dtoListToVoListBuilder) {
            this.dtoListToVoListBuilder = dtoListToVoListBuilder;
        }

        @Autowired
        public void setDtoSetToVoSetBuilder(AssemblerBeanMethodBuilder.dtoSetToVoSetBuilder dtoSetToVoSetBuilder) {
            this.dtoSetToVoSetBuilder = dtoSetToVoSetBuilder;
        }

        public AssemblerControllerBeanBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList, List<Map<String, PersistentPo>> poList) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            super.poList = poList;
            super.setPersistentPropertyPoList(persistentPropertyPoList);
            super.setPersistentPo(persistentPo);
            this.setClassName(poName + "ControllerAssembler");
            this.setClassType(ClassEnum.INTERFACE);
            this.setClassStatement(StatementEnum.PUBLIC);
            this.setPackageName("package noice.assembler.bean;");
            this.setClassNote();
            this.setImportList(poName);
            this.setClassAnnotationList();
            this.setExtendsClassName(poName);
            return this;
        }

        public void setImportList(String poName) {
            importPackageList = new ArrayList<>();
            List<String> poNameList = new ArrayList<>();
            for (Map<String, PersistentPo> NtoNMap : getPoList()) {
                String NtoNpoName = StrUtil.upperFirst(StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode()));
                if (!poNameList.contains(NtoNpoName)) {
                    importPackageList.add("import noice.entity.dto.bean." + NtoNpoName + "Dto;");
                    poNameList.add(NtoNpoName);
                }
            }
            importPackageList.add("import noice.entity.dto.bean." + poName + "Dto;");
            importPackageList.add("import noice.entity.vo.bean." + poName + "Vo;");
            importPackageList.add("import noice.handler.assembler.bean.BaseBeanAssembler;");
            for (PersistentPropertyPo persistentPropertyPo : getPersistentPropertyPoList()) {
                if (StrUtil.isNotEmpty(persistentPropertyPo.getRelationPersistentId())) {
                    PersistentPo persistentPo = persistentRepository.find(persistentPropertyPo.getRelationPersistentId());
                    String relationPo = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
                    poNameList.add(relationPo);
                }
            }
            importPackageList.add("import org.mapstruct.Mapper;");
            if (CollUtil.isNotEmpty(poNameList)) {
                importPackageList.add("import org.mapstruct.Mapping;");
            }
            importPackageList.add("import org.springframework.context.annotation.Primary;");
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
            for (Map<String, PersistentPo> NtoNMap : getPoList()) {
                String underNtoNPoName = StrUtil.toCamelCase(NtoNMap.get("NtoN").getPersistentCode());
                String NtoNpoName = StrUtil.upperFirst(underNtoNPoName) + "ServiceAssembler.class";
                if (!poNameList.contains(NtoNpoName)) {
                    poNameList.add(NtoNpoName);
                }
            }
            classAnnotationList.add("@Primary");
            if (CollUtil.isNotEmpty(poNameList)) {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseBeanAssembler.class, uses = {" + String.join(", ", poNameList) + "})");
            } else {
                classAnnotationList.add("@Mapper(componentModel = \"spring\", config = BaseBeanAssembler.class)");
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
            sb.append(dtoToVoBuilder.builder(getPersistentPo(), getPersistentPropertyPoList(), getPoList())).append("\n");
            sb.append("\n");
            if (!getPoList().isEmpty()) {
                sb.append(dtoToVoNtoNBuilder.builder(getPersistentPo(), getPersistentPropertyPoList(), getPoList())).append("\n");
                sb.append("\n");
            }
            sb.append(dtoListToVoListBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append(dtoSetToVoSetBuilder.builder(getPersistentPo())).append("\n");
            sb.append("\n");
            sb.append("}");
            return sb.toString();
        }

    }

}
