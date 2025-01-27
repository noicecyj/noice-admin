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

