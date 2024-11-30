package noice.common.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SelectItem {

    private String name;

    private String alias;

    public SelectItem(String name) {
        this.name = name;
    }

    public SelectItem(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

}