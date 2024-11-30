package noice.handler.builder.entity.dto.bean;

import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.base.FieldBase;
import noice.handler.base.enumType.StatementEnum;
import org.springframework.stereotype.Component;

@EqualsAndHashCode(callSuper = true)
@Component
@Data
public class DtoBeanFieldBuilder extends FieldBase {

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class DtoBeanCommonFieldBuilder extends DtoBeanFieldBuilder {

        public DtoBeanFieldBuilder builder(PersistentPropertyPo persistentPropertyPo) {
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(persistentPropertyPo.getPersistentPropertyType());
            this.setFieldName(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()));
            return this;
        }

        @Override
        public String toString() {
            return "    " + getFieldStatement().getStatement() + " " + getFieldType() + " " + getFieldName() + ";";
        }

    }

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class DtoBeanListFieldBuilder extends DtoBeanFieldBuilder {

        public DtoBeanListFieldBuilder builder(PersistentPropertyPo persistentPropertyPo) {
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(persistentPropertyPo.getPersistentPropertyType());
            this.setFieldName(StrUtil.toCamelCase(persistentPropertyPo.getPersistentPropertyCode()));
            return this;
        }

        @Override
        public String toString() {
            return "    " + getFieldStatement().getStatement() + " List<" + getFieldType() + "> " + getFieldName() + "List;";
        }

    }

}
