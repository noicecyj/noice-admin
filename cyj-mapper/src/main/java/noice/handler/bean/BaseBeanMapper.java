package noice.handler.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.handler.po.BasePoBean;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface BaseBeanMapper extends BaseMapper<BasePoBean> {
}
