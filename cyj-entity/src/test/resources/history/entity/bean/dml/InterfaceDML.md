## 2024-03-21 22:25:10 noice 作者大大 曹元杰 天才 笔记本

```sql
```

## 2024-03-23 10:05:15 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;
create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        null
        comment '接口编码',
    interface_name
        varchar(255)
        null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;
ALTER TABLE data_user.t_interface
    ADD  authority_id
            varchar(36)
            not null
            comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;
ALTER TABLE data_user.t_interface
    ADD  interface_code
            varchar(255)
            null
            comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;
ALTER TABLE data_user.t_interface
    ADD  interface_name
            varchar(255)
            null
            comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;
ALTER TABLE data_user.t_interface
    ADD  interface_path
            varchar(255)
            null
            comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;
ALTER TABLE data_user.t_interface
    ADD  interface_type
            varchar(255)
            null
            comment '接口类型';

ALTER TABLE data_user.t_interface
    DROP persistent_id;
ALTER TABLE data_user.t_interface
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

```

## 2024-03-24 11:00:33 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;
create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        null
        comment '接口编码',
    interface_name
        varchar(255)
        null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;

ALTER TABLE data_user.t_interface
    ADD  authority_id
            varchar(36)
            not null
            comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;

ALTER TABLE data_user.t_interface
    ADD  interface_code
            varchar(255)
            null
            comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;

ALTER TABLE data_user.t_interface
    ADD  interface_name
            varchar(255)
            null
            comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;

ALTER TABLE data_user.t_interface
    ADD  interface_path
            varchar(255)
            null
            comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;

ALTER TABLE data_user.t_interface
    ADD  interface_type
            varchar(255)
            null
            comment '接口类型';

ALTER TABLE data_user.t_interface
    DROP persistent_id;

ALTER TABLE data_user.t_interface
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

```

## 2024-09-26 12:26:12 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;

create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        null
        comment '接口编码',
    interface_name
        varchar(255)
        null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;

ALTER TABLE data_user.t_interface
    ADD  authority_id
            varchar(36)
            not null
            comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;

ALTER TABLE data_user.t_interface
    ADD  interface_code
            varchar(255)
            null
            comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;

ALTER TABLE data_user.t_interface
    ADD  interface_name
            varchar(255)
            null
            comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;

ALTER TABLE data_user.t_interface
    ADD  interface_path
            varchar(255)
            null
            comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;

ALTER TABLE data_user.t_interface
    ADD  interface_type
            varchar(255)
            null
            comment '接口类型';

ALTER TABLE data_user.t_interface
    DROP persistent_id;

ALTER TABLE data_user.t_interface
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

```
## 2024-10-11 18:41:31 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;

create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        null
        comment '接口编码',
    interface_name
        varchar(255)
        null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;

ALTER TABLE data_user.t_interface
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;

ALTER TABLE data_user.t_interface
    ADD interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;

ALTER TABLE data_user.t_interface
    ADD interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;

ALTER TABLE data_user.t_interface
    ADD interface_path
        varchar(255)
        null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;

ALTER TABLE data_user.t_interface
    ADD interface_type
        varchar(255)
        null
        comment '接口类型';

ALTER TABLE data_user.t_interface
    DROP persistent_id;

ALTER TABLE data_user.t_interface
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

```

## 2024-10-18 22:36:11 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;

create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        null
        comment '接口编码',
    interface_name
        varchar(255)
        null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;

ALTER TABLE data_user.t_interface
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;

ALTER TABLE data_user.t_interface
    ADD interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;

ALTER TABLE data_user.t_interface
    ADD interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;

ALTER TABLE data_user.t_interface
    ADD interface_path
        varchar(255)
        null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;

ALTER TABLE data_user.t_interface
    ADD interface_type
        varchar(255)
        null
        comment '接口类型';

ALTER TABLE data_user.t_interface
    DROP persistent_id;

ALTER TABLE data_user.t_interface
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

