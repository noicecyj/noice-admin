create table if not exists data_user.t_persistent_table_search_config
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    persistent_table_search_config_name
        varchar(255)
        null
        comment '实体表格搜索配置名称',
    persistent_table_search_config_code
        varchar(255)
        null
        comment '实体表格搜索配置编码',
    persistent_table_search_config_display
        int
        null
        comment '实体表格搜索配置是否展示',
    persistent_table_search_config_mode
        varchar(255)
        null
        comment '实体表格搜索配置类型',
    persistent_table_search_config_data_source
        varchar(255)
        null
        comment '实体表格搜索配置数据源',
    persistent_table_search_config_default_value
        varchar(255)
        null
        comment '实体表格搜索配置默认值',
    persistent_table_id
        varchar(36)
        null
        comment '实体表格id',
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
    comment '实体表格搜索配置';
