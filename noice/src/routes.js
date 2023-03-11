import BasicLayout from '@/layouts/BasicLayout';
import UserLayout from '@/layouts/UserLayout';
import LoginPage from '@/pages/Login';
import PropertyPage from '@/pages/Property';
import SqlPage from '@/pages/Sql';
import UserRolePage from '@/pages/UserRole';
import CatalogPage from '@/pages/Catalog';
import MenuPage from '@/pages/Menu';
import PersistentTableConfigPage from '@/pages/PersistentTableConfig';
import PersistentTableSearchConfigPage from '@/pages/PersistentTableSearchConfig';
import PersistentTablePage from '@/pages/PersistentTable';
import AppServicePage from '@/pages/AppService';
import EnterprisePage from '@/pages/Enterprise';
import RolePage from '@/pages/Role';
import PersistentPage from '@/pages/Persistent';
import RoleAuthorityPage from '@/pages/RoleAuthority';
import UserPage from '@/pages/User';
import AuthorityPage from '@/pages/Authority';
import PersistentFormConfigPage from '@/pages/PersistentFormConfig';
import PersistentFormPage from '@/pages/PersistentForm';
import DictionaryPage from '@/pages/Dictionary';

const routerConfig = [
  {
    path: '/cyj-user',
    component: BasicLayout,
    children: [
      {
        path: '/UserRole',
        component: UserRolePage,
      },
      {
        path: '/Enterprise',
        component: EnterprisePage,
      },
      {
        path: '/Role',
        component: RolePage,
      },
      {
        path: '/RoleAuthority',
        component: RoleAuthorityPage,
      },
      {
        path: '/User',
        component: UserPage,
      },
      {
        path: '/Authority',
        component: AuthorityPage,
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
    path: '/cyj-entity-creater',
    component: BasicLayout,
    children: [
      {
        path: '/Property',
        component: PropertyPage,
      },
      {
        path: '/Menu',
        component: MenuPage,
      },
      {
        path: '/PersistentTableConfig',
        component: PersistentTableConfigPage,
      },
      {
        path: '/PersistentTableSearchConfig',
        component: PersistentTableSearchConfigPage,
      },
      {
        path: '/PersistentTable',
        component: PersistentTablePage,
      },
      {
        path: '/AppService',
        component: AppServicePage,
      },
      {
        path: '/Persistent',
        component: PersistentPage,
      },
      {
        path: '/PersistentFormConfig',
        component: PersistentFormConfigPage,
      },
      {
        path: '/PersistentForm',
        component: PersistentFormPage,
      },
    ],
  },
  {
    path: '/cyj-dictionary',
    component: BasicLayout,
    children: [
      {
        path: '/Catalog',
        component: CatalogPage,
      },
      {
        path: '/Dictionary',
        component: DictionaryPage,
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
