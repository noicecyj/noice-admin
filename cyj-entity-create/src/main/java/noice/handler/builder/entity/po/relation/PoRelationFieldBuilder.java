package noice.handler.builder.entity.po.relation;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.FieldBase;
import noice.handler.base.enumType.StatementEnum;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class PoRelationFieldBuilder extends FieldBase {

    public PoRelationFieldBuilder builder(PersistentPropertyPo persistentPropertyPo) {
        this.setFieldAnnotationList(persistentPropertyPo.getPersistentPropertyCode());
        this.setFieldStatement(StatementEnum.PRIVATE);
        this.setFieldType(persistentPropertyPo.getPersistentPropertyType());
        this.setFieldName(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()));
        return this;
    }

    public void setFieldAnnotationList(String persistentPropertyCode) {
        fieldAnnotationList = new ArrayList<>();
        fieldAnnotationList.add("@TableField(\"" + persistentPropertyCode + "\")");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String fieldAnnotation : getFieldAnnotationList()) {
            sb.append("    ").append(fieldAnnotation).append("\n");
        }
        sb.append("    ").append(getFieldStatement().getStatement()).append(" ").append(getFieldType()).append(" ").append(getFieldName()).append(";\n");
        return sb.toString();
    }

}
