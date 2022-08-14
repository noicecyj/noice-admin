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
@Table(name = TestInstance.T_TEST_INSTANCE)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class TestInstance implements Serializable {

    static final String T_TEST_INSTANCE = "t_test_instance";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "test_instance_name")
    private String testInstanceName;

    @Column(name = "test_instance_participant")
    private String testInstanceParticipant;

    @Column(name = "test_instance_start_time")
    private String testInstanceStartTime;

    @Column(name = "test_instance_end_time")
    private String testInstanceEndTime;

    @Column(name = "test_instance_time")
    private String testInstanceTime;

    @Column(name = "test_instance_score")
    private String testInstanceScore;

    @JsonIgnore
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER, mappedBy = "testInstance")
    @BatchSize(size = 20)
    private Set<TestInstanceAnswer> testInstanceAnswer = new HashSet<>();

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