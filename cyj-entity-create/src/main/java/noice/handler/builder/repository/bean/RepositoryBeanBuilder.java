package noice.handler.builder.repository.bean;

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
public class RepositoryBeanBuilder extends ClassBase {

    private PersistentPo persistentPo;

    private List<PersistentPropertyPo> persistentPropertyPoList;

    private RepositoryBeanFieldBuilder repositoryBeanFieldBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanSetBuilder repositoryBeanSetBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanAddBuilder.RepositoryBeanAddOneBuilder repositoryBeanAddOneBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanAddBuilder.RepositoryBeanAddBatchBuilder repositoryBeanAddBatchBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanDeleteBuilder.RepositoryBeanDeleteByIdBuilder repositoryBeanDeleteByIdBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanDeleteBuilder.RepositoryBeanDeleteWrapperBuilder repositoryBeanDeleteWrapperBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanDeleteBuilder.RepositoryBeanDeleteByIdsBuilder repositoryBeanDeleteByIdsBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanCountBuilder repositoryBeanCountBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanUpdateBuilder.RepositoryBeanUpdateOneBuilder repositoryBeanUpdateOneBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanUpdateBuilder.RepositoryBeanUpdateAndAddBuilder repositoryBeanUpdateAndAddBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanUpdateBuilder.RepositoryBeanUpdateBatchBuilder repositoryBeanUpdateBatchBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanFindBuilder.RepositoryBeanFindIdBuilder repositoryBeanFindIdBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanFindBuilder.RepositoryBeanFindWrapperBuilder repositoryBeanFindWrapperBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanFindListBuilder.RepositoryBeanFindListIdsBuilder repositoryBeanFindListIdsBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanFindListBuilder.RepositoryBeanFindListWrapperBuilder repositoryBeanFindListWrapperBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanFindPageBuilder.RepositoryBeanFindPageWrapperBuilder repositoryBeanFindPageWrapperBuilder;

    private RepositoryBeanMethodBuilder.RepositoryBeanFindPageBuilder.RepositoryBeanFindPagePoBuilder repositoryBeanFindPagePoBuilder;

    @Autowired
    public void setRepositoryBeanCountBuilder(RepositoryBeanMethodBuilder.RepositoryBeanCountBuilder repositoryBeanCountBuilder) {
        this.repositoryBeanCountBuilder = repositoryBeanCountBuilder;
    }

    @Autowired
    public void setRepositoryBeanFieldBuilder(RepositoryBeanFieldBuilder repositoryBeanFieldBuilder) {
        this.repositoryBeanFieldBuilder = repositoryBeanFieldBuilder;
    }

    @Autowired
    public void setRepositoryBeanSetBuilder(RepositoryBeanMethodBuilder.RepositoryBeanSetBuilder repositoryBeanSetBuilder) {
        this.repositoryBeanSetBuilder = repositoryBeanSetBuilder;
    }

    @Autowired
    public void setRepositoryBeanAddOneBuilder(RepositoryBeanMethodBuilder.RepositoryBeanAddBuilder.RepositoryBeanAddOneBuilder repositoryBeanAddOneBuilder) {
        this.repositoryBeanAddOneBuilder = repositoryBeanAddOneBuilder;
    }

    @Autowired
    public void setRepositoryBeanAddBatchBuilder(RepositoryBeanMethodBuilder.RepositoryBeanAddBuilder.RepositoryBeanAddBatchBuilder repositoryBeanAddBatchBuilder) {
        this.repositoryBeanAddBatchBuilder = repositoryBeanAddBatchBuilder;
    }

    @Autowired
    public void setRepositoryBeanDeleteByIdBuilder(RepositoryBeanMethodBuilder.RepositoryBeanDeleteBuilder.RepositoryBeanDeleteByIdBuilder repositoryBeanDeleteByIdBuilder) {
        this.repositoryBeanDeleteByIdBuilder = repositoryBeanDeleteByIdBuilder;
    }

    @Autowired
    public void setRepositoryBeanDeleteWrapperBuilder(RepositoryBeanMethodBuilder.RepositoryBeanDeleteBuilder.RepositoryBeanDeleteWrapperBuilder repositoryBeanDeleteWrapperBuilder) {
        this.repositoryBeanDeleteWrapperBuilder = repositoryBeanDeleteWrapperBuilder;
    }

    @Autowired
    public void setRepositoryBeanDeleteByIdsBuilder(RepositoryBeanMethodBuilder.RepositoryBeanDeleteBuilder.RepositoryBeanDeleteByIdsBuilder repositoryBeanDeleteByIdsBuilder) {
        this.repositoryBeanDeleteByIdsBuilder = repositoryBeanDeleteByIdsBuilder;
    }

    @Autowired
    public void setRepositoryBeanUpdateOneBuilder(RepositoryBeanMethodBuilder.RepositoryBeanUpdateBuilder.RepositoryBeanUpdateOneBuilder repositoryBeanUpdateOneBuilder) {
        this.repositoryBeanUpdateOneBuilder = repositoryBeanUpdateOneBuilder;
    }

