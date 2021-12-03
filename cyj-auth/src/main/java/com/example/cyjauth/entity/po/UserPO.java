package com.example.cyjauth.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
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
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2021-03-07
 */
@Entity
@Table(name = UserPO.T_USER)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
public class UserPO implements Serializable {

        static final String T_USER = "t_user";

        @Id
        @GeneratedValue(generator = "uuid2")
        @Column(name = "id", length = 36)
        private String id;
        @Column(name = "user_name")
        private String userName;
        @Column(name = "password")
        private String password;
        @Column(name = "name")
        private String name;
        @Column(name = "phone")
        private String phone;
        @Column(name = "status")
        private Integer status;
        @Column(name = "sort_code")
        private String sortCode;
        @JsonIgnore
        @ManyToMany(targetEntity = RolePO.class, fetch = FetchType.EAGER)
        @BatchSize(size = 20)
        private Set<RolePO> role = new HashSet<>();
        @JsonIgnore
        @ManyToMany(targetEntity = AuthorityPO.class, fetch = FetchType.EAGER)
        @BatchSize(size = 20)
        private Set<AuthorityPO> authority = new HashSet<>();

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
                UserPO userPO = (UserPO) o;
                return Objects.equals(id, userPO.id);
        }

        @Override
        public int hashCode() {
                return 0;
        }
}