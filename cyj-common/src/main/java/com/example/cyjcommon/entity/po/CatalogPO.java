package com.example.cyjcommon.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 曹元杰
 * @version 1.0
 */
@Entity
@Table(name = CatalogPO.T_CATALOG)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class CatalogPO implements Serializable {

    static final String T_CATALOG = "t_catalog";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "catalog_name")
    private String catalogName;

    @Column(name = "description")
    private String description;

    @Column(name = "catalog_value")
    private String catalogValue;

    @Column(name = "status")
    private String status;

    @Column(name = "sort_code")
    private String sortCode;

}