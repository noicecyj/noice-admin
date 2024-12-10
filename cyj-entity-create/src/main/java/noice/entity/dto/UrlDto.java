package noice.entity.dto;

import lombok.Data;

import java.util.Map;

/**
 * @author Noice
 */
@Data
public class UrlDto {

    private String page;

    private String add;

    private String update;

    private String delete;

    private String get;

    private String set;

    private String getList;

    private String getOptions;

    private Map<String, String> allUrl;

}
