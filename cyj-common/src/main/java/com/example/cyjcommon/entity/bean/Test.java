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
@TableName(Test.T_TEST)
public class Test extends Model<Test> {

    static final String T_TEST = "t_test";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "test_name")
    private String testName;

    @TableField(value = "test_description")
    private String testDescription;

    @TableField(value = "test_time")
    private String testTime;

    @TableField(value = "test_created_by")
    private String testCreatedBy;

    @TableField(value = "test_created_date")
    private String testCreatedDate;

    @TableField(value = "test_paper_instance_id")
    private String testPaperInstanceId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}