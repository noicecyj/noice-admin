## 2024-02-29 23:42:51 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_role;
create table if not exists data_user.t_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_code
        varchar(255)
        null
        comment '角色编码',
    role_name
        varchar(255)
        null
        comment '角色名称',
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
    comment '角色';
```

## 2024-03-05 15:44:53 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_role;
create table if not exists data_user.t_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_code
        varchar(255)
        null
        comment '角色编码',
    role_name
        varchar(255)
        null
        comment '角色名称',
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
    comment '角色';
```

## 2024-03-23 10:05:15 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_role;
create table if not exists data_user.t_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_code
        varchar(255)
        null
        comment '角色编码',
    role_name
        varchar(255)
        null
        comment '角色名称',
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
    comment '角色';

ALTER TABLE data_user.t_role
    DROP role_code;
ALTER TABLE data_user.t_role
    ADD  role_code
            varchar(255)
            null
            comment '角色编码';

ALTER TABLE data_user.t_role
    DROP role_name;
ALTER TABLE data_user.t_role
    ADD  role_name
            varchar(255)
            null
            comment '角色名称';

```

## 2024-03-24 11:00:35 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_role;
create table if not exists data_user.t_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_code
        varchar(255)
        null
        comment '角色编码',
    role_name
        varchar(255)
        null
        comment '角色名称',
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
    comment '角色';

ALTER TABLE data_user.t_role
    DROP role_code;

ALTER TABLE data_user.t_role
    ADD  role_code
            varchar(255)
            null
            comment '角色编码';

ALTER TABLE data_user.t_role
    DROP role_name;

ALTER TABLE data_user.t_role
    ADD  role_name
            varchar(255)
            null
            comment '角色名称';

```

## 2024-09-26 12:26:17 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_role;

create table if not exists data_user.t_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_code
        varchar(255)
        null
        comment '角色编码',
    role_name
        varchar(255)
        null
        comment '角色名称',
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
    comment '角色';

ALTER TABLE data_user.t_role
    DROP role_code;

ALTER TABLE data_user.t_role
    ADD  role_code
            varchar(255)
            null
            comment '角色编码';

ALTER TABLE data_user.t_role
    DROP role_name;

ALTER TABLE data_user.t_role
    ADD  role_name
            varchar(255)
            null
            comment '角色名称';

```
## 2024-10-11 18:41:39 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_role;

create table if not exists data_user.t_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_code
        varchar(255)
        null
        comment '角色编码',
    role_name
        varchar(255)
        null
        comment '角色名称',
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
    comment '角色';

ALTER TABLE data_user.t_role
    DROP role_code;

ALTER TABLE data_user.t_role
    ADD role_code
        varchar(255)
        null
        comment '角色编码';

ALTER TABLE data_user.t_role
    DROP role_name;

ALTER TABLE data_user.t_role
    ADD role_name
        varchar(255)
        null
        comment '角色名称';

```

## 2024-11-14 17:33:23 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_role;

create table if not exists data_user.t_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_code
        varchar(255)
        null
        comment '角色编码',
    role_name
        varchar(255)
        null
        comment '角色名称',
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
    comment '角色';

ALTER TABLE data_user.t_role
    DROP role_code;

ALTER TABLE data_user.t_role
    ADD role_code
        varchar(255)
        null
        comment '角色编码';

ALTER TABLE data_user.t_role
    DROP role_name;

ALTER TABLE data_user.t_role
    ADD role_name
        varchar(255)
        null
        comment '角色名称';

```

