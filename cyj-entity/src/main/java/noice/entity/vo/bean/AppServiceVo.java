package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AppServiceVo extends BaseVoBean {

    public static final String VO = "AppService";

    private String appServiceApi;

    private String appServiceCode;

    private String appServiceName;

    private String appServicePath;

    private String appServicePort;

    private String appServiceTruePath;

}