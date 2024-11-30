## 2024-02-29 23:42:51 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_table;
create table if not exists data_user.t_persistent_table
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_table_code
        varchar(255)
        null
        comment '实体表格编码',
    persistent_table_name
        varchar(255)
        null
        comment '实体表格名称',
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
    comment '实体表格';
```

## 2024-03-05 15:44:53 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_table;
create table if not exists data_user.t_persistent_table
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_table_code
        varchar(255)
        null
        comment '实体表格编码',
    persistent_table_name
        varchar(255)
        null
        comment '实体表格名称',
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
    comment '实体表格';
```

## 2024-03-24 00:35:18 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_table;
create table if not exists data_user.t_persistent_table
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_table_code
        varchar(255)
        null
        comment '实体表格编码',
    persistent_table_name
        varchar(255)
        null
        comment '实体表格名称',
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
    comment '实体表格';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_id;
ALTER TABLE data_user.t_persistent_table
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_code;
ALTER TABLE data_user.t_persistent_table
    ADD  persistent_table_code
            varchar(255)
            null
            comment '实体表格编码';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_name;
ALTER TABLE data_user.t_persistent_table
    ADD  persistent_table_name
            varchar(255)
            null
            comment '实体表格名称';

```

## 2024-03-24 11:00:34 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_table;
create table if not exists data_user.t_persistent_table
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_table_code
        varchar(255)
        null
        comment '实体表格编码',
    persistent_table_name
        varchar(255)
        null
        comment '实体表格名称',
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
    comment '实体表格';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_id;

ALTER TABLE data_user.t_persistent_table
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_code;

ALTER TABLE data_user.t_persistent_table
    ADD  persistent_table_code
            varchar(255)
            null
            comment '实体表格编码';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_name;

ALTER TABLE data_user.t_persistent_table
    ADD  persistent_table_name
            varchar(255)
            null
            comment '实体表格名称';

```

## 2024-09-26 12:26:15 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_table;

create table if not exists data_user.t_persistent_table
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_table_code
        varchar(255)
        null
        comment '实体表格编码',
    persistent_table_name
        varchar(255)
        null
        comment '实体表格名称',
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
    comment '实体表格';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_id;

ALTER TABLE data_user.t_persistent_table
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_code;

ALTER TABLE data_user.t_persistent_table
    ADD  persistent_table_code
            varchar(255)
            null
            comment '实体表格编码';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_name;

ALTER TABLE data_user.t_persistent_table
    ADD  persistent_table_name
            varchar(255)
            null
            comment '实体表格名称';

```
## 2024-10-11 18:41:37 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_table;

create table if not exists data_user.t_persistent_table
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_table_code
        varchar(255)
        null
        comment '实体表格编码',
    persistent_table_name
        varchar(255)
        null
        comment '实体表格名称',
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
    comment '实体表格';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_id;

ALTER TABLE data_user.t_persistent_table
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_code;

ALTER TABLE data_user.t_persistent_table
    ADD persistent_table_code
        varchar(255)
        null
        comment '实体表格编码';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_name;

ALTER TABLE data_user.t_persistent_table
    ADD persistent_table_name
        varchar(255)
        null
        comment '实体表格名称';

```

## 2024-11-14 17:33:22 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent_table;

create table if not exists data_user.t_persistent_table
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_table_code
        varchar(255)
        null
        comment '实体表格编码',
    persistent_table_name
        varchar(255)
        null
        comment '实体表格名称',
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
    comment '实体表格';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_id;

ALTER TABLE data_user.t_persistent_table
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_code;

ALTER TABLE data_user.t_persistent_table
    ADD persistent_table_code
        varchar(255)
        null
        comment '实体表格编码';

ALTER TABLE data_user.t_persistent_table
    DROP persistent_table_name;

ALTER TABLE data_user.t_persistent_table
    ADD persistent_table_name
        varchar(255)
        null
        comment '实体表格名称';

```

