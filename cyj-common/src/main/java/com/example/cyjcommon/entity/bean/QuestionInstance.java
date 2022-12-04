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
@TableName(QuestionInstance.T_QUESTION_INSTANCE)
public class QuestionInstance extends Model<QuestionInstance> {

    static final String T_QUESTION_INSTANCE = "t_question_instance";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "question_instance_index")
    private String questionInstanceIndex;

    @TableField(value = "question_instance_type")
    private String questionInstanceType;

    @TableField(value = "question_instance_content")
    private String questionInstanceContent;

    @TableField(value = "question_instance_option_A")
    private String questionInstanceOptionA;

    @TableField(value = "question_instance_option_B")
    private String questionInstanceOptionB;

    @TableField(value = "question_instance_option_C")
    private String questionInstanceOptionC;

    @TableField(value = "question_instance_option_D")
    private String questionInstanceOptionD;

    @TableField(value = "question_instance_option_E")
    private String questionInstanceOptionE;

    @TableField(value = "question_instance_option_F")
    private String questionInstanceOptionF;

    @TableField(value = "question_instance_answer")
    private String questionInstanceAnswer;

    @TableField(value = "test_paper_instance_id")
    private String testPaperInstanceId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}