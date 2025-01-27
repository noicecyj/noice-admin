## 2024-02-29 23:42:50 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;
create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        null
        comment '目录编码',
    catalog_name
        varchar(255)
        null
        comment '目录名称',
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
    comment '目录';
```

## 2024-03-05 15:44:53 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;
create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        null
        comment '目录编码',
    catalog_name
        varchar(255)
        null
        comment '目录名称',
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
    comment '目录';
```

## 2024-03-23 10:05:15 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;
create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        null
        comment '目录编码',
    catalog_name
        varchar(255)
        null
        comment '目录名称',
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
    comment '目录';

ALTER TABLE data_user.t_catalog
    DROP catalog_code;
ALTER TABLE data_user.t_catalog
    ADD  catalog_code
            varchar(255)
            null
            comment '目录编码';

ALTER TABLE data_user.t_catalog
    DROP catalog_name;
ALTER TABLE data_user.t_catalog
    ADD  catalog_name
            varchar(255)
            null
            comment '目录名称';

```

## 2024-03-24 11:00:33 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;
create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        null
        comment '目录编码',
    catalog_name
        varchar(255)
        null
        comment '目录名称',
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
    comment '目录';

ALTER TABLE data_user.t_catalog
    DROP catalog_code;

ALTER TABLE data_user.t_catalog
    ADD  catalog_code
            varchar(255)
            null
            comment '目录编码';

ALTER TABLE data_user.t_catalog
    DROP catalog_name;

ALTER TABLE data_user.t_catalog
    ADD  catalog_name
            varchar(255)
            null
            comment '目录名称';

```

## 2024-09-26 12:26:11 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;

create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        null
        comment '目录编码',
    catalog_name
        varchar(255)
        null
        comment '目录名称',
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
    comment '目录';

ALTER TABLE data_user.t_catalog
    DROP catalog_code;

ALTER TABLE data_user.t_catalog
    ADD  catalog_code
            varchar(255)
            null
            comment '目录编码';

ALTER TABLE data_user.t_catalog
    DROP catalog_name;

ALTER TABLE data_user.t_catalog
    ADD  catalog_name
            varchar(255)
            null
            comment '目录名称';

```
## 2024-10-11 18:41:30 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;

create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        null
        comment '目录编码',
    catalog_name
        varchar(255)
        null
        comment '目录名称',
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
    comment '目录';

ALTER TABLE data_user.t_catalog
    DROP catalog_code;

ALTER TABLE data_user.t_catalog
    ADD catalog_code
        varchar(255)
        null
        comment '目录编码';

ALTER TABLE data_user.t_catalog
    DROP catalog_name;

ALTER TABLE data_user.t_catalog
    ADD catalog_name
        varchar(255)
        null
        comment '目录名称';

```

## 2024-11-14 17:33:17 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;

create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        null
        comment '目录编码',
    catalog_name
        varchar(255)
        null
        comment '目录名称',
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
    comment '目录';

ALTER TABLE data_user.t_catalog
    DROP catalog_code;

ALTER TABLE data_user.t_catalog
    ADD catalog_code
        varchar(255)
        null
        comment '目录编码';

ALTER TABLE data_user.t_catalog
    DROP catalog_name;

ALTER TABLE data_user.t_catalog
    ADD catalog_name
        varchar(255)
        null
        comment '目录名称';

```

## 2025-01-27 22:13:50 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;

create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        null
        comment '目录编码',
    catalog_name
        varchar(255)
        null
        comment '目录名称',
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
    comment '目录';

ALTER TABLE data_user.t_catalog
    DROP catalog_code;

ALTER TABLE data_user.t_catalog
    ADD catalog_code
        varchar(255)
        null
        comment '目录编码';

ALTER TABLE data_user.t_catalog
    MODIFY catalog_code
        varchar(255)
        null
        comment '目录编码';

ALTER TABLE data_user.t_catalog
    DROP catalog_name;

ALTER TABLE data_user.t_catalog
    ADD catalog_name
        varchar(255)
        null
        comment '目录名称';

ALTER TABLE data_user.t_catalog
    MODIFY catalog_name
        varchar(255)
        null
        comment '目录名称';

```

## 2025-01-27 22:20:24 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_catalog;

create table if not exists data_user.t_catalog
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_code
        varchar(255)
        not null
        comment '目录编码',
    catalog_name
        varchar(255)
        not null
        comment '目录名称',
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
    comment '目录';

ALTER TABLE data_user.t_catalog
    DROP catalog_code;

ALTER TABLE data_user.t_catalog
    ADD catalog_code
        varchar(255)
        null
        comment '目录编码';

ALTER TABLE data_user.t_catalog
    MODIFY catalog_code
        varchar(255)
        null
        comment '目录编码';

ALTER TABLE data_user.t_catalog
    DROP catalog_name;

ALTER TABLE data_user.t_catalog
    ADD catalog_name
        varchar(255)
        null
        comment '目录名称';

ALTER TABLE data_user.t_catalog
    MODIFY catalog_name
        varchar(255)
        null
        comment '目录名称';

```

