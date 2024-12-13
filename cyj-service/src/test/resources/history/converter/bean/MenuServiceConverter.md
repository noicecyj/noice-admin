## 2024-03-17 22:14:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.po.bean.MenuPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface MenuServiceConverter {

    MenuPo dtoToPo(MenuDto dto);

    List<MenuPo> dtoListToPoList(List<MenuDto> dtoList);

}
```
## 2024-12-13 15:41:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.po.bean.MenuPo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface MenuServiceConverter {

    MenuPo dtoToPo(MenuDto dto);

    List<MenuPo> dtoListToPoList(List<MenuDto> dtoList);

    Set<MenuPo> dtoSetToPoSet(Set<MenuDto> dtoSet);

}
```

