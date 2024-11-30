## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.RolePo;
import noice.entity.vo.bean.RoleVo;
import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring")
public interface RoleConverter extends BaseBeanConverter<RolePo, RoleDto, RoleVo> {
}
```
