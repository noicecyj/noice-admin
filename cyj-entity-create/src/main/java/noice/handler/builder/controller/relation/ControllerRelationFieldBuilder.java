package noice.handler.builder.controller.relation;

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
public class ControllerRelationFieldBuilder extends FieldBase {

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ControllerRelationFieldServiceBuilder extends ControllerRelationFieldBuilder {

        public ControllerRelationFieldServiceBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(poName + "Service");
            this.setFieldName("service");
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
    public static class ControllerRelationFieldConverterBuilder extends ControllerRelationFieldBuilder {

        public ControllerRelationFieldConverterBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(poName + "ControllerConverter");
            this.setFieldName("converter");
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
    public static class ControllerRelationFieldAssemblerBuilder extends ControllerRelationFieldBuilder {

        public ControllerRelationFieldAssemblerBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(poName + "ControllerAssembler");
            this.setFieldName("assembler");
            return this;
        }

        @Override
        public String toString() {
            return "    " + getFieldStatement().getStatement() + " " + getFieldType() + " " + getFieldName() + ";";
        }

    }

}
