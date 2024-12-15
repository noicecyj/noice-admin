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
        if ("true".equals(value)) {
            return true;
        } else if ("false".equals(value)) {
            return false;
        }
        return value;
    }

}