package com.example.cyjcommon.entity.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author Noice
 */
@Getter
@Setter
@TableName(TestPaper.T_TEST_PAPER)
public class TestPaper extends Model<TestPaper> {

    static final String T_TEST_PAPER = "t_test_paper";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "试卷名称不能为空")
    @TableField(value = "test_paper_name")
    private String testPaperName;

    @NotNull(message = "试卷描述不能为空")
    @TableField(value = "test_paper_description")
    private String testPaperDescription;

    @TableField(value = "test_paper_score")
    private Integer testPaperScore;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}