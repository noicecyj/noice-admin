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
@TableName(Question.T_QUESTION)
public class Question extends Model<Question> {

    static final String T_QUESTION = "t_question";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "题干不能为空")
    @TableField(value = "question_name")
    private String questionName;

    @NotNull(message = "题型不能为空")
    @TableField(value = "question_type")
    private String questionType;

    @TableField(value = "question_option_A")
    private String questionOptionA;

    @TableField(value = "question_option_A_key")
    private String questionOptionAKey;

    @TableField(value = "question_option_B")
    private String questionOptionB;

    @TableField(value = "question_option_B_key")
    private String questionOptionBKey;

    @TableField(value = "question_option_C")
    private String questionOptionC;

    @TableField(value = "question_option_C_key")
    private String questionOptionCKey;

    @TableField(value = "question_option_D")
    private String questionOptionD;

    @TableField(value = "question_option_D_key")
    private String questionOptionDKey;

    @TableField(value = "question_option_E")
    private String questionOptionE;

    @TableField(value = "question_option_E_key")
    private String questionOptionEKey;

    @TableField(value = "question_option_F")
    private String questionOptionF;

    @TableField(value = "question_option_F_key")
    private String questionOptionFKey;

    @TableField(value = "question_base_id")
    private String questionBaseId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}