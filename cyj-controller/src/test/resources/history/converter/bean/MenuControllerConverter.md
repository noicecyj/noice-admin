## 2024-03-17 22:14:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.vo.bean.MenuVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.MenuRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface MenuControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "menuPo", source = "vo.menuId")
    MenuDto voToDto(MenuVo vo);

    List<MenuDto> voListToDtoList(List<MenuVo> voList);

}
```
## 2024-12-13 15:41:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.MenuDto;
import noice.entity.vo.bean.MenuVo;
import noice.handler.converter.bean.BaseBeanConverter;
import noice.repository.bean.AuthorityRepository;
import noice.repository.bean.MenuRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class, uses = {AuthorityRepository.class, MenuRepository.class})
public interface MenuControllerConverter {

    @Mapping(target = "authorityPo", source = "vo.authorityId")
    @Mapping(target = "menuPo", source = "vo.menuId")
    MenuDto voToDto(MenuVo vo);

    List<MenuDto> voListToDtoList(List<MenuVo> voList);

    Set<MenuDto> voSetToDtoSet(Set<MenuVo> voSet);

}
```

