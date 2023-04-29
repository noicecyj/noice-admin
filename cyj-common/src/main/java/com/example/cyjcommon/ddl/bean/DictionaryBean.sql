drop table if exists data_user.t_dictionary;
create table if not exists data_user.t_dictionary
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    dictionary_code
        varchar(255)
        null
        comment '字典编码',
    dictionary_name
        varchar(255)
        null
        comment '字典名称',
    catalog_id
        varchar(36)
        null
        comment '目录id',
    sort_code
        int
        not null comment '排序值',
    status
        int
        not null comment '状态',
    created_date
        timestamp default CURRENT_TIMESTAMP
        null comment '创建时间',
    created_by
        varchar(255)
        null comment '创建人',
    updated_date
        timestamp default CURRENT_TIMESTAMP
        null comment '更新时间',
    updated_by
        varchar(255)
        null comment '更新人'
)
    comment '字典';
ALTER TABLE data_user.t_dictionary DROP dictionary_code;
ALTER TABLE data_user.t_dictionary ADD dictionary_code varchar(255) null comment '字典编码';

ALTER TABLE data_user.t_dictionary DROP dictionary_name;
ALTER TABLE data_user.t_dictionary ADD dictionary_name varchar(255) null comment '字典名称';

ALTER TABLE data_user.t_dictionary DROP catalog_id;
ALTER TABLE data_user.t_dictionary ADD catalog_id varchar(36) null comment '目录id';

