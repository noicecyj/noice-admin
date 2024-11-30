package noice.handler.builder.repository.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPo;
import noice.handler.base.FieldBase;
import noice.handler.base.enumType.StatementEnum;
import org.springframework.stereotype.Component;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class RepositoryBeanFieldBuilder extends FieldBase {

    public RepositoryBeanFieldBuilder builder(PersistentPo persistentPo) {
        String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
        this.setFieldStatement(StatementEnum.PRIVATE);
        this.setFieldType(poName + "Mapper");
        this.setFieldName("mapper");
        return this;
    }

    @Override
    public String toString() {
        return "    " + getFieldStatement().getStatement() + " " + getFieldType() + " " + getFieldName() + ";";
    }

}
