## 2024-02-09 10:56:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.AppServiceServiceConverter;
import noice.entity.dto.bean.AppServiceDto;
import noice.entity.po.bean.AppServicePo;
import noice.entity.vo.bean.AppServiceVo;
import noice.handler.bean.BeanService;
import noice.repository.bean.AppServiceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AppServiceService extends BeanService<AppServiceRepository, AppServiceServiceConverter, AppServicePo, AppServiceDto, AppServiceVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<AppServicePo> findPage(AppServiceDto dto) {
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
import noice.assembler.bean.AppServiceServiceAssembler;
import noice.converter.bean.AppServiceServiceConverter;
import noice.entity.dto.bean.AppServiceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AppServiceRepository;
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
public class AppServiceService implements BeanService<AppServiceDto> {

    //******************************代码生成方法，请勿改动*************************************//

    private AppServiceRepository repository;

    private AppServiceServiceConverter converter;

    private AppServiceServiceAssembler assembler;

    @Autowired
    public void setRepository(AppServiceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AppServiceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AppServiceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public IPage<AppServiceDto> findPage(@NotNull AppServiceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public AppServiceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<AppServiceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public String addOne(AppServiceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(AppServiceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-11-10 13:59:48 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AppServiceServiceAssembler;
import noice.converter.bean.AppServiceServiceConverter;
import noice.entity.dto.bean.AppServiceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AppServiceRepository;
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
public class AppServiceService implements BeanService<AppServiceDto> {

    private AppServiceRepository repository;

    private AppServiceServiceConverter converter;

    private AppServiceServiceAssembler assembler;

    @Autowired
    public void setRepository(AppServiceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AppServiceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AppServiceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(AppServiceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(AppServiceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AppServiceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AppServiceDto findOne(AppServiceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AppServiceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<AppServiceDto> findPage(@NotNull AppServiceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:37 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AppServiceServiceAssembler;
import noice.converter.bean.AppServiceServiceConverter;
import noice.entity.dto.bean.AppServiceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AppServiceRepository;
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
public class AppServiceService implements BeanService<AppServiceDto> {

    private AppServiceRepository repository;

    private AppServiceServiceConverter converter;

    private AppServiceServiceAssembler assembler;

    @Autowired
    public void setRepository(AppServiceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AppServiceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AppServiceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(AppServiceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(AppServiceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AppServiceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AppServiceDto findOne(AppServiceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AppServiceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<AppServiceDto> findPage(@NotNull AppServiceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:44 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AppServiceServiceAssembler;
import noice.converter.bean.AppServiceServiceConverter;
import noice.entity.dto.bean.AppServiceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AppServiceRepository;
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
public class AppServiceService implements BeanService<AppServiceDto> {

    private AppServiceRepository repository;

    private AppServiceServiceConverter converter;

    private AppServiceServiceAssembler assembler;

    @Autowired
    public void setRepository(AppServiceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AppServiceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AppServiceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull AppServiceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull AppServiceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AppServiceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AppServiceDto findOne(@NotNull AppServiceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AppServiceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<AppServiceDto> findList(@NotNull AppServiceDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<AppServiceDto> findPage(@NotNull AppServiceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AppServiceServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.AppServiceServiceConverter;
import noice.entity.dto.bean.AppServiceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AppServiceRepository;
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
public class AppServiceService implements BeanService<AppServiceDto> {

    private AppServiceRepository repository;

    private AppServiceServiceConverter converter;

    private AppServiceServiceAssembler assembler;

    @Autowired
    public void setRepository(AppServiceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AppServiceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AppServiceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull AppServiceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull AppServiceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AppServiceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AppServiceDto findOne(@NotNull AppServiceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AppServiceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<AppServiceDto> findList(@NotNull AppServiceDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<AppServiceDto> findPage(@NotNull AppServiceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new AppServiceDto()).eqAuto().getQueryWrapper()));
    }

}
```

## 2025-01-27 15:59:08 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.AppServiceServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.AppServiceServiceConverter;
import noice.entity.dto.bean.AppServiceDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.AppServiceRepository;
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
public class AppServiceService implements BeanService<AppServiceDto> {

    private AppServiceRepository repository;

    private AppServiceServiceConverter converter;

    private AppServiceServiceAssembler assembler;

    @Autowired
    public void setRepository(AppServiceRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(AppServiceServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(AppServiceServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull AppServiceDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull AppServiceDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public AppServiceDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public AppServiceDto findOne(@NotNull AppServiceDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<AppServiceDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<AppServiceDto> findList(@NotNull AppServiceDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<AppServiceDto> findPage(@NotNull AppServiceDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new AppServiceDto()).getQueryWrapper()));
    }

}
```

