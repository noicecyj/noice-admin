## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.InterfaceDto;
import noice.entity.po.bean.InterfacePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface InterfaceServiceConverter {

    InterfacePo dtoToPo(InterfaceDto dto);

    List<InterfacePo> dtoListToPoList(List<InterfaceDto> dtoList);

    Set<InterfacePo> dtoSetToPoSet(Set<InterfaceDto> dtoSet);

}
```

