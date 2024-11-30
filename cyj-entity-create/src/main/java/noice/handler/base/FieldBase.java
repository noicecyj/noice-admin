package noice.handler.base;

import lombok.Data;
import noice.handler.base.enumType.StatementEnum;

import java.util.List;

@Data
public class FieldBase {

    /**
     * 字段声明
     */
    public StatementEnum fieldStatement;

    /**
     * 字段型
     */
    public String fieldType;

    /**
     * 字段名
     */
    public String fieldName;

    /**
     * 是否静态
     */
    public String staticType;

    /**
     * 是否最终
     */
    public String finalType;

    /**
     * 默认值
     */
    public String defaultValue;

    public List<String> fieldAnnotationList;

}
