import BasicLayout from '@/layouts/BasicLayout';
import UserLayout from '@/layouts/UserLayout';
import LoginPage from '@/pages/Login';
import CatalogPage from '@/pages/Catalog';
import EntityNamePage from '@/pages/EntityName';
import SqlPage from '@/pages/Sql';
import AppServicePage from '@/pages/AppService';
import UserPage from '@/pages/User';
import RolePage from '@/pages/Role';
// import ApiPage from '@/pages/Api';

const routerConfig = [
  {
    path: '/admin',
    component: BasicLayout,
    children: [
      {
        path: '/catalog',
        component: CatalogPage,
      },
      {
        path: '/entitycreater',
        component: EntityNamePage,
      },
      {
        path: '/sql',
        component: SqlPage,
      },
      {
        path: '/appService',
        component: AppServicePage,
      },
    ],
  },
  {
    path: '/auth',
    component: BasicLayout,
    children: [
      {
        path: '/user',
        component: UserPage,
      },
      {
        path: '/role',
        component: RolePage,
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
    // 重定向
    redirect: '/user/login',
  },
];
export default routerConfig;
