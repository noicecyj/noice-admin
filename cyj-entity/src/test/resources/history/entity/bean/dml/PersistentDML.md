## 2024-02-29 23:42:51 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;
create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        not null
        comment '服务id',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_name
        varchar(255)
        null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';
```

## 2024-03-05 15:44:53 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;
create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        not null
        comment '服务id',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_name
        varchar(255)
        null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';
```

## 2024-03-23 10:05:15 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;
create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        not null
        comment '服务id',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_name
        varchar(255)
        null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';

ALTER TABLE data_user.t_persistent
    DROP app_service_id;
ALTER TABLE data_user.t_persistent
    ADD  app_service_id
            varchar(36)
            not null
            comment '服务id';

ALTER TABLE data_user.t_persistent
    DROP persistent_code;
ALTER TABLE data_user.t_persistent
    ADD  persistent_code
            varchar(255)
            null
            comment '实体编码';

ALTER TABLE data_user.t_persistent
    DROP persistent_id;
ALTER TABLE data_user.t_persistent
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

ALTER TABLE data_user.t_persistent
    DROP persistent_name;
ALTER TABLE data_user.t_persistent
    ADD  persistent_name
            varchar(255)
            null
            comment '实体名称';

ALTER TABLE data_user.t_persistent
    DROP persistent_type;
ALTER TABLE data_user.t_persistent
    ADD  persistent_type
            varchar(255)
            null
            comment '实体类型';

```

## 2024-03-24 11:00:34 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;
create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        not null
        comment '服务id',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_name
        varchar(255)
        null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';

ALTER TABLE data_user.t_persistent
    DROP app_service_id;

ALTER TABLE data_user.t_persistent
    ADD  app_service_id
            varchar(36)
            not null
            comment '服务id';

ALTER TABLE data_user.t_persistent
    DROP persistent_code;

ALTER TABLE data_user.t_persistent
    ADD  persistent_code
            varchar(255)
            null
            comment '实体编码';

ALTER TABLE data_user.t_persistent
    DROP persistent_id;

ALTER TABLE data_user.t_persistent
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

ALTER TABLE data_user.t_persistent
    DROP persistent_name;

ALTER TABLE data_user.t_persistent
    ADD  persistent_name
            varchar(255)
            null
            comment '实体名称';

ALTER TABLE data_user.t_persistent
    DROP persistent_type;

ALTER TABLE data_user.t_persistent
    ADD  persistent_type
            varchar(255)
            null
            comment '实体类型';

```

## 2024-09-26 12:26:13 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;

create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        not null
        comment '服务id',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_name
        varchar(255)
        null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';

ALTER TABLE data_user.t_persistent
    DROP app_service_id;

ALTER TABLE data_user.t_persistent
    ADD  app_service_id
            varchar(36)
            not null
            comment '服务id';

ALTER TABLE data_user.t_persistent
    DROP persistent_code;

ALTER TABLE data_user.t_persistent
    ADD  persistent_code
            varchar(255)
            null
            comment '实体编码';

ALTER TABLE data_user.t_persistent
    DROP persistent_id;

ALTER TABLE data_user.t_persistent
    ADD  persistent_id
            varchar(36)
            not null
            comment '实体id';

ALTER TABLE data_user.t_persistent
    DROP persistent_name;

ALTER TABLE data_user.t_persistent
    ADD  persistent_name
            varchar(255)
            null
            comment '实体名称';

ALTER TABLE data_user.t_persistent
    DROP persistent_type;

ALTER TABLE data_user.t_persistent
    ADD  persistent_type
            varchar(255)
            null
            comment '实体类型';

```
## 2024-10-11 18:41:33 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;

create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        not null
        comment '服务id',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_name
        varchar(255)
        null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';

ALTER TABLE data_user.t_persistent
    DROP app_service_id;

ALTER TABLE data_user.t_persistent
    ADD app_service_id
        varchar(36)
        not null
        comment '服务id';

ALTER TABLE data_user.t_persistent
    DROP persistent_code;

ALTER TABLE data_user.t_persistent
    ADD persistent_code
        varchar(255)
        null
        comment '实体编码';

ALTER TABLE data_user.t_persistent
    DROP persistent_id;

ALTER TABLE data_user.t_persistent
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent
    DROP persistent_name;

ALTER TABLE data_user.t_persistent
    ADD persistent_name
        varchar(255)
        null
        comment '实体名称';

ALTER TABLE data_user.t_persistent
    DROP persistent_type;

ALTER TABLE data_user.t_persistent
    ADD persistent_type
        varchar(255)
        null
        comment '实体类型';

```

