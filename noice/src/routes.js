import BasicLayout from '@/layouts/BasicLayout';
import UserLayout from '@/layouts/UserLayout';
import LoginPage from '@/pages/Login';
import PersistentPage from '@/pages/Persistent';
import PropertyPage from '@/pages/Property';
import CatalogPage from '@/pages/Catalog';
import DictionaryPage from "@/pages/Dictionary";
import SqlPage from '@/pages/Sql';
import AppServicePage from '@/pages/AppService';
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
        path: '/Persistent',
        component: PersistentPage,
      },
      {
        path: '/Property',
        component: PropertyPage,
      },
      {
        path: '/Catalog',
        component: CatalogPage,
      },
      {
        path: '/Dictionary',
        component: DictionaryPage,
      },
      {
        path: '/Sql',
        component: SqlPage,
      },
      {
        path: '/AppService',
        component: AppServicePage,
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
