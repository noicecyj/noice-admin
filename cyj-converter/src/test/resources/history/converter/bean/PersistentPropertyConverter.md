## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.entity.vo.bean.PersistentPropertyVo;
import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring")
public interface PersistentPropertyConverter extends BaseBeanConverter<PersistentPropertyPo, PersistentPropertyDto, PersistentPropertyVo> {
}
```
