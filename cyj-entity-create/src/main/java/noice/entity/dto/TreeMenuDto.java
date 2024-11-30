package noice.entity.dto;

import lombok.Data;
import noice.entity.po.bean.MenuPo;

import java.util.List;

@Data
public class TreeMenuDto {

    private String id;

    private String menuId;

    private MenuPo menuPo;

    private String name;

    private String path;

    private List<TreeMenuDto> children;

}
