package com.example.cyjentitycreater.entity.dto;

import com.example.cyjcommon.entity.bean.QuestionInstance;
import com.example.cyjcommon.entity.bean.QuestionInstanceAnswer;
import com.example.cyjcommon.entity.bean.TestInstance;
import com.example.cyjcommon.entity.bean.TestPaperInstance;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Noice
 */
@Data
public class TestCustomDTO implements Serializable {

    private TestInstance testInstance;
    private TestPaperInstance testPaperInstance;
    private List<QuestionInstance> questionInstanceList;
    private List<QuestionInstanceAnswer> questionInstanceAnswerList;

}