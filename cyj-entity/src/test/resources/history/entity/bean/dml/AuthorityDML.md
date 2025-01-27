## 2024-02-29 23:42:50 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;
create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_method
        varchar(255)
        null
        comment '权限请求模式',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_path
        varchar(255)
        null
        comment '权限路径',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';
```

## 2024-03-05 15:44:53 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;
create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_method
        varchar(255)
        null
        comment '权限请求模式',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_path
        varchar(255)
        null
        comment '权限路径',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';
```

## 2024-03-12 21:56:43 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;
create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_method
        varchar(255)
        null
        comment '权限请求模式',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_path
        varchar(255)
        null
        comment '权限路径',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;
ALTER TABLE data_user.t_authority
    ADD  authority_code
            varchar(255)
            null
            comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_method;
ALTER TABLE data_user.t_authority
    ADD  authority_method
            varchar(255)
            null
            comment '权限请求模式';

ALTER TABLE data_user.t_authority
    DROP authority_name;
ALTER TABLE data_user.t_authority
    ADD  authority_name
            varchar(255)
            null
            comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_path;
ALTER TABLE data_user.t_authority
    ADD  authority_path
            varchar(255)
            null
            comment '权限路径';

ALTER TABLE data_user.t_authority
    DROP authority_type;
ALTER TABLE data_user.t_authority
    ADD  authority_type
            varchar(255)
            null
            comment '权限类型';

ALTER TABLE data_user.t_authority
    DROP persistent_id;
ALTER TABLE data_user.t_authority
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

```

## 2024-03-21 10:02:48 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;
create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_method
        varchar(255)
        null
        comment '权限请求模式',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_path
        varchar(255)
        null
        comment '权限路径',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;
ALTER TABLE data_user.t_authority
    ADD  authority_code
            varchar(255)
            null
            comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_method;
ALTER TABLE data_user.t_authority
    ADD  authority_method
            varchar(255)
            null
            comment '权限请求模式';

ALTER TABLE data_user.t_authority
    DROP authority_name;
ALTER TABLE data_user.t_authority
    ADD  authority_name
            varchar(255)
            null
            comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_path;
ALTER TABLE data_user.t_authority
    ADD  authority_path
            varchar(255)
            null
            comment '权限路径';

ALTER TABLE data_user.t_authority
    DROP authority_type;
ALTER TABLE data_user.t_authority
    ADD  authority_type
            varchar(255)
            null
            comment '权限类型';

```

## 2024-03-23 10:05:15 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;
create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;
ALTER TABLE data_user.t_authority
    ADD  authority_code
            varchar(255)
            null
            comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_name;
ALTER TABLE data_user.t_authority
    ADD  authority_name
            varchar(255)
            null
            comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_type;
ALTER TABLE data_user.t_authority
    ADD  authority_type
            varchar(255)
            null
            comment '权限类型';

```

## 2024-03-24 11:00:33 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;
create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;

ALTER TABLE data_user.t_authority
    ADD  authority_code
            varchar(255)
            null
            comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_name;

ALTER TABLE data_user.t_authority
    ADD  authority_name
            varchar(255)
            null
            comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_type;

ALTER TABLE data_user.t_authority
    ADD  authority_type
            varchar(255)
            null
            comment '权限类型';

```

## 2024-09-26 12:26:11 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;

create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;

ALTER TABLE data_user.t_authority
    ADD  authority_code
            varchar(255)
            null
            comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_name;

ALTER TABLE data_user.t_authority
    ADD  authority_name
            varchar(255)
            null
            comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_type;

ALTER TABLE data_user.t_authority
    ADD  authority_type
            varchar(255)
            null
            comment '权限类型';

```
## 2024-10-11 18:41:29 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;

create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;

ALTER TABLE data_user.t_authority
    ADD authority_code
        varchar(255)
        null
        comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_name;

ALTER TABLE data_user.t_authority
    ADD authority_name
        varchar(255)
        null
        comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_type;

ALTER TABLE data_user.t_authority
    ADD authority_type
        varchar(255)
        null
        comment '权限类型';

```

## 2024-11-14 17:33:17 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;

create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;

ALTER TABLE data_user.t_authority
    ADD authority_code
        varchar(255)
        null
        comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_name;

ALTER TABLE data_user.t_authority
    ADD authority_name
        varchar(255)
        null
        comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_type;

ALTER TABLE data_user.t_authority
    ADD authority_type
        varchar(255)
        null
        comment '权限类型';

```

## 2025-01-27 22:13:49 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_authority;

create table if not exists data_user.t_authority
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_code
        varchar(255)
        null
        comment '权限编码',
    authority_name
        varchar(255)
        null
        comment '权限名称',
    authority_type
        varchar(255)
        null
        comment '权限类型',
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
    comment '权限';

ALTER TABLE data_user.t_authority
    DROP authority_code;

ALTER TABLE data_user.t_authority
    ADD authority_code
        varchar(255)
        null
        comment '权限编码';

ALTER TABLE data_user.t_authority
    MODIFY authority_code
        varchar(255)
        null
        comment '权限编码';

ALTER TABLE data_user.t_authority
    DROP authority_name;

ALTER TABLE data_user.t_authority
    ADD authority_name
        varchar(255)
        null
        comment '权限名称';

ALTER TABLE data_user.t_authority
    MODIFY authority_name
        varchar(255)
        null
        comment '权限名称';

ALTER TABLE data_user.t_authority
    DROP authority_type;

ALTER TABLE data_user.t_authority
    ADD authority_type
        varchar(255)
        null
        comment '权限类型';

ALTER TABLE data_user.t_authority
    MODIFY authority_type
        varchar(255)
        null
        comment '权限类型';

```

