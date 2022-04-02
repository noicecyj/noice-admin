import * as React from 'react';
import { Overlay, Menu, Icon } from '@alifd/next';
import {Link} from 'ice';
import styles from './index.module.scss';

const { Item } = Menu;
const { Popup } = Overlay;

const UserProfile = ({ name }) => {
  return (
    <div className={styles.profile}>
      <div className={styles.content}>
        <h4>{name}</h4>
      </div>
    </div>
  );
};

const NameLabel = (props) => {
  const { name } = props;
  return (
    <Popup
      trigger={
        <div className={styles.headerAvatar}>
          <span style={{ marginLeft: 10 }}>{name}</span>
        </div>
      }
      triggerType="click"
    >
      <div className={styles.avatarPopup}>
        <UserProfile {...props} />
        <Menu className={styles.menu}>
          <Item><Icon size="small" type="account" />个人设置</Item>
          <Item><Icon size="small" type="set" />系统设置</Item>
          <Item><Icon size="small" type="exit" /><Link to="/">退出</Link></Item>
        </Menu>
      </div>
    </Popup>
  );
};

export default NameLabel;