```

## 2024-11-14 17:33:18 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;

create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        null
        comment '接口编码',
    interface_name
        varchar(255)
        null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;

ALTER TABLE data_user.t_interface
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;

ALTER TABLE data_user.t_interface
    ADD interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;

ALTER TABLE data_user.t_interface
    ADD interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;

ALTER TABLE data_user.t_interface
    ADD interface_path
        varchar(255)
        null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;

ALTER TABLE data_user.t_interface
    ADD interface_type
        varchar(255)
        null
        comment '接口类型';

```

## 2024-12-09 17:52:40 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;

create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        null
        comment '接口编码',
    interface_name
        varchar(255)
        null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;

ALTER TABLE data_user.t_interface
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    MODIFY authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;

ALTER TABLE data_user.t_interface
    ADD interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    MODIFY interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;

ALTER TABLE data_user.t_interface
    ADD interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    MODIFY interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;

ALTER TABLE data_user.t_interface
    ADD interface_path
        varchar(255)
        null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    MODIFY interface_path
        varchar(255)
        null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;

ALTER TABLE data_user.t_interface
    ADD interface_type
        varchar(255)
        null
        comment '接口类型';

ALTER TABLE data_user.t_interface
    MODIFY interface_type
        varchar(255)
        null
        comment '接口类型';

```

## 2025-01-27 22:13:50 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;

create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        null
        comment '接口编码',
    interface_name
        varchar(255)
        null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;

ALTER TABLE data_user.t_interface
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    MODIFY authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;

ALTER TABLE data_user.t_interface
    ADD interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    MODIFY interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;

ALTER TABLE data_user.t_interface
    ADD interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    MODIFY interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;

ALTER TABLE data_user.t_interface
    ADD interface_path
        varchar(255)
        null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    MODIFY interface_path
        varchar(255)
        null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;

ALTER TABLE data_user.t_interface
    ADD interface_type
        varchar(255)
        null
        comment '接口类型';

ALTER TABLE data_user.t_interface
    MODIFY interface_type
        varchar(255)
        null
        comment '接口类型';

ALTER TABLE data_user.t_interface
    DROP persistent_id;

ALTER TABLE data_user.t_interface
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_interface
    MODIFY persistent_id
        varchar(36)
        not null
        comment '实体id';

```

## 2025-01-27 22:20:25 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_interface;

create table if not exists data_user.t_interface
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
    interface_code
        varchar(255)
        not null
        comment '接口编码',
    interface_name
        varchar(255)
        not null
        comment '接口名称',
    interface_path
        varchar(255)
        null
        comment '接口路径',
    interface_type
        varchar(255)
        null
        comment '接口类型',
    persistent_id
        varchar(36)
        null
        comment '实体id',
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
    comment '接口';

ALTER TABLE data_user.t_interface
    DROP authority_id;

ALTER TABLE data_user.t_interface
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    MODIFY authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_interface
    DROP interface_code;

ALTER TABLE data_user.t_interface
    ADD interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    MODIFY interface_code
        varchar(255)
        null
        comment '接口编码';

ALTER TABLE data_user.t_interface
    DROP interface_name;

ALTER TABLE data_user.t_interface
    ADD interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    MODIFY interface_name
        varchar(255)
        null
        comment '接口名称';

ALTER TABLE data_user.t_interface
    DROP interface_path;

ALTER TABLE data_user.t_interface
    ADD interface_path
        varchar(255)
        not null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    MODIFY interface_path
        varchar(255)
        not null
        comment '接口路径';

ALTER TABLE data_user.t_interface
    DROP interface_type;

ALTER TABLE data_user.t_interface
    ADD interface_type
        varchar(255)
        not null
        comment '接口类型';

ALTER TABLE data_user.t_interface
    MODIFY interface_type
        varchar(255)
        not null
        comment '接口类型';

ALTER TABLE data_user.t_interface
    DROP persistent_id;

ALTER TABLE data_user.t_interface
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_interface
    MODIFY persistent_id
        varchar(36)
        not null
        comment '实体id';

```

