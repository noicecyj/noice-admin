package noice.handler.relation;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import noice.handler.po.BasePoRelation;

import java.util.List;

/**
 * @author Noice
 */
public interface RelationRepository<PO extends BasePoRelation> {

    long count(QueryWrapper<PO> queryWrapper);

    List<PO> findList(PO po);

    List<PO> findList(QueryWrapper<PO> queryWrapper);

    PO find(PO po);

    PO find(QueryWrapper<PO> queryWrapper);

    int add(PO po);

    int delete(String id);

}