drop table if exists data_user.t_user_role;
create table if not exists data_user.t_user_role
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    user_id
        varchar(36)
        null
        comment '用户id',
    role_id
        varchar(36)
        null
        comment '角色id',
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
    comment '用户角色';
ALTER TABLE data_user.t_user_role DROP user_id;
ALTER TABLE data_user.t_user_role ADD user_id varchar(36) null comment '用户id';

ALTER TABLE data_user.t_user_role DROP role_id;
ALTER TABLE data_user.t_user_role ADD role_id varchar(36) null comment '角色id';

