## 2024-02-29 23:42:51 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;
create table if not exists data_user.t_persistent_form_config
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
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
        comment '更新时间',
    updated_by
        varchar(255)
        not null
        comment '更新人'
)
    comment '实体表单配置';
```

## 2024-03-05 15:44:53 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;
create table if not exists data_user.t_persistent_form_config
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
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
        comment '更新时间',
    updated_by
        varchar(255)
        not null
        comment '更新人'
)
    comment '实体表单配置';
```

## 2024-03-24 00:35:17 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;
create table if not exists data_user.t_persistent_form_config
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
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
        comment '更新时间',
    updated_by
        varchar(255)
        not null
        comment '更新人'
)
    comment '实体表单配置';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_code;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_code
            varchar(255)
            null
            comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_col_span;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_col_span
            int
            null
            comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_data_source;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_data_source
            varchar(255)
            null
            comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_default_value;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_default_value
            varchar(255)
            null
            comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_direction;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_direction
            varchar(255)
            null
            comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_edit;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_edit
            tinyint(1)
            null
            comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_mode;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_mode
            varchar(255)
            null
            comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_name;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_name
            varchar(255)
            null
            comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_required;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_required
            tinyint(1)
            null
            comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_id;
ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_id
            varchar(36)
            not null
            comment '实体表单id';

```

## 2024-03-24 00:55:50 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;
create table if not exists data_user.t_persistent_form_config
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
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
        comment '更新时间',
    updated_by
        varchar(255)
        not null
        comment '更新人'
)
    comment '实体表单配置';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_code;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_code
            varchar(255)
            null
            comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_col_span;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_col_span
            int
            null
            comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_data_source;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_data_source
            varchar(255)
            null
            comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_default_value;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_default_value
            varchar(255)
            null
            comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_direction;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_direction
            varchar(255)
            null
            comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_edit;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_edit
            tinyint(1)
            null
            comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_mode;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_mode
            varchar(255)
            null
            comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_name;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_name
            varchar(255)
            null
            comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_required;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_required
            tinyint(1)
            null
            comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_id
            varchar(36)
            not null
            comment '实体表单id';

```

## 2024-03-24 11:00:34 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;
create table if not exists data_user.t_persistent_form_config
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
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
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
        comment '更新时间',
    updated_by
        varchar(255)
        not null
        comment '更新人'
)
    comment '实体表单配置';

ALTER TABLE data_user.t_persistent_form_config
    DROP authority_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD  authority_id
            varchar(36)
            not null
            comment '权限id';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_code;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_code
            varchar(255)
            null
            comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_col_span;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_col_span
            int
            null
            comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_data_source;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_data_source
            varchar(255)
            null
            comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_default_value;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_default_value
            varchar(255)
            null
            comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_direction;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_direction
            varchar(255)
            null
            comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_edit;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_edit
            tinyint(1)
            null
            comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_mode;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_mode
            varchar(255)
            null
            comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_name;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_name
            varchar(255)
            null
            comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_required;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_required
            tinyint(1)
            null
            comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_id
            varchar(36)
            not null
            comment '实体表单id';

```

## 2024-09-26 12:26:14 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;

create table if not exists data_user.t_persistent_form_config
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
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
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
        comment '更新时间',
    updated_by
        varchar(255)
        not null
        comment '更新人'
)
    comment '实体表单配置';

ALTER TABLE data_user.t_persistent_form_config
    DROP authority_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD  authority_id
            varchar(36)
            not null
            comment '权限id';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_code;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_code
            varchar(255)
            null
            comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_col_span;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_col_span
            int
            null
            comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_data_source;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_data_source
            varchar(255)
            null
            comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_default_value;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_default_value
            varchar(255)
            null
            comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_direction;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_direction
            varchar(255)
            null
            comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_edit;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_edit
            tinyint(1)
            null
            comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_mode;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_mode
            varchar(255)
            null
            comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_name;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_name
            varchar(255)
            null
            comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_required;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_config_required
            tinyint(1)
            null
            comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD  persistent_form_id
            varchar(36)
            not null
            comment '实体表单id';

```
## 2024-10-11 18:41:35 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;

