const headerMenuConfig = [];
const asideMenuConfig = [
  {
    name: '开发管理',
    icon: 'edit',
    path: '/admin',
    children: [
      {
        name: '实体',
        path: '/admin/Persistent',
      },
      {
        name: '属性',
        path: '/admin/Property',
      },
      {
        name: '数据目录',
        path: '/admin/Catalog',
      },
      {
        name: '数据字典',
        path: '/admin/Dictionary',
      },
      {
        name: 'sql查询器',
        path: '/admin/Sql',
      },
      {
        name: '服务管理',
        path: '/admin/AppService',
      },
      {
        name: '菜单管理',
        path: '/admin/firstMenu',
      },
    ],
  },
  {
    name: '系统管理',
    icon: 'set',
    path: '/auth',
    children: [
      {
        name: '企业管理',
        path: '/auth/enterprise',
      },
      {
        name: '用户管理',
        path: '/auth/user',
      },
      {
        name: '角色管理',
        path: '/auth/role',
      },
      {
        name: '权限管理',
        path: '/auth/authority',
      },
    ],
  },
];

export {headerMenuConfig, asideMenuConfig};
