drop table if exists data_user.t_authority;

create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;

ALTER TABLE data_user.t_authority
    ADD authority_code
        varchar(255)
        null
        comment '权限编码';

ALTER TABLE data_user.t_authority
    MODIFY authority_code
        varchar(255)
        null
        comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_name;

ALTER TABLE data_user.t_authority
    ADD authority_name
        varchar(255)
        null
        comment '权限名称';

ALTER TABLE data_user.t_authority
    MODIFY authority_name
        varchar(255)
        null
        comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_type;

ALTER TABLE data_user.t_authority
    ADD authority_type
        varchar(255)
        null
        comment '权限类型';

ALTER TABLE data_user.t_authority
    MODIFY authority_type
        varchar(255)
        null
        comment '权限类型';

