## 2024-02-09 10:56:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.converter.bean;

import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.entity.vo.bean.AppServiceVo;
import org.mapstruct.Mapper;

/**
 * @author Noice
 */
@Mapper(componentModel = "spring")
public interface AppServiceConverter extends BaseBeanConverter<AppServicePo, AppServiceDto, AppServiceVo> {
}
```
