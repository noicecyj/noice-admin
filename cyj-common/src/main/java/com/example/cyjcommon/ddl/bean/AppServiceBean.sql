create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';
