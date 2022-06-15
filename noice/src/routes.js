import BasicLayout from '@/layouts/BasicLayout';
import UserLayout from '@/layouts/UserLayout';
import LoginPage from '@/pages/Login';
import PersistentPage from '@/pages/Persistent';
import CatalogPage from '@/pages/Catalog';
import SqlPage from '@/pages/Sql';
import AppServicePage from '@/pages/AppService';
import BpmnPage from '@/pages/Bpmn';
import FlowUserPage from '@/pages/FlowUser';
import FlowGroupPage from '@/pages/FlowGroup';
import FlowTenantPage from '@/pages/FlowTenant';
import EnterprisePage from '@/pages/Enterprise';
import UserPage from '@/pages/User';
import RolePage from '@/pages/Role';
import AuthorityPage from '@/pages/Authority';

const routerConfig = [
  {
    path: '/admin',
    component: BasicLayout,
    children: [
      {
        path: '/entitycreater',
        component: PersistentPage,
      },
      {
        path: '/catalog',
        component: CatalogPage,
      },
      {
        path: '/sql',
        component: SqlPage,
      },
      {
        path: '/appService',
        component: AppServicePage,
      },
      {
        path: '/firstMenu',
        component: FirstMenuPage,
      },
      {
        path: '/bpmu',
        component: BpmnPage,
      },
      {
        path: '/flowUser',
        component: FlowUserPage,
      },
      {
        path: '/flowGroup',
        component: FlowGroupPage,
      },
      {
        path: '/flowTenant',
        component: FlowTenantPage,
      },
    ],
  },
  {
    path: '/auth',
    component: BasicLayout,
    children: [
      {
        path: '/enterprise',
        component: EnterprisePage,
      },
      {
        path: '/user',
        component: UserPage,
      },
      {
        path: '/role',
        component: RolePage,
      },
      {
        path: '/authority',
        component: AuthorityPage,
      },
    ],
  },
  {
    path: '/user',
    component: UserLayout,
    children: [
      {
        path: '/login',
        component: LoginPage,
      },
    ],
  },
  {
    path: '/',
    redirect: '/user/login',
  },
];
export default routerConfig;
