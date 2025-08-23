package noice.assembler;

import org.mapstruct.Named;
import org.springframework.stereotype.Component;

/**
 * @author Noice
 */
@Component
public class TableAndFormAndUrlServiceAssemblerComponent {

    @Named("catalogDictionaryCodeToValue")
    public Object catalogDictionaryCodeToValue(String value) {
        if ("true".equals(value) || "yes".equals(value) || "1".equals(value)) {
            return true;
        } else if ("false".equals(value) || "no".equals(value) || "0".equals(value)) {
            return false;
        }
        return value;
    }

}