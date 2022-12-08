package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.Question;
import com.example.cyjcommon.mapper.bean.QuestionMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class QuestionServiceImpl
        extends ServiceImpl<QuestionMapper, Question>
        implements IService<Question> {

    public Question addOne(Question po) {
        po.insert();
        return po;
    }

    public void deleteOne(Question po) {
        po.deleteById();
    }

    public Question updateOne(Question po) {
        po.updateById();
        return po;
    }

    public Page<Question> findAll(Question po, Integer pageNumber, Integer pageSize) {
        Page<Question> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Question> queryWrapper = searchHandler(po);
        return new Question().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<Question> searchHandler(Question po) {
        return new QueryWrapper<Question>().lambda()
                .like(StringUtils.isNotEmpty(po.getQuestionName()),
                        Question::getQuestionName, po.getQuestionName())
                .orderByAsc(Question::getSortCode);
    }

    public Page<Question> pageQuestionByQuestionBase(Question po, Integer pageNumber, Integer pageSize, String questionBaseId) {
        Page<Question> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<Question> queryWrapper = searchHandler(po);
        queryWrapper.eq(Question::getQuestionBaseId, questionBaseId);
        return new Question().selectPage(page, queryWrapper);
    }
}
