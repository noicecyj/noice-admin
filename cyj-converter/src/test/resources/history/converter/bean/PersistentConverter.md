## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.entity.vo.bean.PersistentVo;
import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring")
public interface PersistentConverter extends BaseBeanConverter<PersistentPo, PersistentDto, PersistentVo> {
}
```
