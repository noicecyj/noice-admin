## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.UserDto;
import noice.entity.po.bean.UserPo;
import noice.entity.vo.bean.UserVo;
import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring")
public interface UserConverter extends BaseBeanConverter<UserPo, UserDto, UserVo> {
}
```
