## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.PersistentFormConverter;
import noice.handler.bean.BeanService;
import noice.handler.bean.BaseBeanServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentFormService extends BeanService<PersistentFormRepository, PersistentFormConverter, PersistentFormPo, PersistentFormDto, PersistentFormVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentFormPo> findPage(PersistentFormDto dto) {
        return getBaseRepository().findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), getBaseConverter().dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-11-10 13:24:22 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentFormServiceAssembler;
import noice.converter.bean.PersistentFormServiceConverter;
import noice.entity.dto.bean.PersistentFormDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentFormRepository;
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
public class PersistentFormService implements BeanService<PersistentFormDto> {

    private PersistentFormRepository repository;

    private PersistentFormServiceConverter converter;

    private PersistentFormServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentFormRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentFormServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(PersistentFormDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentFormDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentFormDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentFormDto findOne(PersistentFormDto persistentFormDto) {
        return null;
    }

    @Override
    public List<PersistentFormDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentFormDto> findPage(@NotNull PersistentFormDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentFormServiceAssembler;
import noice.converter.bean.PersistentFormServiceConverter;
import noice.entity.dto.bean.PersistentFormDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentFormRepository;
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
public class PersistentFormService implements BeanService<PersistentFormDto> {

    private PersistentFormRepository repository;

    private PersistentFormServiceConverter converter;

    private PersistentFormServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentFormRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentFormServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(PersistentFormDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentFormDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentFormDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentFormDto findOne(PersistentFormDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentFormDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentFormDto> findPage(@NotNull PersistentFormDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentFormServiceAssembler;
import noice.converter.bean.PersistentFormServiceConverter;
import noice.entity.dto.bean.PersistentFormDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentFormRepository;
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
public class PersistentFormService implements BeanService<PersistentFormDto> {

    private PersistentFormRepository repository;

    private PersistentFormServiceConverter converter;

    private PersistentFormServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentFormRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentFormServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentFormServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(PersistentFormDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentFormDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentFormDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentFormDto findOne(PersistentFormDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentFormDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<PersistentFormDto> findPage(@NotNull PersistentFormDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

