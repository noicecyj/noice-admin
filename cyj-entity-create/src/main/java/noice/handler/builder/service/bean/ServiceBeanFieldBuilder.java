package noice.handler.builder.service.bean;

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
public class ServiceBeanFieldBuilder extends FieldBase {

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceBeanFieldRepositoryBuilder extends ServiceBeanFieldBuilder {

        public ServiceBeanFieldRepositoryBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(poName + "Repository");
            this.setFieldName("repository");
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
    public static class ServiceBeanFieldConverterBuilder extends ServiceBeanFieldBuilder {

        public ServiceBeanFieldConverterBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(poName + "ServiceConverter");
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
    public static class ServiceBeanFieldAssemblerBuilder extends ServiceBeanFieldBuilder {

        public ServiceBeanFieldAssemblerBuilder builder(PersistentPo persistentPo) {
            String poName = StrUtil.upperFirst(StrUtil.toCamelCase(persistentPo.getPersistentCode()));
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(poName + "ServiceAssembler");
            this.setFieldName("assembler");
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
    public static class ServiceBeanRelationFieldBuilder extends ServiceBeanFieldBuilder {

        public ServiceBeanRelationFieldBuilder builder(PersistentPo persistentPo) {
            String underPoName = StrUtil.toCamelCase(persistentPo.getPersistentCode());
            String poName = StrUtil.upperFirst(underPoName);
            this.setFieldStatement(StatementEnum.PRIVATE);
            this.setFieldType(poName + "Repository");
            this.setFieldName(underPoName + "Repository");
            return this;
        }

        @Override
        public String toString() {
            return "    " + getFieldStatement().getStatement() + " " + getFieldType() + " " + getFieldName() + ";";
        }

    }

}
