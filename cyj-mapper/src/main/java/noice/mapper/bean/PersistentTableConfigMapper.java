package noice.mapper.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.entity.po.bean.PersistentTableConfigPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface PersistentTableConfigMapper extends BaseMapper<PersistentTableConfigPo> {
}