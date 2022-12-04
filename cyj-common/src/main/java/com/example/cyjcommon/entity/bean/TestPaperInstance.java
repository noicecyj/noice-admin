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
@TableName(TestPaperInstance.T_TEST_PAPER_INSTANCE)
public class TestPaperInstance extends Model<TestPaperInstance> {

    static final String T_TEST_PAPER_INSTANCE = "t_test_paper_instance";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "test_paper_instance_name")
    private String testPaperInstanceName;

    @TableField(value = "test_paper_instance_description")
    private String testPaperInstanceDescription;

    @TableField(value = "test_paper_instance_score")
    private Integer testPaperInstanceScore;

    @TableField(value = "test_paper_instance_created_by")
    private String testPaperInstanceCreatedBy;

    @TableField(value = "test_paper_instance_created_date")
    private String testPaperInstanceCreatedDate;

    @TableField(value = "test_paper_id")
    private String testPaperId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}