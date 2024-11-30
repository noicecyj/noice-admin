package noice.handler.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
public interface BeanRepository<PO extends BasePoBean> {

    int add(PO po);

    int delete(String id);

    int delete(QueryWrapper<PO> queryWrapper);

    int update(PO po);

    long count(QueryWrapper<PO> queryWrapper);

    PO find(String id);

    PO find(QueryWrapper<PO> queryWrapper);

    List<PO> findList(List<String> ids);

    List<PO> findList(QueryWrapper<PO> queryWrapper);

    IPage<PO> findPage(IPage<PO> page, QueryWrapper<PO> queryWrapper);

    IPage<PO> findPage(IPage<PO> page, PO po);

}