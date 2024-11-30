package noice.handler.builder.service.relation;

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
public class ServiceRelationFieldBuilder extends FieldBase {

    @EqualsAndHashCode(callSuper = true)
    @Component
    @Data
    public static class ServiceRelationFieldRepositoryBuilder extends ServiceRelationFieldBuilder {

        public ServiceRelationFieldRepositoryBuilder builder(PersistentPo persistentPo) {
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
    public static class ServiceRelationFieldConverterBuilder extends ServiceRelationFieldBuilder {

        public ServiceRelationFieldConverterBuilder builder(PersistentPo persistentPo) {
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
    public static class ServiceRelationFieldAssemblerBuilder extends ServiceRelationFieldBuilder {

        public ServiceRelationFieldAssemblerBuilder builder(PersistentPo persistentPo) {
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

}
