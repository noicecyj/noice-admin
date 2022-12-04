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
@TableName(QuestionBase.T_QUESTION_BASE)
public class QuestionBase extends Model<QuestionBase> {

    static final String T_QUESTION_BASE = "t_question_base";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @NotNull(message = "题库名称不能为空")
    @TableField(value = "question_base_name")
    private String questionBaseName;

    @NotNull(message = "题库描述不能为空")
    @TableField(value = "question_base_description")
    private String questionBaseDescription;

    @TableField(value = "subject_id")
    private String subjectId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}