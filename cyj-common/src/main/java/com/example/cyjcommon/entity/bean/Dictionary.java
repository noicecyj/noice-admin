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
@TableName(Dictionary.T_DICTIONARY)
public class Dictionary extends Model<Dictionary> {

    static final String T_DICTIONARY = "t_dictionary";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "dictionary_name")
    private String dictionaryName;

    @TableField(value = "dictionary_value")
    private String dictionaryValue;

    @TableField(value = "catalog_id")
    private String catalogId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}