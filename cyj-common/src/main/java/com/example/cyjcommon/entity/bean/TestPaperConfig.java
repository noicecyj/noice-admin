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
@TableName(TestPaperConfig.T_TEST_PAPER_CONFIG)
public class TestPaperConfig extends Model<TestPaperConfig> {

    static final String T_TEST_PAPER_CONFIG = "t_test_paper_config";

    @TableId(value = "id", type = IdType.ASSIGN_UUID)
    private String id;

    @TableField(value = "test_paper_config_type")
    private String testPaperConfigType;

    @TableField(value = "test_paper_config_number")
    private Integer testPaperConfigNumber;

    @TableField(value = "test_paper_config_score")
    private Integer testPaperConfigScore;

    @TableField(value = "test_paper_config_random")
    private String testPaperConfigRandom;

    @TableField(value = "test_paper_id")
    private String testPaperId;

    @TableField(value = "question_base_id")
    private String questionBaseId;

    @NotNull(message = "状态不能为空")
    @TableField(value = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @TableField(value = "sort_code")
    private String sortCode;

}