## 2024-02-29 23:42:50 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_app_service;
create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';
```

## 2024-03-05 15:44:52 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_app_service;
create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';
```

## 2024-03-23 10:05:14 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_app_service;
create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';

ALTER TABLE data_user.t_app_service
    DROP app_service_api;
ALTER TABLE data_user.t_app_service
    ADD  app_service_api
            varchar(255)
            null
            comment '服务接口';

ALTER TABLE data_user.t_app_service
    DROP app_service_code;
ALTER TABLE data_user.t_app_service
    ADD  app_service_code
            varchar(255)
            null
            comment '服务编码';

ALTER TABLE data_user.t_app_service
    DROP app_service_name;
ALTER TABLE data_user.t_app_service
    ADD  app_service_name
            varchar(255)
            null
            comment '服务名称';

ALTER TABLE data_user.t_app_service
    DROP app_service_path;
ALTER TABLE data_user.t_app_service
    ADD  app_service_path
            varchar(255)
            null
            comment '服务路径';

ALTER TABLE data_user.t_app_service
    DROP app_service_port;
ALTER TABLE data_user.t_app_service
    ADD  app_service_port
            varchar(255)
            null
            comment '服务端口';

ALTER TABLE data_user.t_app_service
    DROP app_service_true_path;
ALTER TABLE data_user.t_app_service
    ADD  app_service_true_path
            varchar(255)
            null
            comment '服务挂载路径';

```

## 2024-03-24 11:00:33 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_app_service;
create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';

ALTER TABLE data_user.t_app_service
    DROP app_service_api;

ALTER TABLE data_user.t_app_service
    ADD  app_service_api
            varchar(255)
            null
            comment '服务接口';

ALTER TABLE data_user.t_app_service
    DROP app_service_code;

ALTER TABLE data_user.t_app_service
    ADD  app_service_code
            varchar(255)
            null
            comment '服务编码';

ALTER TABLE data_user.t_app_service
    DROP app_service_name;

ALTER TABLE data_user.t_app_service
    ADD  app_service_name
            varchar(255)
            null
            comment '服务名称';

ALTER TABLE data_user.t_app_service
    DROP app_service_path;

ALTER TABLE data_user.t_app_service
    ADD  app_service_path
            varchar(255)
            null
            comment '服务路径';

ALTER TABLE data_user.t_app_service
    DROP app_service_port;

ALTER TABLE data_user.t_app_service
    ADD  app_service_port
            varchar(255)
            null
            comment '服务端口';

ALTER TABLE data_user.t_app_service
    DROP app_service_true_path;

ALTER TABLE data_user.t_app_service
    ADD  app_service_true_path
            varchar(255)
            null
            comment '服务挂载路径';

```

## 2024-09-26 12:26:10 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_app_service;

create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';

ALTER TABLE data_user.t_app_service
    DROP app_service_api;

ALTER TABLE data_user.t_app_service
    ADD  app_service_api
            varchar(255)
            null
            comment '服务接口';

ALTER TABLE data_user.t_app_service
    DROP app_service_code;

ALTER TABLE data_user.t_app_service
    ADD  app_service_code
            varchar(255)
            null
            comment '服务编码';

ALTER TABLE data_user.t_app_service
    DROP app_service_name;

ALTER TABLE data_user.t_app_service
    ADD  app_service_name
            varchar(255)
            null
            comment '服务名称';

ALTER TABLE data_user.t_app_service
    DROP app_service_path;

ALTER TABLE data_user.t_app_service
    ADD  app_service_path
            varchar(255)
            null
            comment '服务路径';

ALTER TABLE data_user.t_app_service
    DROP app_service_port;

ALTER TABLE data_user.t_app_service
    ADD  app_service_port
            varchar(255)
            null
            comment '服务端口';

ALTER TABLE data_user.t_app_service
    DROP app_service_true_path;

ALTER TABLE data_user.t_app_service
    ADD  app_service_true_path
            varchar(255)
            null
            comment '服务挂载路径';

