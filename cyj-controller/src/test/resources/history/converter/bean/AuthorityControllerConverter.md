## 2024-03-15 22:24:35 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AuthorityControllerConverter {

    AuthorityDto voToDto(AuthorityVo vo);

    List<AuthorityDto> voListToDtoList(List<AuthorityVo> vo);

}
```

## 2024-03-15 23:20:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AuthorityControllerConverter {

    AuthorityDto voToDto(AuthorityVo vo);

    List<AuthorityDto> voListToDtoList(List<AuthorityVo> vo);

}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AuthorityControllerConverter {

    AuthorityDto voToDto(AuthorityVo vo);

    List<AuthorityDto> voListToDtoList(List<AuthorityVo> voList);

}
```
## 2024-12-13 15:41:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AuthorityDto;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface AuthorityControllerConverter {

    AuthorityDto voToDto(AuthorityVo vo);

    List<AuthorityDto> voListToDtoList(List<AuthorityVo> voList);

    Set<AuthorityDto> voSetToDtoSet(Set<AuthorityVo> voSet);

}
```

