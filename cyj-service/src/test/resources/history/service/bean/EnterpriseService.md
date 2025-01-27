## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.EnterpriseConverter;
import noice.handler.bean.BeanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EnterpriseService extends BeanService<EnterpriseRepository, EnterpriseConverter, EnterprisePo, EnterpriseDto, EnterpriseVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<EnterprisePo> findPage(EnterpriseDto dto) {
        return getBaseRepository().findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), getBaseConverter().dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 00:38:26 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-11-10 13:24:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.EnterpriseServiceAssembler;
import noice.converter.bean.EnterpriseServiceConverter;
import noice.entity.dto.bean.EnterpriseDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.EnterpriseRepository;
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
public class EnterpriseService implements BeanService<EnterpriseDto> {

    private EnterpriseRepository repository;

    private EnterpriseServiceConverter converter;

    private EnterpriseServiceAssembler assembler;

    @Autowired
    public void setRepository(EnterpriseRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(EnterpriseServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(EnterpriseServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(EnterpriseDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(EnterpriseDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public EnterpriseDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public EnterpriseDto findOne(EnterpriseDto enterpriseDto) {
        return null;
    }

    @Override
    public List<EnterpriseDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<EnterpriseDto> findPage(@NotNull EnterpriseDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.EnterpriseServiceAssembler;
import noice.converter.bean.EnterpriseServiceConverter;
import noice.entity.dto.bean.EnterpriseDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.EnterpriseRepository;
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
public class EnterpriseService implements BeanService<EnterpriseDto> {

    private EnterpriseRepository repository;

    private EnterpriseServiceConverter converter;

    private EnterpriseServiceAssembler assembler;

    @Autowired
    public void setRepository(EnterpriseRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(EnterpriseServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(EnterpriseServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(EnterpriseDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(EnterpriseDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public EnterpriseDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public EnterpriseDto findOne(EnterpriseDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<EnterpriseDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<EnterpriseDto> findPage(@NotNull EnterpriseDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.EnterpriseServiceAssembler;
import noice.converter.bean.EnterpriseServiceConverter;
import noice.entity.dto.bean.EnterpriseDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.EnterpriseRepository;
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
public class EnterpriseService implements BeanService<EnterpriseDto> {

    private EnterpriseRepository repository;

    private EnterpriseServiceConverter converter;

    private EnterpriseServiceAssembler assembler;

    @Autowired
    public void setRepository(EnterpriseRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(EnterpriseServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(EnterpriseServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(EnterpriseDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(EnterpriseDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public EnterpriseDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public EnterpriseDto findOne(EnterpriseDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<EnterpriseDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<EnterpriseDto> findPage(@NotNull EnterpriseDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:45 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.EnterpriseServiceAssembler;
import noice.converter.bean.EnterpriseServiceConverter;
import noice.entity.dto.bean.EnterpriseDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.EnterpriseRepository;
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
public class EnterpriseService implements BeanService<EnterpriseDto> {

    private EnterpriseRepository repository;

    private EnterpriseServiceConverter converter;

    private EnterpriseServiceAssembler assembler;

    @Autowired
    public void setRepository(EnterpriseRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(EnterpriseServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(EnterpriseServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull EnterpriseDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull EnterpriseDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public EnterpriseDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public EnterpriseDto findOne(@NotNull EnterpriseDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<EnterpriseDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<EnterpriseDto> findList(@NotNull EnterpriseDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<EnterpriseDto> findPage(@NotNull EnterpriseDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:27 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.EnterpriseServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.EnterpriseServiceConverter;
import noice.entity.dto.bean.EnterpriseDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.EnterpriseRepository;
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
public class EnterpriseService implements BeanService<EnterpriseDto> {

    private EnterpriseRepository repository;

    private EnterpriseServiceConverter converter;

    private EnterpriseServiceAssembler assembler;

    @Autowired
    public void setRepository(EnterpriseRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(EnterpriseServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(EnterpriseServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull EnterpriseDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull EnterpriseDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public EnterpriseDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public EnterpriseDto findOne(@NotNull EnterpriseDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<EnterpriseDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<EnterpriseDto> findList(@NotNull EnterpriseDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<EnterpriseDto> findPage(@NotNull EnterpriseDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new EnterpriseDto()).eqAuto().getQueryWrapper()));
    }

}
```

