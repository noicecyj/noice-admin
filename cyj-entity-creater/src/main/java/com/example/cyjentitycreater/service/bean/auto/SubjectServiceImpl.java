package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Subject;
import com.example.cyjentitycreater.mapper.bean.SubjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SubjectServiceImpl
        extends ServiceImpl<SubjectMapper, Subject>
        implements IService<Subject> {

    public Subject addOne(Subject po) {
        po.insert();
        return po;
    }

    public void deleteOne(Subject po) {
        po.deleteById();
    }

    public Subject updateOne(Subject po) {
        po.updateById();
        return po;
    }

    public Page<Subject> findAll(Subject po, Integer pageNumber, Integer pageSize) {
        Page<Subject> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Subject> queryWrapper = searchHandler(po);
        return new Subject().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Subject> searchHandler(Subject po) {
        return new QueryWrapper<Subject>().lambda()
                .like(StringUtils.isNotEmpty(po.getSubjectName()),
                        Subject::getSubjectName, po.getSubjectName())
                .orderByAsc(Subject::getSortCode);
    }

}
