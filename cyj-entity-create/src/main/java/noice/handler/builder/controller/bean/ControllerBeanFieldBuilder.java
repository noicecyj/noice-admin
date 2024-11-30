package noice.handler.builder.controller.bean;

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
public class ControllerBeanFieldBuilder extends FieldBase {

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ControllerBeanFieldServiceBuilder extends ControllerBeanFieldBuilder {

        public ControllerBeanFieldServiceBuilder builder(PersistentPo persistentPo) {
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
    public static class ControllerBeanFieldConverterBuilder extends ControllerBeanFieldBuilder {

        public ControllerBeanFieldConverterBuilder builder(PersistentPo persistentPo) {
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
    public static class ControllerBeanFieldAssemblerBuilder extends ControllerBeanFieldBuilder {

        public ControllerBeanFieldAssemblerBuilder builder(PersistentPo persistentPo) {
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
