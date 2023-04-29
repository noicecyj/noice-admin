drop table if exists data_user.t_property;
create table if not exists data_user.t_property
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    property_code
        varchar(255)
        not null
        comment '属性编码',
    property_name
        varchar(255)
        not null
        comment '属性名称',
    property_length
        int
        not null
        comment '属性长度',
    property_type
        varchar(255)
        not null
        comment '属性类型',
    property_null
        int
        not null
        comment '属性是否为空',
    property_relation
        int
        not null
        comment '属性是否关联字段',
    property_multiple_relation
        int
        not null
        comment '属性是否多对多关联字段',
    persistent_id
        varchar(36)
        not null
        comment '实体id',
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
    comment '属性';
ALTER TABLE data_user.t_property DROP property_code;
ALTER TABLE data_user.t_property ADD property_code varchar(255) not null comment '属性编码';

ALTER TABLE data_user.t_property DROP property_name;
ALTER TABLE data_user.t_property ADD property_name varchar(255) not null comment '属性名称';

ALTER TABLE data_user.t_property DROP property_length;
ALTER TABLE data_user.t_property ADD property_length int not null comment '属性长度';

ALTER TABLE data_user.t_property DROP property_type;
ALTER TABLE data_user.t_property ADD property_type varchar(255) not null comment '属性类型';

ALTER TABLE data_user.t_property DROP property_null;
ALTER TABLE data_user.t_property ADD property_null int not null comment '属性是否为空';

ALTER TABLE data_user.t_property DROP property_relation;
ALTER TABLE data_user.t_property ADD property_relation int not null comment '属性是否关联字段';

ALTER TABLE data_user.t_property DROP property_multiple_relation;
ALTER TABLE data_user.t_property ADD property_multiple_relation int not null comment '属性是否多对多关联字段';

ALTER TABLE data_user.t_property DROP persistent_id;
ALTER TABLE data_user.t_property ADD persistent_id varchar(36) not null comment '实体id';

