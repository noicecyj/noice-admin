package com.example.cyjentitycreater.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.TestInstance;
import com.example.cyjcommon.mapper.bean.TestInstanceMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TestInstanceServiceImpl
        extends ServiceImpl<TestInstanceMapper, TestInstance>
        implements IService<TestInstance> {

    public TestInstance addOne(TestInstance po) {
        po.insert();
        return po;
    }

    public void deleteOne(TestInstance po) {
        po.deleteById();
    }

    public TestInstance updateOne(TestInstance po) {
        po.updateById();
        return po;
    }

    public Page<TestInstance> findAll(TestInstance po, Integer pageNumber, Integer pageSize) {
        Page<TestInstance> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<TestInstance> queryWrapper = searchHandler(po);
        return new TestInstance().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<TestInstance> searchHandler(TestInstance po) {
        return new QueryWrapper<TestInstance>().lambda()
                .like(StringUtils.isNotEmpty(po.getTestInstanceName()),
                        TestInstance::getTestInstanceName, po.getTestInstanceName())
                .orderByAsc(TestInstance::getSortCode);
    }

//    public Page<QuestionInstanceAnswer> pageQuestionInstanceAnswerByTestInstance(Integer pageNumber, String id) {
//        Pageable pageable = PageRequest.of(pageNumber - 1, 13, Sort.by("sortCode").ascending());
//        TestInstance po = dao.getOne(id);
//        QuestionInstanceAnswer questionInstanceAnswer = new QuestionInstanceAnswer();
//        questionInstanceAnswer.setTestInstance(po);
//        Example<QuestionInstanceAnswer> example = Example.of(questionInstanceAnswer);
//        return questionInstanceAnswerMapper.findAll(example, pageable);
//    }

}
