## 2024-03-16 10:56:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-03-21 11:18:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.vo.bean.EnterpriseVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface EnterpriseControllerAssembler {

    EnterpriseVo dtoToVo(EnterpriseDto dto);

    List<EnterpriseVo> dtoListToVoList(List<EnterpriseDto> dtoList);

}
```
## 2024-12-06 10:38:36 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.EnterpriseDto;
import noice.entity.vo.bean.EnterpriseVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface EnterpriseControllerAssembler {

    EnterpriseVo dtoToVo(EnterpriseDto dto);

    List<EnterpriseVo> dtoListToVoList(List<EnterpriseDto> dtoList);

    Set<EnterpriseVo> dtoSetToVoSet(Set<EnterpriseDto> dtoList);

}
```

