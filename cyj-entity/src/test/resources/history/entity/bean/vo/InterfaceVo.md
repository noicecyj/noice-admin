## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```
## 2024-10-18 22:36:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.vo.BaseVoBean;

/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceVo extends BaseVoBean {

    public static final String VO = "Interface";

    private String authorityId;

    private AuthorityDto authorityDto;

    private String interfaceCode;

    private String interfaceName;

    private String interfacePath;

    private String interfaceType;

    private String persistentId;

    private PersistentDto persistentDto;

}
```

## 2024-12-09 17:52:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.entity.vo.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import noice.entity.dto.bean.AuthorityDto;
import noice.handler.vo.BaseVoBean;


/**
 * @author Noice
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceVo extends BaseVoBean {

    public static final String VO = "Interface";

    private String authorityId;

    private AuthorityDto authorityDto;

    private String interfaceCode;

    private String interfaceName;

    private String interfacePath;

    private String interfaceType;

}
```

