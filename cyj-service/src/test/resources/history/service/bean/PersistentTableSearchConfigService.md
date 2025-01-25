## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.PersistentTableSearchConfigConverter;
import noice.handler.bean.BeanService;
import noice.handler.bean.BaseBeanServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentTableSearchConfigService extends BeanService<PersistentTableSearchConfigRepository, PersistentTableSearchConfigConverter, PersistentTableSearchConfigPo, PersistentTableSearchConfigDto, PersistentTableSearchConfigVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentTableSearchConfigPo> findPage(PersistentTableSearchConfigDto dto) {
        return getBaseRepository().findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), getBaseConverter().dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-11-10 13:24:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableSearchConfigServiceAssembler;
import noice.converter.bean.PersistentTableSearchConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableSearchConfigRepository;
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
public class PersistentTableSearchConfigService implements BeanService<PersistentTableSearchConfigDto> {

    private PersistentTableSearchConfigRepository repository;

    private PersistentTableSearchConfigServiceConverter converter;

    private PersistentTableSearchConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableSearchConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableSearchConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableSearchConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(PersistentTableSearchConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableSearchConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(PersistentTableSearchConfigDto persistentTableSearchConfigDto) {
        return null;
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentTableSearchConfigDto> findPage(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableSearchConfigServiceAssembler;
import noice.converter.bean.PersistentTableSearchConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableSearchConfigRepository;
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
public class PersistentTableSearchConfigService implements BeanService<PersistentTableSearchConfigDto> {

    private PersistentTableSearchConfigRepository repository;

    private PersistentTableSearchConfigServiceConverter converter;

    private PersistentTableSearchConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableSearchConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableSearchConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableSearchConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(PersistentTableSearchConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableSearchConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(PersistentTableSearchConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentTableSearchConfigDto> findPage(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:41 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableSearchConfigServiceAssembler;
import noice.converter.bean.PersistentTableSearchConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableSearchConfigRepository;
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
public class PersistentTableSearchConfigService implements BeanService<PersistentTableSearchConfigDto> {

    private PersistentTableSearchConfigRepository repository;

    private PersistentTableSearchConfigServiceConverter converter;

    private PersistentTableSearchConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableSearchConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableSearchConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableSearchConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(PersistentTableSearchConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableSearchConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(PersistentTableSearchConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<PersistentTableSearchConfigDto> findPage(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableSearchConfigServiceAssembler;
import noice.converter.bean.PersistentTableSearchConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableSearchConfigRepository;
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
public class PersistentTableSearchConfigService implements BeanService<PersistentTableSearchConfigDto> {

    private PersistentTableSearchConfigRepository repository;

    private PersistentTableSearchConfigServiceConverter converter;

    private PersistentTableSearchConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableSearchConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableSearchConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableSearchConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(@NotNull PersistentTableSearchConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(@NotNull PersistentTableSearchConfigDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableSearchConfigDto> findPage(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableSearchConfigServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentTableSearchConfigServiceConverter;
import noice.entity.dto.bean.PersistentTableSearchConfigDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableSearchConfigRepository;
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
public class PersistentTableSearchConfigService implements BeanService<PersistentTableSearchConfigDto> {

    private PersistentTableSearchConfigRepository repository;

    private PersistentTableSearchConfigServiceConverter converter;

    private PersistentTableSearchConfigServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableSearchConfigRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableSearchConfigServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableSearchConfigServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableSearchConfigDto findOne(@NotNull PersistentTableSearchConfigDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableSearchConfigDto> findList(@NotNull PersistentTableSearchConfigDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableSearchConfigDto> findPage(@NotNull PersistentTableSearchConfigDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentTableSearchConfigDto()).eqAuto().getQueryWrapper()));
    }

}
```

