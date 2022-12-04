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
@TableName(TestInstance.T_TEST_INSTANCE)
public class TestInstance extends Model<TestInstance> {

    static final String T_TEST_INSTANCE = "t_test_instance";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "test_instance_name")
    private String testInstanceName;

    @TableField(value = "test_instance_participant")
    private String testInstanceParticipant;

    @TableField(value = "test_instance_start_time")
    private String testInstanceStartTime;

    @TableField(value = "test_instance_end_time")
    private String testInstanceEndTime;

    @TableField(value = "test_instance_time")
    private String testInstanceTime;

    @TableField(value = "test_instance_score")
    private String testInstanceScore;

    @TableField(value = "test_id")
    private String testId;

    @TableField(value = "test_paper_instance_id")
    private String testPaperInstanceId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}