    @Autowired
    public void setRepositoryBeanUpdateAndAddBuilder(RepositoryBeanMethodBuilder.RepositoryBeanUpdateBuilder.RepositoryBeanUpdateAndAddBuilder repositoryBeanUpdateAndAddBuilder) {
        this.repositoryBeanUpdateAndAddBuilder = repositoryBeanUpdateAndAddBuilder;
    }

    @Autowired
    public void setRepositoryBeanUpdateBatchBuilder(RepositoryBeanMethodBuilder.RepositoryBeanUpdateBuilder.RepositoryBeanUpdateBatchBuilder repositoryBeanUpdateBatchBuilder) {
        this.repositoryBeanUpdateBatchBuilder = repositoryBeanUpdateBatchBuilder;
    }

    @Autowired
    public void setRepositoryBeanFindIdBuilder(RepositoryBeanMethodBuilder.RepositoryBeanFindBuilder.RepositoryBeanFindIdBuilder repositoryBeanFindIdBuilder) {
        this.repositoryBeanFindIdBuilder = repositoryBeanFindIdBuilder;
    }

    @Autowired
    public void setRepositoryBeanFindWrapperBuilder(RepositoryBeanMethodBuilder.RepositoryBeanFindBuilder.RepositoryBeanFindWrapperBuilder repositoryBeanFindWrapperBuilder) {
        this.repositoryBeanFindWrapperBuilder = repositoryBeanFindWrapperBuilder;
    }

    @Autowired
    public void setRepositoryBeanFindListIdsBuilder(RepositoryBeanMethodBuilder.RepositoryBeanFindListBuilder.RepositoryBeanFindListIdsBuilder repositoryBeanFindListIdsBuilder) {
        this.repositoryBeanFindListIdsBuilder = repositoryBeanFindListIdsBuilder;
    }

    @Autowired
    public void setRepositoryBeanFindListWrapperBuilder(RepositoryBeanMethodBuilder.RepositoryBeanFindListBuilder.RepositoryBeanFindListWrapperBuilder repositoryBeanFindListWrapperBuilder) {
        this.repositoryBeanFindListWrapperBuilder = repositoryBeanFindListWrapperBuilder;
    }

    @Autowired
    public void setRepositoryBeanFindPageWrapperBuilder(RepositoryBeanMethodBuilder.RepositoryBeanFindPageBuilder.RepositoryBeanFindPageWrapperBuilder repositoryBeanFindPageWrapperBuilder) {
        this.repositoryBeanFindPageWrapperBuilder = repositoryBeanFindPageWrapperBuilder;
    }

    @Autowired
    public void setRepositoryBeanFindPagePoBuilder(RepositoryBeanMethodBuilder.RepositoryBeanFindPageBuilder.RepositoryBeanFindPagePoBuilder repositoryBeanFindPagePoBuilder) {
        this.repositoryBeanFindPagePoBuilder = repositoryBeanFindPagePoBuilder;
    }

    public RepositoryBeanBuilder builder(PersistentPo persistentPo, List<PersistentPropertyPo> persistentPropertyPoList) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.persistentPo = persistentPo;
        this.persistentPropertyPoList = persistentPropertyPoList;
        this.setClassName(poName + "Repository");
        this.setClassType(ClassEnum.CLASS);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.repository.bean;");
        this.setClassNote();
        this.setImportList(poName);
        this.setClassAnnotationList();
        this.setExtendsClassName(poName);
        return this;
    }

    public void setImportList(String poName) {
        importPackageList = new ArrayList<>();
        importPackageList.add("import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;");
        importPackageList.add("import com.baomidou.mybatisplus.core.metadata.IPage;");
        importPackageList.add("import noice.common.contants.UserContext;");
        importPackageList.add("import noice.entity.po.bean." + poName + "Po;");
        importPackageList.add("import noice.handler.bean.BeanRepository;");
        importPackageList.add("import noice.mapper.bean." + poName + "Mapper;");
        importPackageList.add("import org.jetbrains.annotations.NotNull;");
        importPackageList.add("import org.springframework.beans.factory.annotation.Autowired;");
        importPackageList.add("import org.springframework.stereotype.Repository;");
        importPackageList.add("");
        importPackageList.add("import java.util.List;");
        importPackageList.add("");
        importPackageList.add("import static noice.common.contants.Constant.USER_ID;");
    }

    public void setClassAnnotationList() {
        classAnnotationList = new ArrayList<>();
        classAnnotationList.add("@Repository");
        classAnnotationList.add("@SuppressWarnings(\"unused\")");
    }

    public void setExtendsClassName(String poName) {
        this.extendsClassName = "implements BeanRepository<" + poName + "Po>";
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
        sb.append(repositoryBeanFieldBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanSetBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanAddOneBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanAddBatchBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanDeleteByIdBuilder.builder()).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanDeleteWrapperBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanDeleteByIdsBuilder.builder()).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanUpdateOneBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanUpdateAndAddBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanUpdateBatchBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanCountBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanFindIdBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanFindWrapperBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanFindListIdsBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanFindListWrapperBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanFindPageWrapperBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append(repositoryBeanFindPagePoBuilder.builder(getPersistentPo())).append("\n");
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

}
