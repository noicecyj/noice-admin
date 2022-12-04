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
@TableName(QuestionInstanceAnswer.T_QUESTION_INSTANCE_ANSWER)
public class QuestionInstanceAnswer extends Model<QuestionInstanceAnswer> {

    static final String T_QUESTION_INSTANCE_ANSWER = "t_question_instance_answer";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "test_instance_answer_context")
    private String testInstanceAnswerContext;

    @TableField(value = "test_instance_answer_result")
    private String testInstanceAnswerResult;

    @TableField(value = "question_instance_id")
    private String questionInstanceId;

    @TableField(value = "test_instance_id")
    private String testInstanceId;

    @TableField(value = "test_paper_instance_id")
    private String testPaperInstanceId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}