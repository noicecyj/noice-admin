## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.PersistentTableConverter;
import noice.handler.bean.BeanService;
import noice.handler.bean.BaseBeanServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentTableService extends BeanService<PersistentTableRepository, PersistentTableConverter, PersistentTablePo, PersistentTableDto, PersistentTableVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentTablePo> findPage(PersistentTableDto dto) {
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
import noice.assembler.bean.PersistentTableServiceAssembler;
import noice.converter.bean.PersistentTableServiceConverter;
import noice.entity.dto.bean.PersistentTableDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableRepository;
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
public class PersistentTableService implements BeanService<PersistentTableDto> {

    private PersistentTableRepository repository;

    private PersistentTableServiceConverter converter;

    private PersistentTableServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentTableDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableDto findOne(PersistentTableDto persistentTableDto) {
        return null;
    }

    @Override
    public List<PersistentTableDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentTableDto> findPage(@NotNull PersistentTableDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableServiceAssembler;
import noice.converter.bean.PersistentTableServiceConverter;
import noice.entity.dto.bean.PersistentTableDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableRepository;
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
public class PersistentTableService implements BeanService<PersistentTableDto> {

    private PersistentTableRepository repository;

    private PersistentTableServiceConverter converter;

    private PersistentTableServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentTableDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableDto findOne(PersistentTableDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentTableDto> findPage(@NotNull PersistentTableDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:40 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableServiceAssembler;
import noice.converter.bean.PersistentTableServiceConverter;
import noice.entity.dto.bean.PersistentTableDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableRepository;
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
public class PersistentTableService implements BeanService<PersistentTableDto> {

    private PersistentTableRepository repository;

    private PersistentTableServiceConverter converter;

    private PersistentTableServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentTableDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentTableDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableDto findOne(PersistentTableDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<PersistentTableDto> findPage(@NotNull PersistentTableDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableServiceAssembler;
import noice.converter.bean.PersistentTableServiceConverter;
import noice.entity.dto.bean.PersistentTableDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableRepository;
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
public class PersistentTableService implements BeanService<PersistentTableDto> {

    private PersistentTableRepository repository;

    private PersistentTableServiceConverter converter;

    private PersistentTableServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentTableDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableDto findOne(@NotNull PersistentTableDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableDto> findList(@NotNull PersistentTableDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableDto> findPage(@NotNull PersistentTableDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:30 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentTableServiceConverter;
import noice.entity.dto.bean.PersistentTableDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableRepository;
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
public class PersistentTableService implements BeanService<PersistentTableDto> {

    private PersistentTableRepository repository;

    private PersistentTableServiceConverter converter;

    private PersistentTableServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentTableDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableDto findOne(@NotNull PersistentTableDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableDto> findList(@NotNull PersistentTableDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableDto> findPage(@NotNull PersistentTableDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentTableDto()).eqAuto().getQueryWrapper()));
    }

}
```

## 2025-01-27 15:59:12 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentTableServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentTableServiceConverter;
import noice.entity.dto.bean.PersistentTableDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentTableRepository;
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
public class PersistentTableService implements BeanService<PersistentTableDto> {

    private PersistentTableRepository repository;

    private PersistentTableServiceConverter converter;

    private PersistentTableServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentTableRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentTableServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentTableServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentTableDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentTableDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentTableDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentTableDto findOne(@NotNull PersistentTableDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentTableDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentTableDto> findList(@NotNull PersistentTableDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentTableDto> findPage(@NotNull PersistentTableDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentTableDto()).getQueryWrapper()));
    }

}
```

