## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.handler.bean.BeanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CatalogDictionaryService extends BeanService<CatalogDictionaryRepository, CatalogDictionaryServiceConverter, CatalogDictionaryPo, CatalogDictionaryDto, CatalogDictionaryVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<CatalogDictionaryPo> findPage(CatalogDictionaryDto dto) {
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
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
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
public class CatalogDictionaryService implements BeanService<CatalogDictionaryDto> {

    //******************************代码生成方法，请勿改动*************************************//

    private CatalogDictionaryRepository repository;

    private CatalogDictionaryServiceConverter converter;

    private CatalogDictionaryServiceAssembler assembler;

    @Autowired
    public void setCatalogDictionaryRepository(CatalogDictionaryRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setCatalogDictionaryConverter(CatalogDictionaryServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public IPage<CatalogDictionaryDto> findPage(@NotNull CatalogDictionaryDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public CatalogDictionaryDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<CatalogDictionaryDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public int addOne(CatalogDictionaryDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(CatalogDictionaryDto dto) {
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
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
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
public class CatalogDictionaryService implements BeanService<CatalogDictionaryDto> {

    private CatalogDictionaryRepository repository;

    private CatalogDictionaryServiceConverter converter;

    private CatalogDictionaryServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogDictionaryRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogDictionaryServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(CatalogDictionaryDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(CatalogDictionaryDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDictionaryDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDictionaryDto findOne(CatalogDictionaryDto catalogDictionaryDto) {
        return null;
    }

    @Override
    public List<CatalogDictionaryDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<CatalogDictionaryDto> findPage(@NotNull CatalogDictionaryDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
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
public class CatalogDictionaryService implements BeanService<CatalogDictionaryDto> {

    private CatalogDictionaryRepository repository;

    private CatalogDictionaryServiceConverter converter;

    private CatalogDictionaryServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogDictionaryRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogDictionaryServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(CatalogDictionaryDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(CatalogDictionaryDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDictionaryDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDictionaryDto findOne(CatalogDictionaryDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDictionaryDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<CatalogDictionaryDto> findPage(@NotNull CatalogDictionaryDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
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
public class CatalogDictionaryService implements BeanService<CatalogDictionaryDto> {

    private CatalogDictionaryRepository repository;

    private CatalogDictionaryServiceConverter converter;

    private CatalogDictionaryServiceAssembler assembler;

    private CatalogRepository catalogRepository;

    @Autowired
    public void setRepository(CatalogDictionaryRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogDictionaryServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setCatalogRepository(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @Override
    public int addOne(@NotNull CatalogDictionaryDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull CatalogDictionaryDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDictionaryDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDictionaryDto findOne(@NotNull CatalogDictionaryDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDictionaryDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public List<CatalogDictionaryDto> findList(@NotNull CatalogDictionaryDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<CatalogDictionaryDto> findPage(@NotNull CatalogDictionaryDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:45 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
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
public class CatalogDictionaryService implements BeanService<CatalogDictionaryDto> {

    private CatalogDictionaryRepository repository;

    private CatalogDictionaryServiceConverter converter;

    private CatalogDictionaryServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogDictionaryRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogDictionaryServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull CatalogDictionaryDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull CatalogDictionaryDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDictionaryDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDictionaryDto findOne(@NotNull CatalogDictionaryDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDictionaryDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<CatalogDictionaryDto> findList(@NotNull CatalogDictionaryDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<CatalogDictionaryDto> findPage(@NotNull CatalogDictionaryDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:27 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.CatalogDictionaryServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.CatalogDictionaryServiceConverter;
import noice.entity.dto.bean.CatalogDictionaryDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.CatalogDictionaryRepository;
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
public class CatalogDictionaryService implements BeanService<CatalogDictionaryDto> {

    private CatalogDictionaryRepository repository;

    private CatalogDictionaryServiceConverter converter;

    private CatalogDictionaryServiceAssembler assembler;

    @Autowired
    public void setRepository(CatalogDictionaryRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(CatalogDictionaryServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(CatalogDictionaryServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public int addOne(@NotNull CatalogDictionaryDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull CatalogDictionaryDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public CatalogDictionaryDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public CatalogDictionaryDto findOne(@NotNull CatalogDictionaryDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<CatalogDictionaryDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<CatalogDictionaryDto> findList(@NotNull CatalogDictionaryDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<CatalogDictionaryDto> findPage(@NotNull CatalogDictionaryDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new CatalogDictionaryDto()).eqAuto().getQueryWrapper()));
    }

}
```

