package noice.handler.builder.repository.relation;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.ClassBase;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class RepositoryRelationBuilder extends ClassBase {

    private PersistentPo persistentPo;

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private RepositoryRelationFieldBuilder repositoryRelationFieldBuilder;

    private RepositoryRelationMethodBuilder.RepositoryRelationSetBuilder repositoryRelationSetBuilder;

    private RepositoryRelationMethodBuilder.RepositoryRelationAddBuilder repositoryRelationAddBuilder;

    private RepositoryRelationMethodBuilder.RepositoryRelationDeleteBuilder repositoryRelationDeleteBuilder;

    private RepositoryRelationMethodBuilder.RepositoryRelationCountBuilder repositoryRelationCountBuilder;

    private RepositoryRelationMethodBuilder.RepositoryRelationFindBuilder.RepositoryRelationFindPoBuilder repositoryRelationFindPoBuilder;

    private RepositoryRelationMethodBuilder.RepositoryRelationFindBuilder.RepositoryRelationFindWrapperBuilder repositoryRelationFindWrapperBuilder;

    private RepositoryRelationMethodBuilder.RepositoryRelationFindListBuilder.RepositoryRelationFindListPoBuilder repositoryRelationFindListPoBuilder;

    private RepositoryRelationMethodBuilder.RepositoryRelationFindListBuilder.RepositoryRelationFindListWrapperBuilder repositoryRelationFindListWrapperBuilder;

    @Autowired
    public void setRepositoryRelationCountBuilder(RepositoryRelationMethodBuilder.RepositoryRelationCountBuilder repositoryRelationCountBuilder) {
        this.repositoryRelationCountBuilder = repositoryRelationCountBuilder;
    }

    @Autowired
    public void setRepositoryRelationFieldBuilder(RepositoryRelationFieldBuilder repositoryRelationFieldBuilder) {
        this.repositoryRelationFieldBuilder = repositoryRelationFieldBuilder;
    }

    @Autowired
    public void setRepositoryRelationSetBuilder(RepositoryRelationMethodBuilder.RepositoryRelationSetBuilder repositoryRelationSetBuilder) {
        this.repositoryRelationSetBuilder = repositoryRelationSetBuilder;
    }

    @Autowired
    public void setRepositoryRelationAddBuilder(RepositoryRelationMethodBuilder.RepositoryRelationAddBuilder repositoryRelationAddBuilder) {
        this.repositoryRelationAddBuilder = repositoryRelationAddBuilder;
    }

    @Autowired
    public void setRepositoryRelationDeleteBuilder(RepositoryRelationMethodBuilder.RepositoryRelationDeleteBuilder repositoryRelationDeleteBuilder) {
        this.repositoryRelationDeleteBuilder = repositoryRelationDeleteBuilder;
    }

    @Autowired
    public void setRepositoryRelationFindPoBuilder(RepositoryRelationMethodBuilder.RepositoryRelationFindBuilder.RepositoryRelationFindPoBuilder repositoryRelationFindPoBuilder) {
        this.repositoryRelationFindPoBuilder = repositoryRelationFindPoBuilder;
    }

    @Autowired
    public void setRepositoryRelationFindWrapperBuilder(RepositoryRelationMethodBuilder.RepositoryRelationFindBuilder.RepositoryRelationFindWrapperBuilder repositoryRelationFindWrapperBuilder) {
        this.repositoryRelationFindWrapperBuilder = repositoryRelationFindWrapperBuilder;
    }

    @Autowired
    public void setRepositoryRelationFindListPoBuilder(RepositoryRelationMethodBuilder.RepositoryRelationFindListBuilder.RepositoryRelationFindListPoBuilder repositoryRelationFindListPoBuilder) {
        this.repositoryRelationFindListPoBuilder = repositoryRelationFindListPoBuilder;
    }

    @Autowired
    public void setRepositoryRelationFindListWrapperBuilder(RepositoryRelationMethodBuilder.RepositoryRelationFindListBuilder.RepositoryRelationFindListWrapperBuilder repositoryRelationFindListWrapperBuilder) {
        this.repositoryRelationFindListWrapperBuilder = repositoryRelationFindListWrapperBuilder;
    }

    public RepositoryRelationBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.persistentPo = persistentPo;
        this.persistentPropertyPoList = persistentPropertyPoList;
        this.setClassName(poName + "Repository");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.repository.relation;");
        this.setClassNote();
        this.setImportList(poName);
        this.setClassAnnotationList();
        this.setExtendsClassName(poName);
        return this;
    }

    public void setImportList(String poName) {
        importPackageList = new ArrayList<>();
        importPackageList.add("import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;");
        importPackageList.add("import noice.entity.po.relation." + poName + "Po;");
        importPackageList.add("import noice.handler.relation.RelationRepository;");
        importPackageList.add("import noice.mapper.relation." + poName + "Mapper;");
        importPackageList.add("import org.jetbrains.annotations.NotNull;");
        importPackageList.add("import org.springframework.beans.factory.annotation.Autowired;");
        importPackageList.add("import org.springframework.stereotype.Repository;");
        importPackageList.add("");
        importPackageList.add("import java.util.List;");
    }

    public void setClassAnnotationList() {
        classAnnotationList = new ArrayList<>();
        classAnnotationList.add("@Repository");
        classAnnotationList.add("@SuppressWarnings(\"unused\")");
    }

    public void setExtendsClassName(String poName) {
        this.extendsClassName = "implements RelationRepository<" + poName + "Po>";
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
        sb.append(getClassStatement().getStatement()).append(" ").append(getClassType().getClassType()).append(" ").append(getClassName()).append(" ").append(getExtendsClassName()).append(" {\n");
        sb.append("\n");
        sb.append(repositoryRelationFieldBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryRelationSetBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryRelationAddBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryRelationDeleteBuilder.builder()).append("\n");
        sb.append("\n");
        sb.append(repositoryRelationCountBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryRelationFindPoBuilder.builder(getPersistentPo(), getPersistentPropertyPoList())).append("\n");
        sb.append("\n");
        sb.append(repositoryRelationFindWrapperBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryRelationFindListPoBuilder.builder(getPersistentPo(), getPersistentPropertyPoList())).append("\n");
        sb.append("\n");
        sb.append(repositoryRelationFindListWrapperBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

}
