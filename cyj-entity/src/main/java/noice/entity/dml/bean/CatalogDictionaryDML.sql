drop table if exists data_user.t_catalog_dictionary;

create table if not exists data_user.t_catalog_dictionary
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    catalog_dictionary_code
        varchar(255)
        null
        comment '字典编码',
    catalog_dictionary_name
        varchar(255)
        null
        comment '字典名称',
    catalog_id
        varchar(36)
        not null
        comment '目录id',
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
    comment '目录字典';

ALTER TABLE data_user.t_catalog_dictionary
    DROP catalog_dictionary_code;

ALTER TABLE data_user.t_catalog_dictionary
    ADD catalog_dictionary_code
        varchar(255)
        null
        comment '字典编码';

ALTER TABLE data_user.t_catalog_dictionary
    MODIFY catalog_dictionary_code
        varchar(255)
        null
        comment '字典编码';

ALTER TABLE data_user.t_catalog_dictionary
    DROP catalog_dictionary_name;

ALTER TABLE data_user.t_catalog_dictionary
    ADD catalog_dictionary_name
        varchar(255)
        null
        comment '字典名称';

ALTER TABLE data_user.t_catalog_dictionary
    MODIFY catalog_dictionary_name
        varchar(255)
        null
        comment '字典名称';

ALTER TABLE data_user.t_catalog_dictionary
    DROP catalog_id;

ALTER TABLE data_user.t_catalog_dictionary
    ADD catalog_id
        varchar(36)
        not null
        comment '目录id';

ALTER TABLE data_user.t_catalog_dictionary
    MODIFY catalog_id
        varchar(36)
        not null
        comment '目录id';

