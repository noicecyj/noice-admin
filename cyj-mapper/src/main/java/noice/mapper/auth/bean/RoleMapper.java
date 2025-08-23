package noice.mapper.auth.bean;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.entity.auth.po.bean.RolePo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface RoleMapper extends BaseMapper<RolePo> {
}