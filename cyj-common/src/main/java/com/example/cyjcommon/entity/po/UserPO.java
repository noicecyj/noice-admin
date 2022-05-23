package com.example.cyjcommon.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

/**
 * @author Noice
 */
@Entity
@Table(name = UserPO.T_USER)
@Getter
@Setter
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class UserPO implements Serializable {

    static final String T_USER = "t_user";

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id", length = 36)
    private String id;
    @Column(name = "password")
    private String password;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "name")
    private String name;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "phone")
    private String phone;

    @JsonIgnore
    @ManyToMany(targetEntity = RolePO.class, fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<RolePO> role;

    @JsonIgnore
    @ManyToMany(targetEntity = AuthorityPO.class, fetch = FetchType.EAGER)
    @BatchSize(size = 20)
    private Set<AuthorityPO> authority;

    @Column(name = "status")
    private String status;
    @Column(name = "sort_code")
    private String sortCode;

}