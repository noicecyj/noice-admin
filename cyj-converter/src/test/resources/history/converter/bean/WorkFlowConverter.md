## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring")
public interface WorkFlowConverter extends BaseBeanConverter<WorkFlowPo, WorkFlowDto, WorkFlowVo> {
}
```