drop table if exists data_user.t_persistent_table_config;

create table if not exists data_user.t_persistent_table_config
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_id
        varchar(36)
        not null
        comment '权限id',
    persistent_table_config_code
        varchar(255)
        null
        comment '实体表格配置组件编码',
    persistent_table_config_display
        tinyint(1)
        null
        comment '实体表格配置是否展示',
    persistent_table_config_method
        varchar(255)
        null
        comment '实体表格配置组件方法',
    persistent_table_config_name
        varchar(255)
        null
        comment '实体表格配置组件名称',
    persistent_table_config_type
        varchar(255)
        null
        comment '实体表格配置组件类型',
    persistent_table_id
        varchar(36)
        not null
        comment '实体表格id',
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
    comment '实体表格配置';

ALTER TABLE data_user.t_persistent_table_config
    DROP authority_id;

ALTER TABLE data_user.t_persistent_table_config
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_table_config
    MODIFY authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_table_config
    DROP persistent_table_config_code;

ALTER TABLE data_user.t_persistent_table_config
    ADD persistent_table_config_code
        varchar(255)
        null
        comment '实体表格配置组件编码';

ALTER TABLE data_user.t_persistent_table_config
    MODIFY persistent_table_config_code
        varchar(255)
        null
        comment '实体表格配置组件编码';

ALTER TABLE data_user.t_persistent_table_config
    DROP persistent_table_config_display;

ALTER TABLE data_user.t_persistent_table_config
    ADD persistent_table_config_display
        tinyint(1)
        null
        comment '实体表格配置是否展示';

ALTER TABLE data_user.t_persistent_table_config
    MODIFY persistent_table_config_display
        tinyint(1)
        null
        comment '实体表格配置是否展示';

ALTER TABLE data_user.t_persistent_table_config
    DROP persistent_table_config_method;

ALTER TABLE data_user.t_persistent_table_config
    ADD persistent_table_config_method
        varchar(255)
        null
        comment '实体表格配置组件方法';

ALTER TABLE data_user.t_persistent_table_config
    MODIFY persistent_table_config_method
        varchar(255)
        null
        comment '实体表格配置组件方法';

ALTER TABLE data_user.t_persistent_table_config
    DROP persistent_table_config_name;

ALTER TABLE data_user.t_persistent_table_config
    ADD persistent_table_config_name
        varchar(255)
        null
        comment '实体表格配置组件名称';

ALTER TABLE data_user.t_persistent_table_config
    MODIFY persistent_table_config_name
        varchar(255)
        null
        comment '实体表格配置组件名称';

ALTER TABLE data_user.t_persistent_table_config
    DROP persistent_table_config_type;

ALTER TABLE data_user.t_persistent_table_config
    ADD persistent_table_config_type
        varchar(255)
        null
        comment '实体表格配置组件类型';

ALTER TABLE data_user.t_persistent_table_config
    MODIFY persistent_table_config_type
        varchar(255)
        null
        comment '实体表格配置组件类型';

ALTER TABLE data_user.t_persistent_table_config
    DROP persistent_table_id;

ALTER TABLE data_user.t_persistent_table_config
    ADD persistent_table_id
        varchar(36)
        not null
        comment '实体表格id';

ALTER TABLE data_user.t_persistent_table_config
    MODIFY persistent_table_id
        varchar(36)
        not null
        comment '实体表格id';

