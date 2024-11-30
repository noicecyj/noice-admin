## 2024-03-03 13:54:24 noice 作者大大 曹元杰 天才 笔记本

```sql
```

## 2024-03-03 13:56:19 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_user_role;
create table if not exists data_user.t_user_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_id
        varchar(36)
        not null
        comment '角色id',
    user_id
        varchar(36)
        not null
        comment '用户id',
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
    comment '用户角色';
```

## 2024-03-05 20:28:55 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_user_role;
create table if not exists data_user.t_user_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_id
        varchar(36)
        not null
        comment '角色id',
    user_id
        varchar(36)
        not null
        comment '用户id',
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
    comment '用户角色';
```

## 2024-03-23 10:05:16 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_user_role;
create table if not exists data_user.t_user_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_id
        varchar(36)
        not null
        comment '角色id',
    user_id
        varchar(36)
        not null
        comment '用户id',
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
    comment '用户角色';

ALTER TABLE data_user.t_user_role
    DROP role_id;
ALTER TABLE data_user.t_user_role
    ADD  role_id
            varchar(36)
            not null
            comment '角色id';

ALTER TABLE data_user.t_user_role
    DROP user_id;
ALTER TABLE data_user.t_user_role
    ADD  user_id
            varchar(36)
            not null
            comment '用户id';

```

## 2024-03-24 11:00:35 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_user_role;
create table if not exists data_user.t_user_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_id
        varchar(36)
        not null
        comment '角色id',
    user_id
        varchar(36)
        not null
        comment '用户id',
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
    comment '用户角色';

ALTER TABLE data_user.t_user_role
    DROP role_id;

ALTER TABLE data_user.t_user_role
    ADD  role_id
            varchar(36)
            not null
            comment '角色id';

ALTER TABLE data_user.t_user_role
    DROP user_id;

ALTER TABLE data_user.t_user_role
    ADD  user_id
            varchar(36)
            not null
            comment '用户id';

```
## 2024-10-19 07:16:35 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_user_role;

create table if not exists data_user.t_user_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_id
        varchar(36)
        not null
        comment '角色id',
    user_id
        varchar(36)
        not null
        comment '用户id',
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
    comment '用户角色';

ALTER TABLE data_user.t_user_role
    DROP role_id;

ALTER TABLE data_user.t_user_role
    ADD role_id
        varchar(36)
        not null
        comment '角色id';

ALTER TABLE data_user.t_user_role
    DROP user_id;

ALTER TABLE data_user.t_user_role
    ADD user_id
        varchar(36)
        not null
        comment '用户id';

```

## 2024-10-19 07:18:38 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_user_role;

create table if not exists data_user.t_user_role
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    role_id
        varchar(36)
        not null
        comment '角色id',
    user_id
        varchar(36)
        not null
        comment '用户id',
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
    comment '用户角色';

ALTER TABLE data_user.t_user_role
    DROP role_id;

ALTER TABLE data_user.t_user_role
    ADD  role_id
            varchar(36)
            not null
            comment '角色id';

ALTER TABLE data_user.t_user_role
    DROP user_id;

ALTER TABLE data_user.t_user_role
    ADD  user_id
            varchar(36)
            not null
            comment '用户id';

```

