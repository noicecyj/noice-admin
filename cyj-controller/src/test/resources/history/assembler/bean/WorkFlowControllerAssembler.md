## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-12-06 10:38:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.vo.bean.WorkFlowVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface WorkFlowControllerAssembler {

    WorkFlowVo dtoToVo(WorkFlowDto dto);

    List<WorkFlowVo> dtoListToVoList(List<WorkFlowDto> dtoList);

    Set<WorkFlowVo> dtoSetToVoSet(Set<WorkFlowDto> dtoList);

}
```

## 2024-12-06 16:11:00 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.vo.bean.WorkFlowVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface WorkFlowControllerAssembler {

    @Mapping(target = "key", source = "dto.id")
    WorkFlowVo dtoToVo(WorkFlowDto dto);

    List<WorkFlowVo> dtoListToVoList(List<WorkFlowDto> dtoList);

    Set<WorkFlowVo> dtoSetToVoSet(Set<WorkFlowDto> dtoList);

}
```

## 2024-12-13 15:41:53 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.assembler.bean;

import noice.entity.dto.bean.WorkFlowDto;
import noice.entity.vo.bean.WorkFlowVo;
import noice.handler.assembler.bean.BaseBeanAssembler;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring", config = BaseBeanAssembler.class)
public interface WorkFlowControllerAssembler {

    WorkFlowVo dtoToVo(WorkFlowDto dto);

    List<WorkFlowVo> dtoListToVoList(List<WorkFlowDto> dtoList);

    Set<WorkFlowVo> dtoSetToVoSet(Set<WorkFlowDto> dtoList);

}
```

