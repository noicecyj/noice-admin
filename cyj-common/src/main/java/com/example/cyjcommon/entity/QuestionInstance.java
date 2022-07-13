package com.example.cyjcommon.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Noice
 */
@Entity
@Table(name = QuestionInstance.T_QUESTION_INSTANCE)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class QuestionInstance implements Serializable {

    static final String T_QUESTION_INSTANCE = "t_question_instance";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "question_instance_index")
    private String questionInstanceIndex;

    @Column(name = "question_instance_content")
    private String questionInstanceContent;

    @Column(name = "question_instance_option_A")
    private String questionInstanceOptionA;

    @Column(name = "question_instance_option_B")
    private String questionInstanceOptionB;

    @Column(name = "question_instance_option_C")
    private String questionInstanceOptionC;

    @Column(name = "question_instance_option_D")
    private String questionInstanceOptionD;

    @Column(name = "question_instance_option_E")
    private String questionInstanceOptionE;

    @Column(name = "question_instance_option_F")
    private String questionInstanceOptionF;

    @Column(name = "question_instance_answer")
    private String questionInstanceAnswer;

    @Column(name = "test_paper_instance_id", insertable = false, updatable = false)
    private String testPaperInstanceId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "test_paper_instance_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private TestPaperInstance testPaperInstance;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}