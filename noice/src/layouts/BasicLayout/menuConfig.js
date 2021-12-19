const headerMenuConfig = [];
const asideMenuConfig = [
  {

    name: '开发管理',
    icon: 'edit',
    path: '/admin',
    children: [
      {
        name: '菜单管理',
        icon: '',
        path: '/admin/pagemenu',
      },
      {
        name: '数据字典',
        icon: '',
        path: '/admin/catalog',
      },
      {
        name: '实体生成器',
        icon: '',
        path: '/admin/entitycreater',
      },
      {
        name: '日志管理',
        icon: '',
        path: '/admin/log',
      },
      {
        name: 'sql查询器',
        icon: '',
        path: '/admin/sql',
      },
      {
        name: '表单管理',
        icon: '',
        path: '/admin/dataform',
      },
      {
        name: '表格管理',
        icon: '',
        path: '/admin/dataTable',
      },
      {
        name: '服务管理',
        icon: '',
        path: '/admin/appService',
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
        icon: '',
        path: '/auth/user',
      },
      {
        name: '角色管理',
        icon: '',
        path: '/auth/role',
      },
      {
        name: '接口管理',
        icon: '',
        path: '/auth/api',
      },
      {
        name: '功能管理',
        icon: '',
        path: '/auth/pagefunction',
      },
    ],
  },
];

export { headerMenuConfig, asideMenuConfig };
