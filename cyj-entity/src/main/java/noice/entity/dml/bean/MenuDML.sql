drop table if exists data_user.t_menu;

create table if not exists data_user.t_menu
(
    id
        varchar(36)
        not null
        comment '主键'
        primary key,
    authority_id
        varchar(36)
        not null
        comment '权限id',
    menu_code
        varchar(255)
        null
        comment '菜单编码',
    menu_icon
        varchar(255)
        null
        comment '菜单图标',
    menu_id
        varchar(36)
        not null
        comment '菜单id',
    menu_name
        varchar(255)
        null
        comment '菜单名称',
    menu_url
        varchar(255)
        null
        comment '菜单路径',
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
    comment '菜单';

ALTER TABLE data_user.t_menu
    DROP authority_id;

ALTER TABLE data_user.t_menu
    ADD authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_menu
    MODIFY authority_id
        varchar(36)
        not null
        comment '权限id';

ALTER TABLE data_user.t_menu
    DROP menu_code;

ALTER TABLE data_user.t_menu
    ADD menu_code
        varchar(255)
        null
        comment '菜单编码';

ALTER TABLE data_user.t_menu
    MODIFY menu_code
        varchar(255)
        null
        comment '菜单编码';

ALTER TABLE data_user.t_menu
    DROP menu_icon;

ALTER TABLE data_user.t_menu
    ADD menu_icon
        varchar(255)
        null
        comment '菜单图标';

ALTER TABLE data_user.t_menu
    MODIFY menu_icon
        varchar(255)
        null
        comment '菜单图标';

ALTER TABLE data_user.t_menu
    DROP menu_id;

ALTER TABLE data_user.t_menu
    ADD menu_id
        varchar(36)
        not null
        comment '菜单id';

ALTER TABLE data_user.t_menu
    MODIFY menu_id
        varchar(36)
        not null
        comment '菜单id';

ALTER TABLE data_user.t_menu
    DROP menu_name;

ALTER TABLE data_user.t_menu
    ADD menu_name
        varchar(255)
        null
        comment '菜单名称';

ALTER TABLE data_user.t_menu
    MODIFY menu_name
        varchar(255)
        null
        comment '菜单名称';

ALTER TABLE data_user.t_menu
    DROP menu_url;

ALTER TABLE data_user.t_menu
    ADD menu_url
        varchar(255)
        null
        comment '菜单路径';

ALTER TABLE data_user.t_menu
    MODIFY menu_url
        varchar(255)
        null
        comment '菜单路径';