## 2024-11-14 17:33:19 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;

create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        not null
        comment '服务id',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_name
        varchar(255)
        null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';

ALTER TABLE data_user.t_persistent
    DROP app_service_id;

ALTER TABLE data_user.t_persistent
    ADD app_service_id
        varchar(36)
        not null
        comment '服务id';

ALTER TABLE data_user.t_persistent
    DROP persistent_code;

ALTER TABLE data_user.t_persistent
    ADD persistent_code
        varchar(255)
        null
        comment '实体编码';

ALTER TABLE data_user.t_persistent
    DROP persistent_id;

ALTER TABLE data_user.t_persistent
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent
    DROP persistent_name;

ALTER TABLE data_user.t_persistent
    ADD persistent_name
        varchar(255)
        null
        comment '实体名称';

ALTER TABLE data_user.t_persistent
    DROP persistent_type;

ALTER TABLE data_user.t_persistent
    ADD persistent_type
        varchar(255)
        null
        comment '实体类型';

```

## 2025-01-27 22:13:51 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;

create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        not null
        comment '服务id',
    persistent_code
        varchar(255)
        null
        comment '实体编码',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
    persistent_name
        varchar(255)
        null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';

ALTER TABLE data_user.t_persistent
    DROP app_service_id;

ALTER TABLE data_user.t_persistent
    ADD app_service_id
        varchar(36)
        not null
        comment '服务id';

ALTER TABLE data_user.t_persistent
    MODIFY app_service_id
        varchar(36)
        not null
        comment '服务id';

ALTER TABLE data_user.t_persistent
    DROP persistent_code;

ALTER TABLE data_user.t_persistent
    ADD persistent_code
        varchar(255)
        null
        comment '实体编码';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_code
        varchar(255)
        null
        comment '实体编码';

ALTER TABLE data_user.t_persistent
    DROP persistent_id;

ALTER TABLE data_user.t_persistent
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent
    DROP persistent_name;

ALTER TABLE data_user.t_persistent
    ADD persistent_name
        varchar(255)
        null
        comment '实体名称';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_name
        varchar(255)
        null
        comment '实体名称';

ALTER TABLE data_user.t_persistent
    DROP persistent_type;

ALTER TABLE data_user.t_persistent
    ADD persistent_type
        varchar(255)
        null
        comment '实体类型';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_type
        varchar(255)
        null
        comment '实体类型';

```

## 2025-01-27 22:20:26 noice 作者大大 曹元杰 天才 笔记本

```sql
drop table if exists data_user.t_persistent;

create table if not exists data_user.t_persistent
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    app_service_id
        varchar(36)
        null
        comment '服务id',
    persistent_cascade
        tinyint(1)
        null
        comment '实体是否级联删除',
    persistent_code
        varchar(255)
        not null
        comment '实体编码',
    persistent_id
        varchar(36)
        null
        comment '实体id',
    persistent_name
        varchar(255)
        not null
        comment '实体名称',
    persistent_type
        varchar(255)
        null
        comment '实体类型',
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
    comment '实体';

ALTER TABLE data_user.t_persistent
    DROP app_service_id;

ALTER TABLE data_user.t_persistent
    ADD app_service_id
        varchar(36)
        not null
        comment '服务id';

ALTER TABLE data_user.t_persistent
    MODIFY app_service_id
        varchar(36)
        not null
        comment '服务id';

ALTER TABLE data_user.t_persistent
    DROP persistent_cascade;

ALTER TABLE data_user.t_persistent
    ADD persistent_cascade
        tinyint(1)
        not null
        comment '实体是否级联删除';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_cascade
        tinyint(1)
        not null
        comment '实体是否级联删除';

ALTER TABLE data_user.t_persistent
    DROP persistent_code;

ALTER TABLE data_user.t_persistent
    ADD persistent_code
        varchar(255)
        null
        comment '实体编码';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_code
        varchar(255)
        null
        comment '实体编码';

ALTER TABLE data_user.t_persistent
    DROP persistent_id;

ALTER TABLE data_user.t_persistent
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent
    DROP persistent_name;

ALTER TABLE data_user.t_persistent
    ADD persistent_name
        varchar(255)
        null
        comment '实体名称';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_name
        varchar(255)
        null
        comment '实体名称';

ALTER TABLE data_user.t_persistent
    DROP persistent_type;

ALTER TABLE data_user.t_persistent
    ADD persistent_type
        varchar(255)
        not null
        comment '实体类型';

ALTER TABLE data_user.t_persistent
    MODIFY persistent_type
        varchar(255)
        not null
        comment '实体类型';

```

