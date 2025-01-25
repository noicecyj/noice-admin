## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.CatalogServiceConverter;
import noice.handler.bean.BeanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogService extends BeanService<CatalogRepository, CatalogServiceConverter, CatalogPo, CatalogDto, CatalogVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<CatalogPo> findPage(CatalogDto dto) {
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
import noice.assembler.bean.CatalogServiceAssembler;
import noice.converter.bean.CatalogServiceConverter;
import noice.entity.dto.bean.CatalogDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogRepository;
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
public class CatalogService implements BeanService<CatalogDto> {

    //******************************代码生成方法，请勿改动*************************************//

    private CatalogRepository repository;

    private CatalogServiceConverter converter;

    private CatalogServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogServiceConverter converter) {
        this.converter = converter;
    }


    @Autowired
    public void setAssembler(CatalogServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public IPage<CatalogDto> findPage(@NotNull CatalogDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public CatalogDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<CatalogDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public int addOne(CatalogDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(CatalogDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-11-10 13:24:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogServiceAssembler;
import noice.converter.bean.CatalogServiceConverter;
import noice.entity.dto.bean.CatalogDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogRepository;
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
public class CatalogService implements BeanService<CatalogDto> {

    private CatalogRepository repository;

    private CatalogServiceConverter converter;

    private CatalogServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(CatalogDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(CatalogDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDto findOne(CatalogDto catalogDto) {
        return null;
    }

    @Override
    public List<CatalogDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<CatalogDto> findPage(@NotNull CatalogDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogServiceAssembler;
import noice.converter.bean.CatalogServiceConverter;
import noice.entity.dto.bean.CatalogDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogRepository;
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
public class CatalogService implements BeanService<CatalogDto> {

    private CatalogRepository repository;

    private CatalogServiceConverter converter;

    private CatalogServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(CatalogDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(CatalogDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDto findOne(CatalogDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<CatalogDto> findPage(@NotNull CatalogDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogServiceAssembler;
import noice.converter.bean.CatalogServiceConverter;
import noice.entity.dto.bean.CatalogDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogRepository;
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
public class CatalogService implements BeanService<CatalogDto> {

    private CatalogRepository repository;

    private CatalogServiceConverter converter;

    private CatalogServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(CatalogDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(CatalogDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDto findOne(CatalogDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<CatalogDto> findPage(@NotNull CatalogDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:45 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogServiceAssembler;
import noice.converter.bean.CatalogServiceConverter;
import noice.entity.dto.bean.CatalogDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogRepository;
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
public class CatalogService implements BeanService<CatalogDto> {

    private CatalogRepository repository;

    private CatalogServiceConverter converter;

    private CatalogServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull CatalogDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull CatalogDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDto findOne(@NotNull CatalogDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<CatalogDto> findList(@NotNull CatalogDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<CatalogDto> findPage(@NotNull CatalogDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:27 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.CatalogServiceConverter;
import noice.entity.dto.bean.CatalogDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogRepository;
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
public class CatalogService implements BeanService<CatalogDto> {

    private CatalogRepository repository;

    private CatalogServiceConverter converter;

    private CatalogServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull CatalogDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull CatalogDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDto findOne(@NotNull CatalogDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<CatalogDto> findList(@NotNull CatalogDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<CatalogDto> findPage(@NotNull CatalogDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new CatalogDto()).eqAuto().getQueryWrapper()));
    }

}
```

