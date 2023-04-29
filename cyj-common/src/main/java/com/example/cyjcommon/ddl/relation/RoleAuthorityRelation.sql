drop table if exists data_user.t_role_authority;
create table if not exists data_user.t_role_authority
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    role_id
        varchar(36)
        null
        comment '角色id',
    authority_id
        varchar(36)
        null
        comment '权限id',
    created_date
        timestamp default CURRENT_TIMESTAMP
        null comment '创建时间',
    created_by
        varchar(255)
        null comment '创建人',
    updated_date
        timestamp default CURRENT_TIMESTAMP
        null comment '更新时间',
    updated_by
        varchar(255)
        null comment '更新人'
)
    comment '角色权限';
ALTER TABLE data_user.t_role_authority DROP role_id;
ALTER TABLE data_user.t_role_authority ADD role_id varchar(36) null comment '角色id';

ALTER TABLE data_user.t_role_authority DROP authority_id;
ALTER TABLE data_user.t_role_authority ADD authority_id varchar(36) null comment '权限id';

