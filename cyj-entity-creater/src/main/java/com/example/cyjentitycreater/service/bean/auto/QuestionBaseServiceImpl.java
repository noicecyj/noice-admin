package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.QuestionBase;
import com.example.cyjcommon.mapper.bean.QuestionBaseMapper;
import com.example.cyjcommon.service.bean.QuestionBaseService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class QuestionBaseServiceImpl
        extends ServiceImpl<QuestionBaseMapper, QuestionBase>
        implements QuestionBaseService {

    public QuestionBase addOne(QuestionBase po) {
        po.insert();
        return po;
    }

    public void deleteOne(QuestionBase po) {
        po.deleteById();
    }

    public QuestionBase updateOne(QuestionBase po) {
        po.updateById();
        return po;
    }

    public Page<QuestionBase> findAll(QuestionBase po, Integer pageNumber, Integer pageSize) {
        Page<QuestionBase> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<QuestionBase> queryWrapper = searchHandler(po);
        return new QuestionBase().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<QuestionBase> searchHandler(QuestionBase po) {
        return new QueryWrapper<QuestionBase>().lambda()
                .like(StringUtils.isNotEmpty(po.getQuestionBaseName()), QuestionBase::getQuestionBaseName, po.getQuestionBaseName())
                .orderByAsc(QuestionBase::getSortCode);
    }

//    public Page<Question> pageQuestionByQuestionBase(Integer pageNumber, String id) {
//        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
//        QuestionBase po = dao.getOne(id);
//        Question question = new Question();
//        question.setQuestionBase(po);
//        Example<Question> example = Example.of(question);
//        return questionMapper.findAll(example, pageable);
//    }

}