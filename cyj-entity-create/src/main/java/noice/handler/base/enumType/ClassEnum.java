package noice.handler.base.enumType;

import lombok.Getter;

@Getter
public enum ClassEnum {

    CLASS("class", "一般类"),
    ENUM("enum", "枚举类"),
    INTERFACE("interface", "接口类"),
    ABSTRACT("abstract class", "抽象类"),
    ANNOTATION("@interface", "注解类");

    private final String classType;
    private final String explanation;

    ClassEnum(String classType, String explanation) {
        this.classType = classType;
        this.explanation = explanation;
    }

}
