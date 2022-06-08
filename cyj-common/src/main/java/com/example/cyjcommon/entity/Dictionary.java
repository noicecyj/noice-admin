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
@Table(name = Dictionary.T_DICTIONARY)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Dictionary implements Serializable {

    static final String T_DICTIONARY = "t_dictionary";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "dictionary_name")
    private String dictionaryName;

    @Column(name = "dictionary_value")
    private String dictionaryValue;

    @Column(name = "catalog_id", insertable = false, updatable = false)
    private String catalogId;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.REMOVE})
    @JoinColumn(name = "catalog_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private Catalog catalog;

    @NotNull(message = "状态不能为空")
    @Column(name = "status")
    private String status;

    @NotNull(message = "排序不能为空")
    @Column(name = "sort_code")
    private String sortCode;

}