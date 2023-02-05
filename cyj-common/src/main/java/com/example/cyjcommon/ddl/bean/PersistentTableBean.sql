create table if not exists data_user.t_persistent_table
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    persistent_table_name
        varchar(255)
        null
        comment '实体表格名称',
    persistent_table_code
        varchar(255)
        null
        comment '实体表格编码',
    persistent_id
        varchar(36)
        null
        comment '实体id',
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
    comment '实体表格';
