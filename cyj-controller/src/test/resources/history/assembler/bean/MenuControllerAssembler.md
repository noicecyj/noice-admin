## 2024-03-17 22:14:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.vo.bean.MenuVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, MenuServiceAssembler.class})
public interface MenuControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "menuDto", source = "dto.menuPo")
    MenuVo dtoToVo(MenuDto dto);

    List<MenuVo> dtoListToVoList(List<MenuDto> dtoList);

}
```
## 2024-12-06 10:38:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.vo.bean.MenuVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, MenuServiceAssembler.class})
public interface MenuControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "menuDto", source = "dto.menuPo")
    MenuVo dtoToVo(MenuDto dto);

    List<MenuVo> dtoListToVoList(List<MenuDto> dtoList);

    Set<MenuVo> dtoSetToVoSet(Set<MenuDto> dtoList);

}
```

## 2024-12-06 16:10:59 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.vo.bean.MenuVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, MenuServiceAssembler.class})
public interface MenuControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "menuDto", source = "dto.menuPo")
    MenuVo dtoToVo(MenuDto dto);

    List<MenuVo> dtoListToVoList(List<MenuDto> dtoList);

    Set<MenuVo> dtoSetToVoSet(Set<MenuDto> dtoList);

}
```

## 2024-12-13 15:41:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.vo.bean.MenuVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class, uses = {AuthorityServiceAssembler.class, MenuServiceAssembler.class})
public interface MenuControllerAssembler {

    @Mapping(target = "authorityDto", source = "dto.authorityPo")
    @Mapping(target = "menuDto", source = "dto.menuPo")
    MenuVo dtoToVo(MenuDto dto);

    List<MenuVo> dtoListToVoList(List<MenuDto> dtoList);

    Set<MenuVo> dtoSetToVoSet(Set<MenuDto> dtoList);

}
```

