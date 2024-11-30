package noice.mapper.relation;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.entity.po.relation.UserRolePo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRolePo> {
}