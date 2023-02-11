import BasicLayout from '@/layouts/BasicLayout';
import UserLayout from '@/layouts/UserLayout';
import LoginPage from '@/pages/Login';
import RolePage from '@/pages/Role';
import SqlPage from '@/pages/Sql';
import AppServicePage from '@/pages/AppService';
import DictionaryPage from '@/pages/Dictionary';
import PersistentFormPage from '@/pages/PersistentForm';
import CatalogPage from '@/pages/Catalog';
import PersistentTablePage from '@/pages/PersistentTable';
import AuthorityPage from '@/pages/Authority';
import PropertyPage from '@/pages/Property';
import PersistentTableSearchConfigPage from '@/pages/PersistentTableSearchConfig';
import PersistentPage from '@/pages/Persistent';
import PersistentTableConfigPage from '@/pages/PersistentTableConfig';
import UserPage from '@/pages/User';
import EnterprisePage from '@/pages/Enterprise';
import RoleAuthorityPage from '@/pages/RoleAuthority';
import UserRolePage from '@/pages/UserRole';
import PersistentFormConfigPage from '@/pages/PersistentFormConfig';
import MenuPage from '@/pages/Menu';

const routerConfig = [
  {
    path: '/cyj-user',
    component: BasicLayout,
    children: [
      {
        path: '/Role',
        component: RolePage,
      },
      {
        path: '/Authority',
        component: AuthorityPage,
      },
      {
        path: '/User',
        component: UserPage,
      },
      {
        path: '/Enterprise',
        component: EnterprisePage,
      },
      {
        path: '/RoleAuthority',
        component: RoleAuthorityPage,
      },
      {
        path: '/UserRole',
        component: UserRolePage,
      },
    ],
  },
  {
    path: '/cyj-entity-creater',
    component: BasicLayout,
    children: [
      {
        path: '/AppService',
        component: AppServicePage,
      },
      {
        path: '/PersistentForm',
        component: PersistentFormPage,
      },
      {
        path: '/PersistentTable',
        component: PersistentTablePage,
      },
      {
        path: '/Property',
        component: PropertyPage,
      },
      {
        path: '/PersistentTableSearchConfig',
        component: PersistentTableSearchConfigPage,
      },
      {
        path: '/Persistent',
        component: PersistentPage,
      },
      {
        path: '/PersistentTableConfig',
        component: PersistentTableConfigPage,
      },
      {
        path: '/PersistentFormConfig',
        component: PersistentFormConfigPage,
      },
      {
        path: '/Menu',
        component: MenuPage,
      },
    ],
  },
  {
    path: '/cyj-dictionary',
    component: BasicLayout,
    children: [
      {
        path: '/Dictionary',
        component: DictionaryPage,
      },
      {
        path: '/Catalog',
        component: CatalogPage,
      },
    ],
  },
  {
    path: '/cyj-query',
    component: BasicLayout,
    children: [
      {
        path: '/Sql',
        component: SqlPage,
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
]

export default routerConfig;
