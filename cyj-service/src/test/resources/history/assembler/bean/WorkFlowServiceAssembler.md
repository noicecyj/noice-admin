## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-13 15:41:53 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.po.bean.WorkFlowPo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface WorkFlowServiceAssembler {

    WorkFlowDto poToDto(WorkFlowPo po);

    List<WorkFlowDto> poListToDtoList(List<WorkFlowPo> poList);

    Set<WorkFlowDto> poSetToDtoSet(Set<WorkFlowPo> poSet);

}
```

## 2024-12-14 11:18:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.po.bean.WorkFlowPo;
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
public interface WorkFlowServiceAssembler {

    WorkFlowDto poToDto(WorkFlowPo po);

    List<WorkFlowDto> poListToDtoList(List<WorkFlowPo> poList);

    Set<WorkFlowDto> poSetToDtoSet(Set<WorkFlowPo> poSet);

}
```