create table if not exists data_user.t_persistent_form_config
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
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
    sort_code
        int       default 1
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
    comment '实体表单配置';

ALTER TABLE data_user.t_persistent_form_config
    DROP authority_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_code;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_col_span;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_data_source;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_default_value;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_direction;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_edit;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_mode;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_name;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_required;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_id
        varchar(36)
        not null
        comment '实体表单id';

```

## 2024-11-14 17:33:20 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;

create table if not exists data_user.t_persistent_form_config
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
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
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
    comment '实体表单配置';

ALTER TABLE data_user.t_persistent_form_config
    DROP authority_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_code;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_col_span;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_data_source;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_default_value;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_direction;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_edit;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_mode;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_name;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_required;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_id
        varchar(36)
        not null
        comment '实体表单id';

```

## 2025-01-27 22:13:52 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;

create table if not exists data_user.t_persistent_form_config
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
    persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        not null
        comment '实体表单id',
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
    comment '实体表单配置';

ALTER TABLE data_user.t_persistent_form_config
    DROP authority_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_code;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_col_span;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_data_source;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_default_value;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_direction;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_edit;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_mode;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_name;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_required;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_id
        varchar(36)
        not null
        comment '实体表单id';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_id
        varchar(36)
        not null
        comment '实体表单id';

```

## 2025-01-27 22:20:26 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_form_config;

create table if not exists data_user.t_persistent_form_config
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
    persistent_form_config_code
        varchar(255)
        not null
        comment '实体表单配置组件编码',
    persistent_form_config_col_span
        int
        null
        comment '实体表单配置组件占用列数',
    persistent_form_config_data_source
        varchar(255)
        null
        comment '实体表单配置组件数据源',
    persistent_form_config_default_value
        varchar(255)
        null
        comment '实体表单配置组件默认值',
    persistent_form_config_direction
        varchar(255)
        null
        comment '实体表单配置组件方向',
    persistent_form_config_edit
        tinyint(1)
        null
        comment '实体表单配置组件是否可编辑',
    persistent_form_config_mode
        varchar(255)
        null
        comment '实体表单配置组件',
    persistent_form_config_name
        varchar(255)
        not null
        comment '实体表单配置组件名称',
    persistent_form_config_required
        tinyint(1)
        null
        comment '实体表单配置组件是否必填',
    persistent_form_id
        varchar(36)
        null
        comment '实体表单id',
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
    comment '实体表单配置';

ALTER TABLE data_user.t_persistent_form_config
    DROP authority_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_code;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_code
        varchar(255)
        null
        comment '实体表单配置组件编码';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_col_span;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_col_span
        int
        not null
        comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_col_span
        int
        not null
        comment '实体表单配置组件占用列数';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_data_source;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_data_source
        varchar(255)
        not null
        comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_data_source
        varchar(255)
        not null
        comment '实体表单配置组件数据源';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_default_value;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_default_value
        varchar(255)
        not null
        comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_default_value
        varchar(255)
        not null
        comment '实体表单配置组件默认值';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_direction;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_direction
        varchar(255)
        not null
        comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_direction
        varchar(255)
        not null
        comment '实体表单配置组件方向';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_edit;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_edit
        tinyint(1)
        not null
        comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_edit
        tinyint(1)
        not null
        comment '实体表单配置组件是否可编辑';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_mode;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_mode
        varchar(255)
        not null
        comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_mode
        varchar(255)
        not null
        comment '实体表单配置组件';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_name;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_name
        varchar(255)
        null
        comment '实体表单配置组件名称';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_config_required;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_config_required
        tinyint(1)
        not null
        comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_config_required
        tinyint(1)
        not null
        comment '实体表单配置组件是否必填';

ALTER TABLE data_user.t_persistent_form_config
    DROP persistent_form_id;

ALTER TABLE data_user.t_persistent_form_config
    ADD persistent_form_id
        varchar(36)
        not null
        comment '实体表单id';

ALTER TABLE data_user.t_persistent_form_config
    MODIFY persistent_form_id
        varchar(36)
        not null
        comment '实体表单id';

```

