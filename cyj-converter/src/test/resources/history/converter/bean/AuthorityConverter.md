## 2024-02-09 10:56:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.vo.bean.AuthorityVo;
import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring")
public interface AuthorityConverter extends BaseBeanConverter<AuthorityPo, AuthorityDto, AuthorityVo> {
}
```
