package noice.mapper.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.entity.po.bean.PersistentPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface PersistentMapper extends BaseMapper<PersistentPo> {
}