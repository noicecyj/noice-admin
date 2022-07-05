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
@Table(name = Question.T_QUESTION)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Question implements Serializable {

    static final String T_QUESTION = "t_question";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @NotNull(message = "题干不能为空")
    @Column(name = "question_name", length = 1000)
    private String questionName;

    @NotNull(message = "题型不能为空")
    @Column(name = "question_type")
    private String questionType;

    @Column(name = "question_option_A", length = 1000)
    private String questionOptionA;

    @Column(name = "question_option_A_key")
    private String questionOptionAKey;

    @Column(name = "question_option_B", length = 1000)
    private String questionOptionB;

    @Column(name = "question_option_B_key")
    private String questionOptionBKey;

    @Column(name = "question_option_C", length = 1000)
    private String questionOptionC;

    @Column(name = "question_option_C_key")
    private String questionOptionCKey;

    @Column(name = "question_option_D", length = 1000)
    private String questionOptionD;

    @Column(name = "question_option_D_key")
    private String questionOptionDKey;

    @Column(name = "question_option_E", length = 1000)
    private String questionOptionE;

    @Column(name = "question_option_E_key")
    private String questionOptionEKey;

    @Column(name = "question_option_F", length = 1000)
    private String questionOptionF;

    @Column(name = "question_option_F_key")
    private String questionOptionFKey;

    @Column(name = "question_base_id", insertable = false, updatable = false)
    private String questionBaseId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "question_base_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private QuestionBase questionBase;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}