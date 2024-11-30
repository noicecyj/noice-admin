package noice.handler.base;

import lombok.Data;
import noice.handler.base.enumType.StatementEnum;

import java.util.List;

@Data
public class MethodBase {

    /**
     * 方法声明
     */
    public StatementEnum methodStatement;

    /**
     * 方法返回类型
     */
    public String methodReturnType;

    /**
     * 方法名
     */
    public String methodName;

    /**
     * 方法参数
     */
    public List<String> methodParamSet;

    /**
     * 方法体
     */
    public List<String> methodBody;

    /**
     * 方法返回体
     */
    public String methodReturnBody;

    public List<String> methodAnnotationList;

}