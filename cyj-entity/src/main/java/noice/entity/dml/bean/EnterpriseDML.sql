drop table if exists data_user.t_enterprise;

create table if not exists data_user.t_enterprise
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    enterprise_code
        varchar(255)
        null
        comment '企业编码',
    enterprise_name
        varchar(255)
        null
        comment '企业名称',
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
    comment '企业';

ALTER TABLE data_user.t_enterprise
    DROP enterprise_code;

ALTER TABLE data_user.t_enterprise
    ADD enterprise_code
        varchar(255)
        null
        comment '企业编码';

ALTER TABLE data_user.t_enterprise
    MODIFY enterprise_code
        varchar(255)
        null
        comment '企业编码';

ALTER TABLE data_user.t_enterprise
    DROP enterprise_name;

ALTER TABLE data_user.t_enterprise
    ADD enterprise_name
        varchar(255)
        null
        comment '企业名称';

ALTER TABLE data_user.t_enterprise
    MODIFY enterprise_name
        varchar(255)
        null
        comment '企业名称';

