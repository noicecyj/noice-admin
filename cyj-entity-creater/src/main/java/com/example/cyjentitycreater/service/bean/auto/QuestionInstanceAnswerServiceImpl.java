package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.QuestionInstanceAnswer;
import com.example.cyjentitycreater.mapper.bean.QuestionInstanceAnswerMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class QuestionInstanceAnswerServiceImpl
        extends ServiceImpl<QuestionInstanceAnswerMapper, QuestionInstanceAnswer>
        implements IService<QuestionInstanceAnswer> {

    public QuestionInstanceAnswer addOne(QuestionInstanceAnswer po) {
        po.insert();
        return po;
    }

    public void deleteOne(QuestionInstanceAnswer po) {
        po.deleteById();
    }

    public QuestionInstanceAnswer updateOne(QuestionInstanceAnswer po) {
        po.updateById();
        return po;
    }

    public Page<QuestionInstanceAnswer> findAll(QuestionInstanceAnswer po, Integer pageNumber, Integer pageSize) {
        Page<QuestionInstanceAnswer> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<QuestionInstanceAnswer> queryWrapper = searchHandler(po);
        return new QuestionInstanceAnswer().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<QuestionInstanceAnswer> searchHandler(QuestionInstanceAnswer po) {
        return new QueryWrapper<QuestionInstanceAnswer>().lambda()
                .like(StringUtils.isNotEmpty(po.getTestInstanceAnswerContext()),
                        QuestionInstanceAnswer::getTestInstanceAnswerContext, po.getTestInstanceAnswerContext())
                .orderByAsc(QuestionInstanceAnswer::getSortCode);
    }

    public Page<QuestionInstanceAnswer> pageQuestionInstanceAnswerByTestInstance(QuestionInstanceAnswer po, Integer pageNumber, Integer pageSize, String testInstanceId) {
        Page<QuestionInstanceAnswer> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<QuestionInstanceAnswer> queryWrapper = searchHandler(po);
        queryWrapper.eq(QuestionInstanceAnswer::getTestInstanceId, testInstanceId);
        return new QuestionInstanceAnswer().selectPage(page, queryWrapper);
    }
}
