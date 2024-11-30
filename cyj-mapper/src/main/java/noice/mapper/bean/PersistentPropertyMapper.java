package noice.mapper.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.entity.po.bean.PersistentPropertyPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface PersistentPropertyMapper extends BaseMapper<PersistentPropertyPo> {
}