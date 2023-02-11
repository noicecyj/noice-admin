const headerMenuConfig = [];
const asideMenuConfig = [
  {
    name: '用户服务',
    path: '/cyj-user',
    children: [
      {
        name: '角色',
        path: '/cyj-user/Role',
      },
      {
        name: '权限',
        path: '/cyj-user/Authority',
      },
      {
        name: '用户',
        path: '/cyj-user/User',
      },
      {
        name: '企业',
        path: '/cyj-user/Enterprise',
      },
      {
        name: '角色权限',
        path: '/cyj-user/RoleAuthority',
      },
      {
        name: '用户角色',
        path: '/cyj-user/UserRole',
      },
    ],
  },
  {
    name: '开发服务',
    path: '/cyj-entity-creater',
    children: [
      {
        name: '服务',
        path: '/cyj-entity-creater/AppService',
      },
      {
        name: '实体表单',
        path: '/cyj-entity-creater/PersistentForm',
      },
      {
        name: '实体表格',
        path: '/cyj-entity-creater/PersistentTable',
      },
      {
        name: '属性',
        path: '/cyj-entity-creater/Property',
      },
      {
        name: '实体表格搜索配置',
        path: '/cyj-entity-creater/PersistentTableSearchConfig',
      },
      {
        name: '实体',
        path: '/cyj-entity-creater/Persistent',
      },
      {
        name: '实体表格配置',
        path: '/cyj-entity-creater/PersistentTableConfig',
      },
      {
        name: '实体表单配置',
        path: '/cyj-entity-creater/PersistentFormConfig',
      },
      {
        name: '菜单',
        path: '/cyj-entity-creater/Menu',
      },
    ],
  },
  {
    name: '数据服务',
    path: '/cyj-dictionary',
    children: [
      {
        name: '字典',
        path: '/cyj-dictionary/Dictionary',
      },
      {
        name: '目录',
        path: '/cyj-dictionary/Catalog',
      },
    ],
  },
  {
    name: '查询服务',
    path: '/cyj-query',
    children: [
      {
        name: '查询',
        path: '/cyj-query/Sql',
      },
    ],
  },
]

export {headerMenuConfig, asideMenuConfig};
