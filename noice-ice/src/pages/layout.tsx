import {Link, Outlet, useLocation} from 'ice';
import ProLayout from '@ant-design/pro-layout';
// import {asideMenuConfig} from '@/menuConfig';
import AvatarDropdown from '@/components/AvatarDropdown';
import logo from '@/assets/logo.png';
import styles from './layout.module.css';
import store from '@/store';
import React from 'react';
import {useSessionStorageState} from 'ahooks';
import {UserInfo} from "@/interfaces/user";

export default function Layout() {
  const location = useLocation();

  const [userState, userDispatcher] = store.useModel('user');
  const [userInfoLocal] = useSessionStorageState<UserInfo>('userInfo');
  const [userMenuLocal] = useSessionStorageState('userMenu');
  userDispatcher.updateCurrentUser(userInfoLocal);
  userDispatcher.updateCurrentUserAuth(userMenuLocal);
  const userInfo = userState.currentUser;
  const asideMenuConfig = userState.currentUserAuth;

  if (['/login'].includes(location.pathname)) {
    return <Outlet/>;
  }

  return (
    <ProLayout
      menu={{defaultOpenAll: true}}
      className={styles.layout}
      logo={<img src={logo} alt="logo"/>}
      title="ICE Pro"
      location={{
        pathname: location.pathname,
      }}
      layout="mix"
      actionsRender={() => (
        <AvatarDropdown name={userInfo.userName}/>
      )}
      menuDataRender={() => asideMenuConfig}
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