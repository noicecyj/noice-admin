## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.PersistentTableConfigConverter;
import noice.handler.bean.BeanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentTableConfigService extends BeanService<PersistentTableConfigRepository, PersistentTableConfigConverter, PersistentTableConfigPo, PersistentTableConfigDto, PersistentTableConfigVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentTableConfigPo> findPage(PersistentTableConfigDto dto) {
        return getBaseRepository().findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), getBaseConverter().dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-11-10 13:24:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableConfigServiceAssembler;
import noice.converter.bean.PersistentTableConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableConfigRepository;
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
public class PersistentTableConfigService implements BeanService<PersistentTableConfigDto> {

    private PersistentTableConfigRepository repository;

    private PersistentTableConfigServiceConverter converter;

    private PersistentTableConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentTableConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableConfigDto findOne(PersistentTableConfigDto persistentTableConfigDto) {
        return null;
    }

    @Override
    public List<PersistentTableConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentTableConfigDto> findPage(@NotNull PersistentTableConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableConfigServiceAssembler;
import noice.converter.bean.PersistentTableConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableConfigRepository;
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
public class PersistentTableConfigService implements BeanService<PersistentTableConfigDto> {

    private PersistentTableConfigRepository repository;

    private PersistentTableConfigServiceConverter converter;

    private PersistentTableConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentTableConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableConfigDto findOne(PersistentTableConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentTableConfigDto> findPage(@NotNull PersistentTableConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableConfigServiceAssembler;
import noice.converter.bean.PersistentTableConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableConfigRepository;
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
public class PersistentTableConfigService implements BeanService<PersistentTableConfigDto> {

    private PersistentTableConfigRepository repository;

    private PersistentTableConfigServiceConverter converter;

    private PersistentTableConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentTableConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableConfigDto findOne(PersistentTableConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<PersistentTableConfigDto> findPage(@NotNull PersistentTableConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableConfigServiceAssembler;
import noice.converter.bean.PersistentTableConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableConfigRepository;
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
public class PersistentTableConfigService implements BeanService<PersistentTableConfigDto> {

    private PersistentTableConfigRepository repository;

    private PersistentTableConfigServiceConverter converter;

    private PersistentTableConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentTableConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableConfigDto findOne(@NotNull PersistentTableConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableConfigDto> findList(@NotNull PersistentTableConfigDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableConfigDto> findPage(@NotNull PersistentTableConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:30 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableConfigServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentTableConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableConfigRepository;
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
public class PersistentTableConfigService implements BeanService<PersistentTableConfigDto> {

    private PersistentTableConfigRepository repository;

    private PersistentTableConfigServiceConverter converter;

    private PersistentTableConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentTableConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableConfigDto findOne(@NotNull PersistentTableConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableConfigDto> findList(@NotNull PersistentTableConfigDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableConfigDto> findPage(@NotNull PersistentTableConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentTableConfigDto()).eqAuto().getQueryWrapper()));
    }

}
```

