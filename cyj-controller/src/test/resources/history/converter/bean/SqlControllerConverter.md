## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.SqlDto;
import noice.entity.vo.bean.SqlVo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface SqlControllerConverter {

    SqlDto voToDto(SqlVo vo);

    List<SqlDto> voListToDtoList(List<SqlVo> voList);

    Set<SqlDto> voSetToDtoSet(Set<SqlVo> voSet);

}
```

