package noice.handler.bean;

import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.handler.dto.BaseDtoBean;

import java.util.List;

/**
 * @author Noice
 */
public interface BeanService<DTO extends BaseDtoBean> {

    IPage<DTO> findPage(DTO dto);

    DTO findOne(String id);

    DTO findOne(DTO dto);

    List<DTO> findList(List<String> ids);

    List<DTO> findList(DTO dto);

    int addOne(DTO dto);

    int deleteOne(String id);

    int updateOne(DTO dto);

}