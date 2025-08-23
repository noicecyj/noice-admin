package noice.handler.base.enumType;

import lombok.Getter;

@Getter
public enum StatementEnum {

    PUBLIC("public", "公开"),
    PRIVATE("private", "私有"),
    PROTECTED("protected", "保护"),
    DEFAULT("default", "默认");

    private final String statement;
    private final String explanation;

    StatementEnum(String statement, String explanation) {
        this.statement = statement;
        this.explanation = explanation;
    }

}
