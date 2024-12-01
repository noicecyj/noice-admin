## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.po.bean.EnterprisePo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface EnterpriseServiceAssembler {

    EnterpriseDto poToDto(EnterprisePo po);

    List<EnterpriseDto> poListToDtoList(List<EnterprisePo> poList);

}
```