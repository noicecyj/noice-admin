package noice.handler.builder.mapper.relation;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.handler.base.ClassBase;
import noice.handler.base.enumType.ClassEnum;
import noice.handler.base.enumType.StatementEnum;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class MapperRelationBuilder extends ClassBase {

    public MapperRelationBuilder builder(PersistentPo persistentPo) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.setClassName(poName + "Mapper");
        this.setClassType(ClassEnum.INTERFACE);
        this.setClassStatement(StatementEnum.PUBLIC);
        this.setPackageName("package noice.mapper.relation;");
        this.setClassNote();
        this.setImportList(poName);
        this.setClassAnnotationList();
        this.setExtendsClassName(poName);
        return this;
    }

    public void setImportList(String poName) {
        importPackageList = new ArrayList<>();
        importPackageList.add("import com.baomidou.mybatisplus.core.mapper.BaseMapper;");
        importPackageList.add("import noice.entity.po.relation." + poName + "Po;");
        importPackageList.add("import org.apache.ibatis.annotations.Mapper;");

    }

    public void setClassAnnotationList() {
        classAnnotationList = new ArrayList<>();
        classAnnotationList.add("@Mapper");
    }

    public void setExtendsClassName(String poName) {
        this.extendsClassName = "extends BaseMapper<" + poName + "Po>";
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
        sb.append("}");
        return sb.toString();
    }

}
