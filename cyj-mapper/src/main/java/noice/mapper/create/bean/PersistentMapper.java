package noice.mapper.create.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.entity.create.po.bean.PersistentPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface PersistentMapper extends BaseMapper<PersistentPo> {
}