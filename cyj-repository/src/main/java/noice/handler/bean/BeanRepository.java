package noice.handler.bean;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import noice.handler.po.BasePoBean;

import java.util.List;

/**
 * @author Noice
 */
public interface BeanRepository<PO extends BasePoBean> {

    String add(PO po);

    int addBatch(List<PO> poList);

    String delete(PO po);

    int delete(QueryWrapper<PO> queryWrapper);

    int deleteBatch(List<PO> poList);

    int update(PO po);

    boolean insertOrUpdate(PO po);

    int updateBatch(List<PO> poList);

    long count(QueryWrapper<PO> queryWrapper);

    PO find(String id);

    PO find(QueryWrapper<PO> queryWrapper);

    List<PO> findList(List<String> ids);

    List<PO> findList(QueryWrapper<PO> queryWrapper);

    List<PO> findAll();

    IPage<PO> findPage(IPage<PO> page, QueryWrapper<PO> queryWrapper);

    IPage<PO> findPage(IPage<PO> page, PO po);

}