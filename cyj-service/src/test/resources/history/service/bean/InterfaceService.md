## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-11-10 13:24:20 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.InterfaceServiceAssembler;
import noice.converter.bean.InterfaceServiceConverter;
import noice.entity.dto.bean.InterfaceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.InterfaceRepository;
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
public class InterfaceService implements BeanService<InterfaceDto> {

    private InterfaceRepository repository;

    private InterfaceServiceConverter converter;

    private InterfaceServiceAssembler assembler;

    @Autowired
    public void setRepository(InterfaceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(InterfaceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(InterfaceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(InterfaceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public InterfaceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public InterfaceDto findOne(InterfaceDto interfaceDto) {
        return null;
    }

    @Override
    public List<InterfaceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<InterfaceDto> findPage(@NotNull InterfaceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:49 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.InterfaceServiceAssembler;
import noice.converter.bean.InterfaceServiceConverter;
import noice.entity.dto.bean.InterfaceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.InterfaceRepository;
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
public class InterfaceService implements BeanService<InterfaceDto> {

    private InterfaceRepository repository;

    private InterfaceServiceConverter converter;

    private InterfaceServiceAssembler assembler;

    @Autowired
    public void setRepository(InterfaceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(InterfaceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(InterfaceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(InterfaceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public InterfaceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public InterfaceDto findOne(InterfaceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<InterfaceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<InterfaceDto> findPage(@NotNull InterfaceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.InterfaceServiceAssembler;
import noice.converter.bean.InterfaceServiceConverter;
import noice.entity.dto.bean.InterfaceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.InterfaceRepository;
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
public class InterfaceService implements BeanService<InterfaceDto> {

    private InterfaceRepository repository;

    private InterfaceServiceConverter converter;

    private InterfaceServiceAssembler assembler;

    @Autowired
    public void setRepository(InterfaceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(InterfaceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(InterfaceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(InterfaceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public InterfaceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public InterfaceDto findOne(InterfaceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<InterfaceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<InterfaceDto> findPage(@NotNull InterfaceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:46 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.InterfaceServiceAssembler;
import noice.converter.bean.InterfaceServiceConverter;
import noice.entity.dto.bean.InterfaceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.InterfaceRepository;
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
public class InterfaceService implements BeanService<InterfaceDto> {

    private InterfaceRepository repository;

    private InterfaceServiceConverter converter;

    private InterfaceServiceAssembler assembler;

    @Autowired
    public void setRepository(InterfaceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(InterfaceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull InterfaceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull InterfaceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public InterfaceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public InterfaceDto findOne(@NotNull InterfaceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<InterfaceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<InterfaceDto> findList(@NotNull InterfaceDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<InterfaceDto> findPage(@NotNull InterfaceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:28 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.InterfaceServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.InterfaceServiceConverter;
import noice.entity.dto.bean.InterfaceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.InterfaceRepository;
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
public class InterfaceService implements BeanService<InterfaceDto> {

    private InterfaceRepository repository;

    private InterfaceServiceConverter converter;

    private InterfaceServiceAssembler assembler;

    @Autowired
    public void setRepository(InterfaceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(InterfaceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull InterfaceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull InterfaceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public InterfaceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public InterfaceDto findOne(@NotNull InterfaceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<InterfaceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<InterfaceDto> findList(@NotNull InterfaceDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<InterfaceDto> findPage(@NotNull InterfaceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new InterfaceDto()).eqAuto().getQueryWrapper()));
    }

}
```

## 2025-01-27 15:59:10 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.InterfaceServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.InterfaceServiceConverter;
import noice.entity.dto.bean.InterfaceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.InterfaceRepository;
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
public class InterfaceService implements BeanService<InterfaceDto> {

    private InterfaceRepository repository;

    private InterfaceServiceConverter converter;

    private InterfaceServiceAssembler assembler;

    @Autowired
    public void setRepository(InterfaceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(InterfaceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(InterfaceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull InterfaceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull InterfaceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public InterfaceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public InterfaceDto findOne(@NotNull InterfaceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<InterfaceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<InterfaceDto> findList(@NotNull InterfaceDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<InterfaceDto> findPage(@NotNull InterfaceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new InterfaceDto()).getQueryWrapper()));
    }

}
```

