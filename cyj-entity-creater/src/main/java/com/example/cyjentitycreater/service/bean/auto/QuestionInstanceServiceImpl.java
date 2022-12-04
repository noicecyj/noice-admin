package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.QuestionInstance;
import com.example.cyjcommon.mapper.bean.QuestionInstanceMapper;
import com.example.cyjcommon.service.bean.QuestionInstanceService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class QuestionInstanceServiceImpl
        extends ServiceImpl<QuestionInstanceMapper, QuestionInstance>
        implements QuestionInstanceService {

    public QuestionInstance addOne(QuestionInstance po) {
        po.insert();
        return po;
    }

    public void deleteOne(QuestionInstance po) {
        po.deleteById();
    }

    public QuestionInstance updateOne(QuestionInstance po) {
        po.updateById();
        return po;
    }

    public Page<QuestionInstance> findAll(QuestionInstance po, Integer pageNumber, Integer pageSize) {
        Page<QuestionInstance> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<QuestionInstance> queryWrapper = searchHandler(po);
        return new QuestionInstance().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<QuestionInstance> searchHandler(QuestionInstance po) {
        return new QueryWrapper<QuestionInstance>().lambda()
                .like(StringUtils.isNotEmpty(po.getQuestionInstanceAnswer()),
                        QuestionInstance::getQuestionInstanceAnswer, po.getQuestionInstanceAnswer())
                .orderByAsc(QuestionInstance::getSortCode);
    }

    public Page<QuestionInstance> pageQuestionInstanceByTestPaperInstance(QuestionInstance po, Integer pageNumber, Integer pageSize, String testPaperInstanceId) {
        Page<QuestionInstance> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<QuestionInstance> queryWrapper = searchHandler(po);
        queryWrapper.eq(QuestionInstance::getTestPaperInstanceId, testPaperInstanceId);
        return new QuestionInstance().selectPage(page, queryWrapper);
    }
}
