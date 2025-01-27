drop table if exists data_user.t_role;

create table if not exists data_user.t_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_code
        varchar(255)
        not null
        comment '角色编码',
    role_name
        varchar(255)
        not null
        comment '角色名称',
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
    comment '角色';

ALTER TABLE data_user.t_role
    DROP role_code;

ALTER TABLE data_user.t_role
    ADD role_code
        varchar(255)
        null
        comment '角色编码';

ALTER TABLE data_user.t_role
    MODIFY role_code
        varchar(255)
        null
        comment '角色编码';

ALTER TABLE data_user.t_role
    DROP role_name;

ALTER TABLE data_user.t_role
    ADD role_name
        varchar(255)
        null
        comment '角色名称';

ALTER TABLE data_user.t_role
    MODIFY role_name
        varchar(255)
        null
        comment '角色名称';

