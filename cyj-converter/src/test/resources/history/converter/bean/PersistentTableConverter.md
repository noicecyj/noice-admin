## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring")
public interface PersistentTableConverter extends BaseBeanConverter<PersistentTablePo, PersistentTableDto, PersistentTableVo> {
}
```
