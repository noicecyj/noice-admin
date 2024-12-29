import React, {useCallback} from 'react';
import {history} from 'ice';
import {LogoutOutlined} from '@ant-design/icons';
import {Dropdown} from 'antd';
import type {MenuInfo} from 'rc-menu/lib/interface';
import styles from './index.module.css';
import {logout} from '@/services/user';
import store from '@/store';
import {UserInfo} from "@/interfaces/user";

interface AvatarDropdownProps {
  name: string;
}

const AvatarDropdown: React.FC<AvatarDropdownProps> = ({name}) => {
  const [, userDispatcher] = store.useModel('user');

  const loginOut = async () => {
    await logout();
    history?.push('/login');
  };

  const onMenuClick = useCallback((event: MenuInfo) => {
    const {key} = event;
    if (key === 'logout') {
      userDispatcher.updateCurrentUser({} as UserInfo);
      loginOut().then(r => {
        console.log(r)
      });
    }
  }, []);

  const menu = {
    items: [
      {
        key: 'logout', label: '退出登录', icon: <LogoutOutlined/>, onClick: onMenuClick, className: styles.menu,
      },
    ],
  };
  return (
    <Dropdown menu={menu}>
      <span className={`${styles.action} ${styles.account}`}>
        <span>{name}</span>
      </span>
    </Dropdown>
  );
};

export default AvatarDropdown;
