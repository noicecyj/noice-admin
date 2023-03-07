drop table if exists data_user.t_menu;
create table if not exists data_user.t_menu
(
    id
        varchar(36)
        not null comment '主键'
        primary key,
    menu_code
        varchar(255)
        null
        comment '菜单编码',
    menu_name
        varchar(255)
        null
        comment '菜单名称',
    menu_url
        varchar(255)
        not null
        comment '菜单路径',
    menu_icon
        varchar(255)
        null
        comment '菜单图标',
    menu_component
        varchar(255)
        null
        comment '菜单组件',
    menu_parent_url
        varchar(255)
        null
        comment '菜单父路径',
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
    comment '菜单';
