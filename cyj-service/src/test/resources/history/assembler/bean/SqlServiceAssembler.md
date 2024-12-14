## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.SqlDto;
import noice.entity.po.bean.SqlPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface SqlServiceAssembler {

    SqlDto poToDto(SqlPo po);

    List<SqlDto> poListToDtoList(List<SqlPo> poList);

    Set<SqlDto> poSetToDtoSet(Set<SqlPo> poSet);

}
```

## 2024-12-14 11:18:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.SqlDto;
import noice.entity.po.bean.SqlPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Primary
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface SqlServiceAssembler {

    SqlDto poToDto(SqlPo po);

    List<SqlDto> poListToDtoList(List<SqlPo> poList);

    Set<SqlDto> poSetToDtoSet(Set<SqlPo> poSet);

}
```

