drop table if exists data_user.t_sql;

create table if not exists data_user.t_sql
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    sql_code
        varchar(255)
        not null
        comment '查询编码',
    sql_name
        varchar(255)
        not null
        comment '查询名称',
    sql_str
        varchar(255)
        null
        comment '查询语句',
    sql_type
        varchar(255)
        null
        comment '查询类型',
    sort_code
        int default 1
        not null
        comment '排序值',
    status
        tinyint(1)
        not null
        comment '状态',
    created_date
        timestamp default CURRENT_TIMESTAMP
        null
        comment '创建时间',
    created_by
        varchar(255)
        null
        comment '创建人',
    updated_date
        timestamp default CURRENT_TIMESTAMP
        null
        on update CURRENT_TIMESTAMP
        comment '更新时间',
    updated_by
        varchar(255)
        null
        comment '更新人'
)
    comment '查询';

ALTER TABLE data_user.t_sql
    DROP sql_code;

ALTER TABLE data_user.t_sql
    ADD sql_code
        varchar(255)
        null
        comment '查询编码';

ALTER TABLE data_user.t_sql
    MODIFY sql_code
        varchar(255)
        null
        comment '查询编码';

ALTER TABLE data_user.t_sql
    DROP sql_name;

ALTER TABLE data_user.t_sql
    ADD sql_name
        varchar(255)
        null
        comment '查询名称';

ALTER TABLE data_user.t_sql
    MODIFY sql_name
        varchar(255)
        null
        comment '查询名称';

ALTER TABLE data_user.t_sql
    DROP sql_str;

ALTER TABLE data_user.t_sql
    ADD sql_str
        varchar(255)
        not null
        comment '查询语句';

ALTER TABLE data_user.t_sql
    MODIFY sql_str
        varchar(255)
        not null
        comment '查询语句';

ALTER TABLE data_user.t_sql
    DROP sql_type;

ALTER TABLE data_user.t_sql
    ADD sql_type
        varchar(255)
        not null
        comment '查询类型';

ALTER TABLE data_user.t_sql
    MODIFY sql_type
        varchar(255)
        not null
        comment '查询类型';

