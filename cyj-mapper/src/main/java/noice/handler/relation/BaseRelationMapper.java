package noice.handler.relation;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import noice.handler.po.BasePoRelation;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Noice
 */
@Mapper
public interface BaseRelationMapper extends BaseMapper<BasePoRelation> {
}
