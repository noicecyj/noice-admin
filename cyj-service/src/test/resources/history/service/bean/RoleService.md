## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.bean.RolePo;
import noice.entity.vo.bean.RoleVo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService extends BeanService<RoleRepository, RoleServiceConverter, RolePo, RoleDto, RoleVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<RolePo> findPage(RoleDto dto) {
        return getBaseRepository().findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), getBaseConverter().dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 00:38:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    //******************************代码生成方法，请勿改动*************************************//

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-09-22 12:45:05 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-10-11 18:47:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-10-11 19:35:53 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-10-18 19:39:29 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-10-18 22:36:19 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-10-18 23:25:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-10-20 20:01:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-10-20 20:24:46 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-11-09 00:34:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-11-10 13:24:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public RoleDto findOne(RoleDto roleDto) {
        return null;
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-11-10 13:59:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.UserRoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public RoleDto findOne(RoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-11-10 15:11:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.UserRoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public RoleDto findOne(RoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-12-01 09:44:17 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(@NotNull RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public RoleDto findOne(@NotNull RoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<RoleDto> findList(@NotNull RoleDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-12-15 13:19:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.UserRoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(@NotNull RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public RoleDto findOne(@NotNull RoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<RoleDto> findList(@NotNull RoleDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2024-12-15 16:38:27 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.entity.po.relation.UserRolePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import noice.repository.relation.UserRoleRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(@NotNull RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public RoleDto findOne(@NotNull RoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<RoleDto> findList(@NotNull RoleDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new RoleDto()).eqAuto().getQueryWrapper()));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

## 2025-01-25 21:16:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.RoleServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.RoleServiceConverter;
import noice.entity.dto.bean.RoleDto;
import noice.entity.po.relation.UserRolePo;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.RoleRepository;
import noice.repository.relation.UserRoleRepository;
import noice.repository.relation.RoleAuthorityRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleService implements BeanService<RoleDto> {

    private RoleRepository repository;

    private RoleServiceConverter converter;

    private RoleServiceAssembler assembler;

    private UserRoleRepository userRoleRepository;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(RoleRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(RoleServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(RoleServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setUserRoleRepository(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public int addOne(@NotNull RoleDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull RoleDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public RoleDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public RoleDto findOne(@NotNull RoleDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<RoleDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<RoleDto> findList(@NotNull RoleDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<RoleDto> findPage(@NotNull RoleDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new RoleDto()).eqAuto().getQueryWrapper()));
    }

    public List<RoleDto> findListByUserIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(userRoleRepository.findList(new UserRolePo().inUserId(ids)).stream().map(UserRolePo::getRoleId).toList()));
    }

    public List<RoleDto> findListByAuthorityIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inAuthorityId(ids)).stream().map(RoleAuthorityPo::getRoleId).toList()));
    }

}
```

