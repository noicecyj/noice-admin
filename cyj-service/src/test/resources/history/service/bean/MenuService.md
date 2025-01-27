## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.MenuConverter;
import noice.handler.bean.BeanService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MenuService extends BeanService<MenuRepository, MenuConverter, MenuPo, MenuDto, MenuVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<MenuPo> findPage(MenuDto dto) {
        return getBaseRepository().findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), getBaseConverter().dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-17 22:14:58 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-11-10 13:24:21 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.MenuServiceAssembler;
import noice.converter.bean.MenuServiceConverter;
import noice.entity.dto.bean.MenuDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.MenuRepository;
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
public class MenuService implements BeanService<MenuDto> {

    private MenuRepository repository;

    private MenuServiceConverter converter;

    private MenuServiceAssembler assembler;

    @Autowired
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(MenuServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(MenuDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(MenuDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public MenuDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public MenuDto findOne(MenuDto menuDto) {
        return null;
    }

    @Override
    public List<MenuDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<MenuDto> findPage(@NotNull MenuDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.MenuServiceAssembler;
import noice.converter.bean.MenuServiceConverter;
import noice.entity.dto.bean.MenuDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.MenuRepository;
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
public class MenuService implements BeanService<MenuDto> {

    private MenuRepository repository;

    private MenuServiceConverter converter;

    private MenuServiceAssembler assembler;

    @Autowired
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(MenuServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(MenuDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(MenuDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public MenuDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public MenuDto findOne(MenuDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<MenuDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<MenuDto> findPage(@NotNull MenuDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:38 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.MenuServiceAssembler;
import noice.converter.bean.MenuServiceConverter;
import noice.entity.dto.bean.MenuDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.MenuRepository;
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
public class MenuService implements BeanService<MenuDto> {

    private MenuRepository repository;

    private MenuServiceConverter converter;

    private MenuServiceAssembler assembler;

    @Autowired
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(MenuServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(MenuDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(MenuDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public MenuDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public MenuDto findOne(MenuDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<MenuDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<MenuDto> findPage(@NotNull MenuDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:46 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.MenuServiceAssembler;
import noice.converter.bean.MenuServiceConverter;
import noice.entity.dto.bean.MenuDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.MenuRepository;
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
public class MenuService implements BeanService<MenuDto> {

    private MenuRepository repository;

    private MenuServiceConverter converter;

    private MenuServiceAssembler assembler;

    @Autowired
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(MenuServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull MenuDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull MenuDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public MenuDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public MenuDto findOne(@NotNull MenuDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<MenuDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<MenuDto> findList(@NotNull MenuDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<MenuDto> findPage(@NotNull MenuDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:28 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.MenuServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.MenuServiceConverter;
import noice.entity.dto.bean.MenuDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.MenuRepository;
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
public class MenuService implements BeanService<MenuDto> {

    private MenuRepository repository;

    private MenuServiceConverter converter;

    private MenuServiceAssembler assembler;

    @Autowired
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(MenuServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull MenuDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull MenuDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public MenuDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public MenuDto findOne(@NotNull MenuDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<MenuDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<MenuDto> findList(@NotNull MenuDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<MenuDto> findPage(@NotNull MenuDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new MenuDto()).eqAuto().getQueryWrapper()));
    }

}
```

## 2025-01-27 15:59:10 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.MenuServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.MenuServiceConverter;
import noice.entity.dto.bean.MenuDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.MenuRepository;
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
public class MenuService implements BeanService<MenuDto> {

    private MenuRepository repository;

    private MenuServiceConverter converter;

    private MenuServiceAssembler assembler;

    @Autowired
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(MenuServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull MenuDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull MenuDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public MenuDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public MenuDto findOne(@NotNull MenuDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<MenuDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<MenuDto> findList(@NotNull MenuDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<MenuDto> findPage(@NotNull MenuDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new MenuDto()).getQueryWrapper()));
    }

}
```

## 2025-01-27 22:13:51 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.MenuServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.MenuServiceConverter;
import noice.entity.dto.bean.MenuDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.MenuRepository;
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
public class MenuService implements BeanService<MenuDto> {

    private MenuRepository repository;

    private MenuServiceConverter converter;

    private MenuServiceAssembler assembler;

    @Autowired
    public void setRepository(MenuRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(MenuServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(MenuServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull MenuDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull MenuDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public MenuDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public MenuDto findOne(@NotNull MenuDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<MenuDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<MenuDto> findList(@NotNull MenuDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<MenuDto> findPage(@NotNull MenuDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new MenuDto()).getQueryWrapper()));
    }

}
```

