package com.example.cyjcommon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Noice
 */
@Entity
@Table(name = TestPaperInstance.T_TEST_PAPER_INSTANCE)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class TestPaperInstance implements Serializable {

    static final String T_TEST_PAPER_INSTANCE = "t_test_paper_instance";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "test_paper_instance_name")
    private String testPaperInstanceName;

    @Column(name = "test_paper_instance_description")
    private String testPaperInstanceDescription;

    @Column(name = "test_paper_instance_score")
    private Integer testPaperInstanceScore;

    @Column(name = "test_paper_instance_created_by")
    private String testPaperInstanceCreatedBy;

    @Column(name = "test_paper_instance_created_date")
    private String testPaperInstanceCreatedDate;

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "testPaperInstance")
    @BatchSize(size = 20)
    private Set<QuestionInstance> questionInstance = new HashSet<>();

    @Column(name = "test_paper_id", insertable = false, updatable = false)
    private String testPaperId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "test_paper_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private TestPaper testPaper;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}