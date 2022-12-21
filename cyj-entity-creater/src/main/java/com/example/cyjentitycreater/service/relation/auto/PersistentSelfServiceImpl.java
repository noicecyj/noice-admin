package com.example.cyjentitycreater.service.relation.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.relation.PersistentSelfRelation;
import com.example.cyjcommon.mapper.relation.PersistentSelfMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PersistentSelfServiceImpl
        extends ServiceImpl<PersistentSelfMapper, PersistentSelfRelation>
        implements IService<PersistentSelfRelation> {

    public List<PersistentSelfRelation> getPersistentSelf(PersistentSelfRelation po) {
        return new PersistentSelfRelation().selectList(new LambdaQueryWrapper<PersistentSelfRelation>()
                .eq(StringUtils.isNotEmpty(po.getPersistentId()),
                        PersistentSelfRelation::getPersistentId, po.getPersistentId())
                .eq(StringUtils.isNotEmpty(po.getParentPersistentId()),
                        PersistentSelfRelation::getParentPersistentId, po.getParentPersistentId())
        );
    }

    public void setPersistentSelf(PersistentSelfRelation po, List<PersistentSelfRelation> newPersistentSelfList) {
        List<PersistentSelfRelation> oldPersistentSelfList = getPersistentSelf(po);
        for (PersistentSelfRelation oldPersistentSelf : oldPersistentSelfList) {
            oldPersistentSelf.deleteById();
        }
        for (PersistentSelfRelation newPersistentSelf : newPersistentSelfList) {
            newPersistentSelf.insert();
        }
    }

}