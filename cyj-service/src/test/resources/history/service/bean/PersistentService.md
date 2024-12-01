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
    public int addOne(PersistentDto dto) {
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
    public int addOne(PersistentDto dto) {
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
    public int addOne(PersistentDto dto) {
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
    public int addOne(PersistentDto dto) {
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
