drop table if exists data_user.t_persistent_property;

create table if not exists data_user.t_persistent_property
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    persistent_id
        varchar(36)
        null
        comment '实体id',
    persistent_property_code
        varchar(255)
        not null
        comment '属性编码',
    persistent_property_default_value
        varchar(255)
        null
        comment '属性默认值',
    persistent_property_length
        int
        null
        comment '属性长度',
    persistent_property_name
        varchar(255)
        not null
        comment '属性名称',
    persistent_property_null
        tinyint(1)
        null
        comment '属性是否为空',
    persistent_property_type
        varchar(255)
        null
        comment '属性类型',
    relation_persistent_id
        varchar(36)
        null
        comment '关联实体id',
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
    comment '实体属性';

ALTER TABLE data_user.t_persistent_property
    DROP persistent_id;

ALTER TABLE data_user.t_persistent_property
    ADD persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent_property
    MODIFY persistent_id
        varchar(36)
        not null
        comment '实体id';

ALTER TABLE data_user.t_persistent_property
    DROP persistent_property_code;

ALTER TABLE data_user.t_persistent_property
    ADD persistent_property_code
        varchar(255)
        null
        comment '属性编码';

ALTER TABLE data_user.t_persistent_property
    MODIFY persistent_property_code
        varchar(255)
        null
        comment '属性编码';

ALTER TABLE data_user.t_persistent_property
    DROP persistent_property_default_value;

ALTER TABLE data_user.t_persistent_property
    ADD persistent_property_default_value
        varchar(255)
        not null
        comment '属性默认值';

ALTER TABLE data_user.t_persistent_property
    MODIFY persistent_property_default_value
        varchar(255)
        not null
        comment '属性默认值';

ALTER TABLE data_user.t_persistent_property
    DROP persistent_property_length;

ALTER TABLE data_user.t_persistent_property
    ADD persistent_property_length
        int
        not null
        comment '属性长度';

ALTER TABLE data_user.t_persistent_property
    MODIFY persistent_property_length
        int
        not null
        comment '属性长度';

ALTER TABLE data_user.t_persistent_property
    DROP persistent_property_name;

ALTER TABLE data_user.t_persistent_property
    ADD persistent_property_name
        varchar(255)
        null
        comment '属性名称';

ALTER TABLE data_user.t_persistent_property
    MODIFY persistent_property_name
        varchar(255)
        null
        comment '属性名称';

ALTER TABLE data_user.t_persistent_property
    DROP persistent_property_null;

ALTER TABLE data_user.t_persistent_property
    ADD persistent_property_null
        tinyint(1)
        not null
        comment '属性是否为空';

ALTER TABLE data_user.t_persistent_property
    MODIFY persistent_property_null
        tinyint(1)
        not null
        comment '属性是否为空';

ALTER TABLE data_user.t_persistent_property
    DROP persistent_property_type;

ALTER TABLE data_user.t_persistent_property
    ADD persistent_property_type
        varchar(255)
        not null
        comment '属性类型';

ALTER TABLE data_user.t_persistent_property
    MODIFY persistent_property_type
        varchar(255)
        not null
        comment '属性类型';

ALTER TABLE data_user.t_persistent_property
    DROP relation_persistent_id;

ALTER TABLE data_user.t_persistent_property
    ADD relation_persistent_id
        varchar(36)
        not null
        comment '关联实体id';

ALTER TABLE data_user.t_persistent_property
    MODIFY relation_persistent_id
        varchar(36)
        not null
        comment '关联实体id';

