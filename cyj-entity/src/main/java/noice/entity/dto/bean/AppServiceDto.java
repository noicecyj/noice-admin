package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AppServiceDto extends BaseDtoBean {

    public static final String DTO = "AppService";

    private String appServiceApi;

    private String appServiceCode;

    private String appServiceName;

    private String appServicePath;

    private String appServicePort;

    private String appServiceTruePath;

}