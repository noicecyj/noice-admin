package com.example.cyjentitycreater.entity.dto;

import com.example.cyjcommon.entity.QuestionInstance;
import com.example.cyjcommon.entity.QuestionInstanceAnswer;
import com.example.cyjcommon.entity.TestInstance;
import com.example.cyjcommon.entity.TestPaperInstance;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Noice
 * @version 1.0
 * @date 2021-10-16
 */
@Data
public class TestCustomDTO implements Serializable {

    private TestInstance testInstance;
    private TestPaperInstance testPaperInstance;
    private List<QuestionInstance> questionInstanceList;
    private List<QuestionInstanceAnswer> questionInstanceAnswerList;

}