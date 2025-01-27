drop table if exists data_user.t_persistent_table_search_config;

create table if not exists data_user.t_persistent_table_search_config
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_id
        varchar(36)
        null
        comment '权限id',
    persistent_table_id
        varchar(36)
        null
        comment '实体表格id',
    persistent_table_search_config_code
        varchar(255)
        not null
        comment '实体表格搜索配置编码',
    persistent_table_search_config_data_source
        varchar(255)
        null
        comment '实体表格搜索配置数据源',
    persistent_table_search_config_default_value
        varchar(255)
        null
        comment '实体表格搜索配置默认值',
    persistent_table_search_config_display
        tinyint(1)
        null
        comment '实体表格搜索配置是否展示',
    persistent_table_search_config_mode
        varchar(255)
        null
        comment '实体表格搜索配置类型',
    persistent_table_search_config_name
        varchar(255)
        not null
        comment '实体表格搜索配置名称',
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
    comment '实体表格搜索配置';

ALTER TABLE data_user.t_persistent_table_search_config
    DROP authority_id;

ALTER TABLE data_user.t_persistent_table_search_config
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_table_search_config
    MODIFY authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_table_search_config
    DROP persistent_table_id;

ALTER TABLE data_user.t_persistent_table_search_config
    ADD persistent_table_id
        varchar(36)
        not null
        comment '实体表格id';

ALTER TABLE data_user.t_persistent_table_search_config
    MODIFY persistent_table_id
        varchar(36)
        not null
        comment '实体表格id';

ALTER TABLE data_user.t_persistent_table_search_config
    DROP persistent_table_search_config_code;

ALTER TABLE data_user.t_persistent_table_search_config
    ADD persistent_table_search_config_code
        varchar(255)
        null
        comment '实体表格搜索配置编码';

ALTER TABLE data_user.t_persistent_table_search_config
    MODIFY persistent_table_search_config_code
        varchar(255)
        null
        comment '实体表格搜索配置编码';

ALTER TABLE data_user.t_persistent_table_search_config
    DROP persistent_table_search_config_data_source;

ALTER TABLE data_user.t_persistent_table_search_config
    ADD persistent_table_search_config_data_source
        varchar(255)
        not null
        comment '实体表格搜索配置数据源';

ALTER TABLE data_user.t_persistent_table_search_config
    MODIFY persistent_table_search_config_data_source
        varchar(255)
        not null
        comment '实体表格搜索配置数据源';

ALTER TABLE data_user.t_persistent_table_search_config
    DROP persistent_table_search_config_default_value;

ALTER TABLE data_user.t_persistent_table_search_config
    ADD persistent_table_search_config_default_value
        varchar(255)
        not null
        comment '实体表格搜索配置默认值';

ALTER TABLE data_user.t_persistent_table_search_config
    MODIFY persistent_table_search_config_default_value
        varchar(255)
        not null
        comment '实体表格搜索配置默认值';

ALTER TABLE data_user.t_persistent_table_search_config
    DROP persistent_table_search_config_display;

ALTER TABLE data_user.t_persistent_table_search_config
    ADD persistent_table_search_config_display
        tinyint(1)
        not null
        comment '实体表格搜索配置是否展示';

ALTER TABLE data_user.t_persistent_table_search_config
    MODIFY persistent_table_search_config_display
        tinyint(1)
        not null
        comment '实体表格搜索配置是否展示';

ALTER TABLE data_user.t_persistent_table_search_config
    DROP persistent_table_search_config_mode;

ALTER TABLE data_user.t_persistent_table_search_config
    ADD persistent_table_search_config_mode
        varchar(255)
        not null
        comment '实体表格搜索配置类型';

ALTER TABLE data_user.t_persistent_table_search_config
    MODIFY persistent_table_search_config_mode
        varchar(255)
        not null
        comment '实体表格搜索配置类型';

ALTER TABLE data_user.t_persistent_table_search_config
    DROP persistent_table_search_config_name;

ALTER TABLE data_user.t_persistent_table_search_config
    ADD persistent_table_search_config_name
        varchar(255)
        null
        comment '实体表格搜索配置名称';

ALTER TABLE data_user.t_persistent_table_search_config
    MODIFY persistent_table_search_config_name
        varchar(255)
        null
        comment '实体表格搜索配置名称';

