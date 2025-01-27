drop table if exists data_user.t_work_flow;

create table if not exists data_user.t_work_flow
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    work_flow_code
        varchar(255)
        not null
        comment '流程编码',
    work_flow_name
        varchar(255)
        not null
        comment '流程名称',
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
    comment '流程';

ALTER TABLE data_user.t_work_flow
    DROP work_flow_code;

ALTER TABLE data_user.t_work_flow
    ADD work_flow_code
        varchar(255)
        null
        comment '流程编码';

ALTER TABLE data_user.t_work_flow
    MODIFY work_flow_code
        varchar(255)
        null
        comment '流程编码';

ALTER TABLE data_user.t_work_flow
    DROP work_flow_name;

ALTER TABLE data_user.t_work_flow
    ADD work_flow_name
        varchar(255)
        null
        comment '流程名称';

ALTER TABLE data_user.t_work_flow
    MODIFY work_flow_name
        varchar(255)
        null
        comment '流程名称';

