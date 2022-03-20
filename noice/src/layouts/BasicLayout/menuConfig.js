const headerMenuConfig = [];
const asideMenuConfig = [
  {
    name: '开发管理',
    icon: 'edit',
    path: '/admin',
    children: [
      {
        name: '实体生成器',
        path: '/admin/entitycreater',
      },
      {
        name: '数据字典',
        path: '/admin/catalog',
      },
      {
        name: 'sql查询器',
        path: '/admin/sql',
      },
      {
        name: '服务管理',
        path: '/admin/appService',
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

export { headerMenuConfig, asideMenuConfig };
