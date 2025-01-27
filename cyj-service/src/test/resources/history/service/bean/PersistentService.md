## 2024-02-09 10:56:14 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPo;
import noice.entity.vo.bean.PersistentVo;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentService extends BeanService<PersistentRepository, PersistentServiceConverter, PersistentPo, PersistentDto, PersistentVo> {

    //******************************代码生成方法，请勿改动*************************************//

    public IPage<PersistentPo> findPage(PersistentDto dto) {
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
import noice.assembler.bean.PersistentServiceAssembler;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    //******************************代码生成方法，请勿改动*************************************//

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public String addOne(PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    //******************************代码生成方法，请勿改动*************************************//

//
//    private PersistentFormService persistentFormService;
//    private PersistentTableService persistentTableService;
//    private PersistentPropertyRepository persistentPropertyRepository;
//    private PersistentRepository appServiceRepository;
//
//    @Autowired
//    public void setPersistentFormService(PersistentFormService persistentFormService) {
//        this.persistentFormService = persistentFormService;
//    }
//
//    @Autowired
//    public void setPersistentTableService(PersistentTableService persistentTableService) {
//        this.persistentTableService = persistentTableService;
//    }
//
//    @Autowired
//    public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
//        this.persistentPropertyRepository = persistentPropertyRepository;
//    }
//
//    @Autowired
//    public void setPersistentRepository(PersistentRepository appServiceRepository) {
//        this.appServiceRepository = appServiceRepository;
//    }
//
//    public JSONObject findDataTableAndFormByName(PersistentDto persistentDto) {
//        PersistentPo persistentPo = getBaseRepository().findOne(new SearchModel<>(persistentDto));
//        logger.info("findDataTableAndFormByName.persistentPo:{}", persistentPo);
//        if (persistentPo == null) {
//            return null;
//        }
//        persistentDto = new PersistentDto();
//        persistentDto.setId(persistentPo.getId());
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("dataForm", persistentFormService.getDataForm(persistentDto));
//        jsonObject.put("dataTable", persistentTableService.getDataTable(persistentDto));
//        JSONArray subBean = new JSONArray();
//        PersistentPropertyDto persistentPropertyDto = new PersistentPropertyDto();
//        persistentPropertyDto.setPersistentId(persistentPo.getId());
//        List<PersistentPropertyPo> persistentPropertyBeanList = persistentPropertyRepository.findList(new SearchModel<>(persistentPropertyDto));
//        for (PersistentPropertyPo persistentPropertyBean : persistentPropertyBeanList) {
//            if (persistentPropertyBean.getPersistentPropertyCode().equals(persistentPo.getPersistentCode() + "_id")) {
//                PersistentDto appServiceDto = new PersistentDto();
//                appServiceDto.setId(persistentPo.getPersistentId());
//                PersistentPo appServiceBean = appServiceRepository.findOne(new SearchModel<>(appServiceDto));
//                String underPoName = BeanUtils.underline2Camel(persistentPo.getPersistentCode());
//                //文件名
//                String poName = BeanUtils.captureName(underPoName);
//                JSONObject sub = new JSONObject();
//                sub.put("url", "/" + appServiceBean.getPersistentCode() + "/" + poName);
//                sub.put("name", persistentPo.getPersistentName());
//                sub.put("key", BeanUtils.underline2Camel(persistentPo.getPersistentCode()) + "Id");
//                sub.put("selfFlag", true);
//                subBean.add(sub);
//            }
//        }
//        PersistentDto persistentDto2 = new PersistentDto();
//        persistentDto2.setPersistentId(persistentPo.getId());
//        List<PersistentPo> persistentBeanList = getBaseRepository().findList(new SearchModel<>(persistentDto2));
//        if (persistentBeanList.isEmpty()) {
//            jsonObject.put("subData", subBean);
//            return jsonObject;
//        } else {
//            for (PersistentPo persistentBean : persistentBeanList) {
//                PersistentDto appServiceDto = new PersistentDto();
//                appServiceDto.setId(persistentBean.getPersistentId());
//                PersistentPo appServiceBean = appServiceRepository.findOne(new SearchModel<>(appServiceDto));
//                String underPoName = BeanUtils.underline2Camel(persistentBean.getPersistentCode());
//                //文件名
//                String poName = BeanUtils.captureName(underPoName);
//                JSONObject sub = new JSONObject();
//                sub.put("url", "/" + appServiceBean.getPersistentCode() + "/" + poName);
//                sub.put("name", persistentBean.getPersistentName());
//                sub.put("key", BeanUtils.underline2Camel(persistentBean.getPersistentCode()) + "Id");
//                sub.put("selfFlag", false);
//                subBean.add(sub);
//            }
//            jsonObject.put("subData", subBean);
//        }
//        return jsonObject;
//    }

}
```

## 2024-11-10 13:24:21 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(PersistentDto persistentDto) {
        return null;
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 13:59:50 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(PersistentDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-11-10 15:11:39 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(PersistentDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

}
```

## 2024-12-15 13:19:47 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(@NotNull PersistentDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentDto> findList(@NotNull PersistentDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    public List<OptionDTO> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentDto()).eqAuto().getQueryWrapper()));
    }

}
```

## 2025-01-25 21:16:28 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(@NotNull PersistentDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentDto> findList(@NotNull PersistentDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentDto()).eqAuto().getQueryWrapper()));
    }

}
```

