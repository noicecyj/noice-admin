create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    persistent_name
        varchar(255)
        not null
        comment '实体名称',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_relation
        int
        null
        comment '实体是否关联表',
    app_service_id
        varchar(36)
        null
        comment '服务id',
    sort_code
        int
        not null comment '排序值',
    status
        int
        not null comment '状态',
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
    comment '实体';
