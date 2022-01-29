import BasicLayout from '@/layouts/BasicLayout';
import UserLayout from '@/layouts/UserLayout';
import LoginPage from '@/pages/Login';
// import MenuPagePage from '@/pages/MenuPage';
import CatalogPage from '@/pages/Catalog';
import EntityNamePage from '@/pages/EntityName';
// import LogPage from '@/pages/Log';
import AppServicePage from '@/pages/AppService';
// import UserPage from '@/pages/User';
// import RolePage from '@/pages/Role';
// import ApiPage from '@/pages/Api';

const routerConfig = [
  {
    path: '/admin',
    component: BasicLayout,
    children: [
      // {
      //   path: '/pagemenu',
      //   component: MenuPagePage,
      // },
      {
        path: '/catalog',
        component: CatalogPage,
      },
      {
        path: '/entitycreater',
        component: EntityNamePage,
      },
      // {
      //   path: '/log',
      //   component: LogPage,
      // },
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
      // {
      //   path: '/user',
      //   component: UserPage,
      // },
      // {
      //   path: '/role',
      //   component: RolePage,
      // },
      // {
      //   path: '/api',
      //   component: ApiPage,
      // },
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
