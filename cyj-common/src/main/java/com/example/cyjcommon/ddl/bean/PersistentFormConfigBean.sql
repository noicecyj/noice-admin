drop table if exists data_user.t_persistent_form_config;
create table if not exists data_user.t_persistent_form_config
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_required
        int
        null
        comment '实体表单配置组件是否必填',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        int
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_id
        varchar(36)
        null
        comment '实体表单id',
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
    comment '实体表单配置';
ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_name;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_name varchar(255) null comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_code;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_code varchar(255) null comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_mode;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_mode varchar(255) null comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_required;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_required int null comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_default_value;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_default_value varchar(255) null comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_data_source;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_data_source varchar(255) null comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_direction;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_direction varchar(255) null comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_edit;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_edit int null comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_config_col_span;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_config_col_span int null comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config DROP persistent_form_id;
ALTER TABLE data_user.t_persistent_form_config ADD persistent_form_id varchar(36) null comment '实体表单id';

