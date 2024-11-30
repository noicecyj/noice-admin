## 2024-03-15 13:26:07 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-15 13:32:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface EnterpriseServiceConverter {
    public EnterprisePo dtoToPo(EnterpriseDto dto);


    public List<EnterprisePo> dtoListToPoList(List<EnterpriseDto> dtoList);


}
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.converter.bean.BaseBeanConverter;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanConverter.class)
public interface EnterpriseServiceConverter {

    EnterprisePo dtoToPo(EnterpriseDto dto);

    List<EnterprisePo> dtoListToPoList(List<EnterpriseDto> dtoList);

}
```
