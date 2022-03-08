import BasicLayout from '@/layouts/BasicLayout';
import UserLayout from '@/layouts/UserLayout';
import LoginPage from '@/pages/Login';
import EntityNamePage from '@/pages/EntityName';
import CatalogPage from '@/pages/Catalog';
import SqlPage from '@/pages/Sql';
import AppServicePage from '@/pages/AppService';
import FirstMenuPage from '@/pages/FirstMenu';
import RolePage from '@/pages/Role';
import UserPage from '@/pages/User';
import AuthorityPage from '@/pages/Authority';

const routerConfig = [
  {
    path: '/admin',
    component: BasicLayout,
    children: [
      {
        path: '/entitycreater',
        component: EntityNamePage,
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
    ],
  },
  {
    path: '/auth',
    component: BasicLayout,
    children: [
      {
        path: '/role',
        component: RolePage,
      },
      {
        path: '/user',
        component: UserPage,
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