```
## 2024-10-11 18:41:28 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_app_service;

create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';

ALTER TABLE data_user.t_app_service
    DROP app_service_api;

ALTER TABLE data_user.t_app_service
    ADD app_service_api
        varchar(255)
        null
        comment '服务接口';

ALTER TABLE data_user.t_app_service
    DROP app_service_code;

ALTER TABLE data_user.t_app_service
    ADD app_service_code
        varchar(255)
        null
        comment '服务编码';

ALTER TABLE data_user.t_app_service
    DROP app_service_name;

ALTER TABLE data_user.t_app_service
    ADD app_service_name
        varchar(255)
        null
        comment '服务名称';

ALTER TABLE data_user.t_app_service
    DROP app_service_path;

ALTER TABLE data_user.t_app_service
    ADD app_service_path
        varchar(255)
        null
        comment '服务路径';

ALTER TABLE data_user.t_app_service
    DROP app_service_port;

ALTER TABLE data_user.t_app_service
    ADD app_service_port
        varchar(255)
        null
        comment '服务端口';

ALTER TABLE data_user.t_app_service
    DROP app_service_true_path;

ALTER TABLE data_user.t_app_service
    ADD app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径';

```

## 2024-11-14 17:33:16 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_app_service;

create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';

ALTER TABLE data_user.t_app_service
    DROP app_service_api;

ALTER TABLE data_user.t_app_service
    ADD app_service_api
        varchar(255)
        null
        comment '服务接口';

ALTER TABLE data_user.t_app_service
    DROP app_service_code;

ALTER TABLE data_user.t_app_service
    ADD app_service_code
        varchar(255)
        null
        comment '服务编码';

ALTER TABLE data_user.t_app_service
    DROP app_service_name;

ALTER TABLE data_user.t_app_service
    ADD app_service_name
        varchar(255)
        null
        comment '服务名称';

ALTER TABLE data_user.t_app_service
    DROP app_service_path;

ALTER TABLE data_user.t_app_service
    ADD app_service_path
        varchar(255)
        null
        comment '服务路径';

ALTER TABLE data_user.t_app_service
    DROP app_service_port;

ALTER TABLE data_user.t_app_service
    ADD app_service_port
        varchar(255)
        null
        comment '服务端口';

ALTER TABLE data_user.t_app_service
    DROP app_service_true_path;

ALTER TABLE data_user.t_app_service
    ADD app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径';

```

## 2025-01-27 22:13:48 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_app_service;

create table if not exists data_user.t_app_service
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_api
        varchar(255)
        null
        comment '服务接口',
    app_service_code
        varchar(255)
        null
        comment '服务编码',
    app_service_name
        varchar(255)
        null
        comment '服务名称',
    app_service_path
        varchar(255)
        null
        comment '服务路径',
    app_service_port
        varchar(255)
        null
        comment '服务端口',
    app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径',
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
    comment '服务';

ALTER TABLE data_user.t_app_service
    DROP app_service_api;

ALTER TABLE data_user.t_app_service
    ADD app_service_api
        varchar(255)
        null
        comment '服务接口';

ALTER TABLE data_user.t_app_service
    MODIFY app_service_api
        varchar(255)
        null
        comment '服务接口';

ALTER TABLE data_user.t_app_service
    DROP app_service_code;

ALTER TABLE data_user.t_app_service
    ADD app_service_code
        varchar(255)
        null
        comment '服务编码';

ALTER TABLE data_user.t_app_service
    MODIFY app_service_code
        varchar(255)
        null
        comment '服务编码';

ALTER TABLE data_user.t_app_service
    DROP app_service_name;

ALTER TABLE data_user.t_app_service
    ADD app_service_name
        varchar(255)
        null
        comment '服务名称';

ALTER TABLE data_user.t_app_service
    MODIFY app_service_name
        varchar(255)
        null
        comment '服务名称';

ALTER TABLE data_user.t_app_service
    DROP app_service_path;

ALTER TABLE data_user.t_app_service
    ADD app_service_path
        varchar(255)
        null
        comment '服务路径';

ALTER TABLE data_user.t_app_service
    MODIFY app_service_path
        varchar(255)
        null
        comment '服务路径';

ALTER TABLE data_user.t_app_service
    DROP app_service_port;

ALTER TABLE data_user.t_app_service
    ADD app_service_port
        varchar(255)
        null
        comment '服务端口';

ALTER TABLE data_user.t_app_service
    MODIFY app_service_port
        varchar(255)
        null
        comment '服务端口';

ALTER TABLE data_user.t_app_service
    DROP app_service_true_path;

ALTER TABLE data_user.t_app_service
    ADD app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径';

ALTER TABLE data_user.t_app_service
    MODIFY app_service_true_path
        varchar(255)
        null
        comment '服务挂载路径';

```

