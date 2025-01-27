## 2024-02-09 10:56:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.bean.AuthorityPo;
import noice.entity.vo.bean.AuthorityVo;
import noice.handler.bean.BeanService;
import noice.repository.bean.AuthorityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityService extends BeanService<AuthorityRepository, AuthorityServiceConverter, AuthorityPo, AuthorityDto, AuthorityVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<AuthorityPo> findPage(AuthorityDto dto) {
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
import noice.assembler.bean.AuthorityServiceAssembler;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AuthorityRepository;
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
public class AuthorityService implements BeanService<AuthorityDto> {

    //******************************代码生成方法，请勿改动*************************************//

    private AuthorityRepository repository;

    private AuthorityServiceConverter converter;

    private AuthorityServiceAssembler assembler;

    @Autowired
    public void setRepository(AuthorityRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AuthorityServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AuthorityServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public IPage<AuthorityDto> findPage(@NotNull AuthorityDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public AuthorityDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<AuthorityDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public String addOne(AuthorityDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(AuthorityDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-09-22 12:45:01 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AuthorityServiceAssembler;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AuthorityRepository;
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
public class AuthorityService implements BeanService<AuthorityDto> {

    private AuthorityRepository repository;

    private AuthorityServiceConverter converter;

    private AuthorityServiceAssembler assembler;

    @Autowired
    public void setRepository(AuthorityRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AuthorityServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AuthorityServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(AuthorityDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(AuthorityDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AuthorityDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<AuthorityDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<AuthorityDto> findPage(@NotNull AuthorityDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:24:19 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AuthorityServiceAssembler;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.AuthorityRepository;
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
public class AuthorityService implements BeanService<AuthorityDto> {

    private AuthorityRepository repository;

    private AuthorityServiceConverter converter;

    private AuthorityServiceAssembler assembler;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(AuthorityRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AuthorityServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AuthorityServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public String addOne(AuthorityDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(AuthorityDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AuthorityDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AuthorityDto findOne(AuthorityDto authorityDto) {
        return null;
    }

    @Override
    public List<AuthorityDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<AuthorityDto> findPage(@NotNull AuthorityDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<AuthorityDto> findListByRoleIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inRoleId(ids)).stream().map(RoleAuthorityPo::getAuthorityId).toList()));
    }

}
```

## 2024-11-10 15:11:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AuthorityServiceAssembler;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.AuthorityRepository;
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
public class AuthorityService implements BeanService<AuthorityDto> {

    private AuthorityRepository repository;

    private AuthorityServiceConverter converter;

    private AuthorityServiceAssembler assembler;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(AuthorityRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AuthorityServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AuthorityServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public String addOne(AuthorityDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(AuthorityDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AuthorityDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AuthorityDto findOne(AuthorityDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AuthorityDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<AuthorityDto> findPage(@NotNull AuthorityDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<AuthorityDto> findListByRoleIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inRoleId(ids)).stream().map(RoleAuthorityPo::getAuthorityId).toList()));
    }

}
```

## 2024-12-15 13:19:45 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AuthorityServiceAssembler;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.AuthorityRepository;
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
public class AuthorityService implements BeanService<AuthorityDto> {

    private AuthorityRepository repository;

    private AuthorityServiceConverter converter;

    private AuthorityServiceAssembler assembler;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(AuthorityRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AuthorityServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AuthorityServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public String addOne(@NotNull AuthorityDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull AuthorityDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AuthorityDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AuthorityDto findOne(@NotNull AuthorityDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AuthorityDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<AuthorityDto> findList(@NotNull AuthorityDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<AuthorityDto> findPage(@NotNull AuthorityDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<AuthorityDto> findListByRoleIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inRoleId(ids)).stream().map(RoleAuthorityPo::getAuthorityId).toList()));
    }

}
```

## 2025-01-25 21:16:27 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AuthorityServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.AuthorityServiceConverter;
import noice.entity.dto.bean.AuthorityDto;
import noice.entity.po.relation.RoleAuthorityPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.AuthorityRepository;
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
public class AuthorityService implements BeanService<AuthorityDto> {

    private AuthorityRepository repository;

    private AuthorityServiceConverter converter;

    private AuthorityServiceAssembler assembler;

    private RoleAuthorityRepository roleAuthorityRepository;

    @Autowired
    public void setRepository(AuthorityRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AuthorityServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AuthorityServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setRoleAuthorityRepository(RoleAuthorityRepository roleAuthorityRepository) {
        this.roleAuthorityRepository = roleAuthorityRepository;
    }

    @Override
    public String addOne(@NotNull AuthorityDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull AuthorityDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AuthorityDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AuthorityDto findOne(@NotNull AuthorityDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AuthorityDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<AuthorityDto> findList(@NotNull AuthorityDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<AuthorityDto> findPage(@NotNull AuthorityDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new AuthorityDto()).eqAuto().getQueryWrapper()));
    }

    public List<AuthorityDto> findListByRoleIds(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(roleAuthorityRepository.findList(new RoleAuthorityPo().inRoleId(ids)).stream().map(RoleAuthorityPo::getAuthorityId).toList()));
    }

}
```

