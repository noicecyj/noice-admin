import {Link, Outlet, useLocation} from 'ice';
import ProLayout from '@ant-design/pro-layout';
// import {asideMenuConfig} from '@/menuConfig';
import AvatarDropdown from '@/components/AvatarDropdown';
import logo from '@/assets/logo.png';
import styles from './layout.module.css';
import store from '@/store';
import React, {useState} from 'react';
import {getUserMenu} from "@/services/user";
import {Tabs, TabsProps} from "antd";

export default function Layout() {
  const location = useLocation();

  const [userState, userDispatcher] = store.useModel('user');
  userDispatcher.init();

  const userInfo = userState.currentUser;
  if (['/login'].includes(location.pathname)) {
    return <Outlet/>;
  }

  const onChange = (key: string) => {
    console.log(key);
  };

  const items: TabsProps['items'] = [
    {
      key: 'index',
      label: '首页',
    },
  ];

  const [tabs, setTabs] = useState<TabsProps['items']>(items);

  return (
    <ProLayout
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
      onPageChange={(location: Location) => {
        console.log('location', location);
        items.push({
          key: location.pathname,
          label: location.pathname,
        })
        setTabs(items);
      }}
    >
      <Tabs
        defaultActiveKey="1"
        type="card"
        items={tabs}
        onChange={onChange}/>
      <Outlet/>
    </ProLayout>
  );
}