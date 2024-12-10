## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-10-18 22:36:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.po.bean.PersistentPo;
import noice.handler.dto.BaseDtoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceDto extends BaseDtoBean {

    public static final String DTO = "Interface";

    private String authorityId;

    private AuthorityPo authorityPo;

    private String interfaceCode;

    private String interfaceName;

    private String interfacePath;

    private String interfaceType;

    private String persistentId;

    private PersistentPo persistentPo;

}
```

## 2024-12-09 17:52:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.dto.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.po.bean.AuthorityPo;
import noice.handler.dto.BaseDtoBean;


/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceDto extends BaseDtoBean {

    public static final String DTO = "Interface";

    private String authorityId;

    private AuthorityPo authorityPo;

    private String interfaceCode;

    private String interfaceName;

    private String interfacePath;

    private String interfaceType;

}
```

