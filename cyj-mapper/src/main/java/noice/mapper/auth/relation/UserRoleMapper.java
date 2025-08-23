package noice.mapper.auth.relation;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.entity.auth.po.relation.UserRolePo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRolePo> {
}