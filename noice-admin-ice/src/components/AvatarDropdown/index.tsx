import React, {useCallback} from 'react';
import {history} from 'ice';
import {LogoutOutlined} from '@ant-design/icons';
import {Avatar, Dropdown, message} from 'antd';
import type {MenuInfo} from 'rc-menu/lib/interface';
import styles from './index.module.css';
import {logout} from '@/services/user';
import store from '@/store';
import {UserInfo} from "@/interfaces/user";

interface AvatarDropdownProps {
    name: string;
    avatar: string;
}

const AvatarDropdown: React.FC<AvatarDropdownProps> = ({name, avatar}) => {
    const [, userDispatcher] = store.useModel('user');

    const loginOut = async () => {
        await logout();
        history?.push({
            pathname: '/login',
        });
    };

    const onMenuClick = useCallback((event: MenuInfo) => {
        const {key} = event;
        if (key === 'logout') {
            userDispatcher.updateCurrentUser({} as UserInfo);
            loginOut().then(() => message.success('退出登录成功！'));
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
        <Avatar size="small" className={styles.avatar} src={avatar} alt="avatar"/>
        <span>{name}</span>
      </span>
        </Dropdown>
    );
};

export default AvatarDropdown;
