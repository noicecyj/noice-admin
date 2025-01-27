## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.entity.vo.bean.PersistentPropertyVo;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentPropertyService extends BeanService<PersistentPropertyRepository, PersistentPropertyServiceConverter, PersistentPropertyPo, PersistentPropertyDto, PersistentPropertyVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentPropertyPo> findPage(PersistentPropertyDto dto) {
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
import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
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
public class PersistentPropertyService implements BeanService<PersistentPropertyDto> {

    //******************************代码生成方法，请勿改动*************************************//

    private PersistentPropertyRepository repository;

    private PersistentPropertyServiceConverter converter;

    private PersistentPropertyServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentPropertyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentPropertyServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public IPage<PersistentPropertyDto> findPage(@NotNull PersistentPropertyDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public PersistentPropertyDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<PersistentPropertyDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public String addOne(PersistentPropertyDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentPropertyDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-11-10 13:24:23 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
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
public class PersistentPropertyService implements BeanService<PersistentPropertyDto> {

    private PersistentPropertyRepository repository;

    private PersistentPropertyServiceConverter converter;

    private PersistentPropertyServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentPropertyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentPropertyServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentPropertyDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentPropertyDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentPropertyDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentPropertyDto findOne(PersistentPropertyDto persistentPropertyDto) {
        return null;
    }

    @Override
    public List<PersistentPropertyDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentPropertyDto> findPage(@NotNull PersistentPropertyDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
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
public class PersistentPropertyService implements BeanService<PersistentPropertyDto> {

    private PersistentPropertyRepository repository;

    private PersistentPropertyServiceConverter converter;

    private PersistentPropertyServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentPropertyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentPropertyServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentPropertyDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentPropertyDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentPropertyDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentPropertyDto findOne(PersistentPropertyDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentPropertyDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentPropertyDto> findPage(@NotNull PersistentPropertyDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:40 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
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
public class PersistentPropertyService implements BeanService<PersistentPropertyDto> {

    private PersistentPropertyRepository repository;

    private PersistentPropertyServiceConverter converter;

    private PersistentPropertyServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentPropertyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentPropertyServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentPropertyDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentPropertyDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentPropertyDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentPropertyDto findOne(PersistentPropertyDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentPropertyDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<PersistentPropertyDto> findPage(@NotNull PersistentPropertyDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
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
public class PersistentPropertyService implements BeanService<PersistentPropertyDto> {

    private PersistentPropertyRepository repository;

    private PersistentPropertyServiceConverter converter;

    private PersistentPropertyServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentPropertyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentPropertyServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentPropertyDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentPropertyDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentPropertyDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentPropertyDto findOne(@NotNull PersistentPropertyDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentPropertyDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentPropertyDto> findList(@NotNull PersistentPropertyDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentPropertyDto> findPage(@NotNull PersistentPropertyDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:30 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
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
public class PersistentPropertyService implements BeanService<PersistentPropertyDto> {

    private PersistentPropertyRepository repository;

    private PersistentPropertyServiceConverter converter;

    private PersistentPropertyServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentPropertyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentPropertyServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentPropertyDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentPropertyDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentPropertyDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentPropertyDto findOne(@NotNull PersistentPropertyDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentPropertyDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentPropertyDto> findList(@NotNull PersistentPropertyDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentPropertyDto> findPage(@NotNull PersistentPropertyDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentPropertyDto()).eqAuto().getQueryWrapper()));
    }

}
```

## 2025-01-27 15:59:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentPropertyServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentPropertyServiceConverter;
import noice.entity.dto.bean.PersistentPropertyDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
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
public class PersistentPropertyService implements BeanService<PersistentPropertyDto> {

    private PersistentPropertyRepository repository;

    private PersistentPropertyServiceConverter converter;

    private PersistentPropertyServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentPropertyRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentPropertyServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentPropertyServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentPropertyDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentPropertyDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentPropertyDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentPropertyDto findOne(@NotNull PersistentPropertyDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentPropertyDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentPropertyDto> findList(@NotNull PersistentPropertyDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentPropertyDto> findPage(@NotNull PersistentPropertyDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentPropertyDto()).getQueryWrapper()));
    }

}
```

