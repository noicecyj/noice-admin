package com.example.cyjlog.entity.po;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * @author 曹元杰
 * @version 1.0
 * @date 2020/1/21 14:46
 */
@Entity
@Table(name = LogPO.T_LOG)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class LogPO {

    static final String T_LOG = "t_server_log";

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "app_port")
    private String appPort;
    @Column(name = "class")
    private String className;
    @Column(name = "classpath")
    private String classpath;
    @Column(name = "method")
    private String method;
    @Column(name = "thread_name")
    private String threadName;
    @Column(name = "msg_level")
    private String msgLevel;
    @Column(name = "msg")
    private String msg;
    @Column(name = "create_date")
    private String createDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LogPO logPO = (LogPO) o;
        return Objects.equals(id, logPO.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