## 2025-01-27 15:59:11 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Override
    public String addOne(@NotNull PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public int deleteOne(String id) {
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(@NotNull PersistentDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentDto> findList(@NotNull PersistentDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentDto()).getQueryWrapper()));
    }

}
```

## 2025-01-27 22:13:52 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.handler.bean.BeanService;
import noice.repository.bean.PersistentPropertyRepository;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    private PersistentPropertyRepository persistentPropertyRepository;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
        this.persistentPropertyRepository = persistentPropertyRepository;
    }

    @Override
    public String addOne(@NotNull PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        persistentPropertyRepository.delete(new PersistentPropertyPo().eqPersistentId(id).getQueryWrapper());
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(@NotNull PersistentDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentDto> findList(@NotNull PersistentDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentDto()).getQueryWrapper()));
    }

}
```

## 2025-01-27 22:20:26 noice 作者大大 曹元杰 天才 笔记本

```java
package noice.service.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import noice.assembler.bean.PersistentServiceAssembler;
import noice.common.entity.dto.OptionDTO;
import noice.converter.bean.PersistentServiceConverter;
import noice.entity.dto.bean.PersistentDto;
import noice.entity.po.bean.InterfacePo;
import noice.entity.po.bean.PersistentFormPo;
import noice.entity.po.bean.PersistentPo;
import noice.entity.po.bean.PersistentPropertyPo;
import noice.entity.po.bean.PersistentTablePo;
import noice.handler.bean.BeanService;
import noice.repository.bean.InterfaceRepository;
import noice.repository.bean.PersistentFormRepository;
import noice.repository.bean.PersistentPropertyRepository;
import noice.repository.bean.PersistentRepository;
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
public class PersistentService implements BeanService<PersistentDto> {

    private PersistentRepository repository;

    private PersistentServiceConverter converter;

    private PersistentServiceAssembler assembler;

    private InterfaceRepository interfaceRepository;

    private PersistentRepository persistentRepository;

    private PersistentTableRepository persistentTableRepository;

    private PersistentFormRepository persistentFormRepository;

    private PersistentPropertyRepository persistentPropertyRepository;

    @Autowired
    public void setRepository(PersistentRepository repository) {
        this.repository = repository;
    }

    @Autowired
    public void setConverter(PersistentServiceConverter converter) {
        this.converter = converter;
    }

    @Autowired
    public void setAssembler(PersistentServiceAssembler assembler) {
        this.assembler = assembler;
    }

    @Autowired
    public void setInterfaceRepository(InterfaceRepository interfaceRepository) {
        this.interfaceRepository = interfaceRepository;
    }

    @Autowired
    public void setPersistentRepository(PersistentRepository persistentRepository) {
        this.persistentRepository = persistentRepository;
    }

    @Autowired
    public void setPersistentTableRepository(PersistentTableRepository persistentTableRepository) {
        this.persistentTableRepository = persistentTableRepository;
    }

    @Autowired
    public void setPersistentFormRepository(PersistentFormRepository persistentFormRepository) {
        this.persistentFormRepository = persistentFormRepository;
    }

    @Autowired
    public void setPersistentPropertyRepository(PersistentPropertyRepository persistentPropertyRepository) {
        this.persistentPropertyRepository = persistentPropertyRepository;
    }

    @Override
    public String addOne(@NotNull PersistentDto dto) {
        return repository.add(converter.dtoToPo(dto));
    }

    @Override
    public String deleteOne(String id) {
        interfaceRepository.findList(new InterfacePo().eqPersistentId(id).getQueryWrapper()).forEach(po -> interfaceRepository.update(po.eqPersistentId(null)));
        persistentRepository.findList(new PersistentPo().eqPersistentId(id).getQueryWrapper()).forEach(po -> persistentRepository.update(po.eqPersistentId(null)));
        persistentTableRepository.findList(new PersistentTablePo().eqPersistentId(id).getQueryWrapper()).forEach(po -> persistentTableRepository.update(po.eqPersistentId(null)));
        persistentFormRepository.findList(new PersistentFormPo().eqPersistentId(id).getQueryWrapper()).forEach(po -> persistentFormRepository.update(po.eqPersistentId(null)));
        persistentPropertyRepository.findList(new PersistentPropertyPo().eqPersistentId(id).getQueryWrapper()).forEach(po -> persistentPropertyRepository.update(po.eqPersistentId(null)));
        return repository.delete(id);
    }

    @Override
    public int updateOne(@NotNull PersistentDto dto) {
        return repository.update(converter.dtoToPo(dto));
    }

    @Override
    public PersistentDto findOne(String id) {
        return assembler.poToDto(repository.find(id));
    }

    @Override
    public PersistentDto findOne(@NotNull PersistentDto dto) {
        return assembler.poToDto(repository.find(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public List<PersistentDto> findList(List<String> ids) {
        return assembler.poListToDtoList(repository.findList(ids));
    }

    @Override
    public List<PersistentDto> findList(@NotNull PersistentDto dto) {
        return assembler.poListToDtoList(repository.findList(converter.dtoToPo(dto).eqAuto().getQueryWrapper()));
    }

    @Override
    public IPage<PersistentDto> findPage(@NotNull PersistentDto dto) {
        return repository.findPage(new Page<>(dto.getCurrent(), dto.getPageSize()), converter.dtoToPo(dto)).convert(po -> assembler.poToDto(po));
    }

    @Override
    public List<OptionDTO<String>> getOptions() {
        return assembler.poListToDtoOptionList(repository.findList(converter.dtoToPo(new PersistentDto()).getQueryWrapper()));
    }

}
```

