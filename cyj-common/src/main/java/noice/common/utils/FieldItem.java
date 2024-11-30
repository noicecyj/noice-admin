package noice.common.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FieldItem {

    private String name;
    private Object value;
    private QueryMethod queryMethod;

    public FieldItem(String name, Object value) {
        this.name = name;
        this.value = value;
        this.queryMethod = QueryMethod.eq;
    }

    public FieldItem(String name, Object value, QueryMethod queryMethod) {
        this.name = name;
        this.value = value;
        this.queryMethod = queryMethod;
    }

}