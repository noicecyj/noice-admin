## 2024-02-09 10:56:15 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.SqlConverter;
import noice.handler.bean.BeanService;
import noice.handler.bean.BaseBeanServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SqlService extends BeanService<SqlRepository, SqlConverter, SqlPo, SqlDto, SqlVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<SqlPo> findPage(SqlDto dto) {
        return getBaseRepository().findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), getBaseConverter().dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

}
```

## 2024-03-24 00:35:19 noice 作者大大 曹元杰 天才 笔记本

```java
```

## 2024-11-10 13:24:24 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.SqlServiceAssembler;
import noice.converter.bean.SqlServiceConverter;
import noice.entity.dto.bean.SqlDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.SqlRepository;
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
public class SqlService implements BeanService<SqlDto> {

    private SqlRepository repository;

    private SqlServiceConverter converter;

    private SqlServiceAssembler assembler;

    @Autowired
    public void setRepository(SqlRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(SqlServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(SqlDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(SqlDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public SqlDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public SqlDto findOne(SqlDto sqlDto) {
        return null;
    }

    @Override
    public List<SqlDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<SqlDto> findPage(@NotNull SqlDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:53 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.SqlServiceAssembler;
import noice.converter.bean.SqlServiceConverter;
import noice.entity.dto.bean.SqlDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.SqlRepository;
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
public class SqlService implements BeanService<SqlDto> {

    private SqlRepository repository;

    private SqlServiceConverter converter;

    private SqlServiceAssembler assembler;

    @Autowired
    public void setRepository(SqlRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(SqlServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(SqlDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(SqlDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public SqlDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public SqlDto findOne(SqlDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<SqlDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<SqlDto> findPage(@NotNull SqlDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:42 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.SqlServiceAssembler;
import noice.converter.bean.SqlServiceConverter;
import noice.entity.dto.bean.SqlDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.SqlRepository;
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
public class SqlService implements BeanService<SqlDto> {

    private SqlRepository repository;

    private SqlServiceConverter converter;

    private SqlServiceAssembler assembler;

    @Autowired
    public void setRepository(SqlRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(SqlServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(SqlDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(SqlDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public SqlDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public SqlDto findOne(SqlDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<SqlDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<SqlDto> findPage(@NotNull SqlDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.SqlServiceAssembler;
import noice.converter.bean.SqlServiceConverter;
import noice.entity.dto.bean.SqlDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.SqlRepository;
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
public class SqlService implements BeanService<SqlDto> {

    private SqlRepository repository;

    private SqlServiceConverter converter;

    private SqlServiceAssembler assembler;

    @Autowired
    public void setRepository(SqlRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(SqlServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull SqlDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull SqlDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public SqlDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public SqlDto findOne(@NotNull SqlDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<SqlDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<SqlDto> findList(@NotNull SqlDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<SqlDto> findPage(@NotNull SqlDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2025-01-25 21:16:31 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.SqlServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.SqlServiceConverter;
import noice.entity.dto.bean.SqlDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.SqlRepository;
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
public class SqlService implements BeanService<SqlDto> {

    private SqlRepository repository;

    private SqlServiceConverter converter;

    private SqlServiceAssembler assembler;

    @Autowired
    public void setRepository(SqlRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(SqlServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull SqlDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull SqlDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public SqlDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public SqlDto findOne(@NotNull SqlDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<SqlDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<SqlDto> findList(@NotNull SqlDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<SqlDto> findPage(@NotNull SqlDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new SqlDto()).eqAuto().getQueryWrapper()));
    }

}
```

## 2025-01-27 15:59:13 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.SqlServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.SqlServiceConverter;
import noice.entity.dto.bean.SqlDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.SqlRepository;
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
public class SqlService implements BeanService<SqlDto> {

    private SqlRepository repository;

    private SqlServiceConverter converter;

    private SqlServiceAssembler assembler;

    @Autowired
    public void setRepository(SqlRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(SqlServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(SqlServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull SqlDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull SqlDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public SqlDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public SqlDto findOne(@NotNull SqlDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<SqlDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<SqlDto> findList(@NotNull SqlDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<SqlDto> findPage(@NotNull SqlDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new SqlDto()).getQueryWrapper()));
    }

}
```

