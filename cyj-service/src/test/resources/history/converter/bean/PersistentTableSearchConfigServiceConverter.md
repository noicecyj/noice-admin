## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.entity.po.bean.PersistentTableSearchConfigPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface PersistentTableSearchConfigServiceConverter {

    PersistentTableSearchConfigPo dtoToPo(PersistentTableSearchConfigDto dto);

    List<PersistentTableSearchConfigPo> dtoListToPoList(List<PersistentTableSearchConfigDto> dtoList);

    Set<PersistentTableSearchConfigPo> dtoSetToPoSet(Set<PersistentTableSearchConfigDto> dtoSet);

}
```

