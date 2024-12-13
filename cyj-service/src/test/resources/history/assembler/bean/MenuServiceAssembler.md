## 2024-03-17 22:14:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.po.bean.MenuPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.MenuRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface MenuServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "menuPo", source = "po.menuId")
    MenuDto poToDto(MenuPo po);

    List<MenuDto> poListToDtoList(List<MenuPo> poList);

    Set<MenuDto> poSetToDtoSet(Set<MenuPo> poList);

}
```
## 2024-12-13 15:41:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.po.bean.MenuPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.MenuRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface MenuServiceAssembler {

    @Mapping(target = "authorityPo", source = "po.authorityId")
    @Mapping(target = "menuPo", source = "po.menuId")
    MenuDto poToDto(MenuPo po);

    List<MenuDto> poListToDtoList(List<MenuPo> poList);

    Set<MenuDto> poSetToDtoSet(Set<MenuPo> poSet);

}
```

