import {history, Link, Outlet, useLocation} from 'ice';
import ProLayout from '@ant-design/pro-layout';
// import {asideMenuConfig} from '@/menuConfig';
import AvatarDropdown from '@/components/AvatarDropdown';
import logo from '@/assets/logo.png';
import styles from './layout.module.css';
import store from '@/store';
import React, {useEffect} from 'react';
import {useSessionStorageState} from 'ahooks';
import {UserInfo} from "@/interfaces/user";
import {getUserMenu} from "@/services/user";

export default function Layout() {
  const location = useLocation();

  const [userState, userDispatcher] = store.useModel('user');
  userDispatcher.init();
  // useEffect(() => {
  //
  // }, []);

  const userInfo = userState.currentUser;
  const asideMenuConfig = userState.currentUserAuth;
  console.log(userInfo)
  if (['/login'].includes(location.pathname)) {
    return <Outlet/>;
  }

  return (
    <ProLayout
      // menu={{defaultOpenAll: true}}
      className={styles.layout}
      logo={<img src={logo} alt="logo"/>}
      title="ICE Pro"
      location={{
        pathname: location.pathname,
      }}
      layout="mix"
      actionsRender={() => (
        <AvatarDropdown name={userInfo?.userName || "123"}/>
      )}
      // menuDataRender={() => asideMenuConfig}
      menu={{
        request: async () => {
          const userMenu = await getUserMenu();
          return userMenu.data;
        },
      }}
      menuItemRender={(item, defaultDom) => {
        if (!item.path) {
          return defaultDom;
        }
        return <Link to={item.path}>{defaultDom}</Link>;
      }}
    >
      <Outlet/>
    </ProLayout>
  );
}