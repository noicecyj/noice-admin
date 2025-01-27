drop table if exists data_user.t_user;

create table if not exists data_user.t_user
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    enterprise_id
        varchar(36)
        null
        comment '企业id',
    user_code
        varchar(255)
        not null
        comment '用户编码',
    user_name
        varchar(255)
        not null
        comment '用户名称',
    user_password
        varchar(255)
        null
        comment '用户密码',
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
        not null
        comment '创建时间',
    created_by
        varchar(255)
        not null
        comment '创建人',
    updated_date
        timestamp default CURRENT_TIMESTAMP
        not null
        on update CURRENT_TIMESTAMP
        comment '更新时间',
    updated_by
        varchar(255)
        not null
        comment '更新人'
)
    comment '用户';

ALTER TABLE data_user.t_user
    DROP enterprise_id;

ALTER TABLE data_user.t_user
    ADD enterprise_id
        varchar(36)
        not null
        comment '企业id';

ALTER TABLE data_user.t_user
    MODIFY enterprise_id
        varchar(36)
        not null
        comment '企业id';

ALTER TABLE data_user.t_user
    DROP user_code;

ALTER TABLE data_user.t_user
    ADD user_code
        varchar(255)
        null
        comment '用户编码';

ALTER TABLE data_user.t_user
    MODIFY user_code
        varchar(255)
        null
        comment '用户编码';

ALTER TABLE data_user.t_user
    DROP user_name;

ALTER TABLE data_user.t_user
    ADD user_name
        varchar(255)
        null
        comment '用户名称';

ALTER TABLE data_user.t_user
    MODIFY user_name
        varchar(255)
        null
        comment '用户名称';

ALTER TABLE data_user.t_user
    DROP user_password;

ALTER TABLE data_user.t_user
    ADD user_password
        varchar(255)
        not null
        comment '用户密码';

ALTER TABLE data_user.t_user
    MODIFY user_password
        varchar(255)
        not null
        comment '用户密码';

