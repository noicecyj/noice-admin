## 2024-03-17 01:00:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.relation;

import noice.assembler.relation.UserRoleServiceAssembler;
import noice.converter.relation.UserRoleServiceConverter;
import noice.entity.dto.relation.UserRoleDto;
import noice.handler.relation.RelationService;
import noice.repository.relation.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserRoleService implements RelationService<UserRoleDto> {

    //******************************代码生成方法，请勿改动*************************************//

    private UserRoleRepository repository;

    private UserRoleServiceConverter converter;

    private UserRoleServiceAssembler assembler;


    public void setRepository(UserRoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(UserRoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(UserRoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public UserRoleDto get(UserRoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto)));
    }

    @Override
    public void set(List<String> ids, List<UserRoleDto> dtoList) {
        ids.forEach(id -> repository.delete(id));
        dtoList.forEach(dto -> repository.add(converter.dtoToPo(dto)));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 01:02:19 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.relation;

import noice.assembler.relation.UserRoleServiceAssembler;
import noice.converter.relation.UserRoleServiceConverter;
import noice.entity.dto.relation.UserRoleDto;
import noice.handler.relation.RelationService;
import noice.repository.relation.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserRoleService implements RelationService<UserRoleDto> {

    private UserRoleRepository repository;

    private UserRoleServiceConverter converter;

    private UserRoleServiceAssembler assembler;

    @Autowired
    public void setRepository(UserRoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(UserRoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(UserRoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public void set(List<String> ids, List<UserRoleDto> dtoList) {
        ids.forEach(id -> repository.delete(id));
        dtoList.forEach(dto -> repository.add(converter.dtoToPo(dto)));
    }

    @Override
    public UserRoleDto get(UserRoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto)));
    }

}
```
