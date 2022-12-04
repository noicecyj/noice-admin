package com.example.cyjworkflow.service.bean.auto;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cyjcommon.entity.bean.LoanApproval;
import com.example.cyjcommon.mapper.bean.LoanApprovalMapper;
import com.example.cyjcommon.service.bean.LoanApprovalService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Noice
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class LoanApprovalServiceImpl
        extends ServiceImpl<LoanApprovalMapper, LoanApproval>
        implements LoanApprovalService {

    public LoanApproval addOne(LoanApproval po) {
        po.insert();
        return po;
    }

    public void deleteOne(LoanApproval po) {
        po.deleteById();
    }

    public LoanApproval updateOne(LoanApproval po) {
        po.updateById();
        return po;
    }

    public Page<LoanApproval> findAll(LoanApproval po, Integer pageNumber, Integer pageSize) {
        Page<LoanApproval> page = new Page<>(pageNumber, pageSize);
        LambdaQueryWrapper<LoanApproval> queryWrapper = searchHandler(po);
        return new LoanApproval().selectPage(page, queryWrapper);
    }

    private LambdaQueryWrapper<LoanApproval> searchHandler(LoanApproval po) {
        return new QueryWrapper<LoanApproval>().lambda()
                .like(StringUtils.isNotEmpty(po.getLoanApprovalName()), LoanApproval::getLoanApprovalName, po.getLoanApprovalName())
                .orderByAsc(LoanApproval::getSortCode);
    }

}
