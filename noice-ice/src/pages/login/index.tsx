import React, {useState} from 'react';
import {definePageConfig, history} from 'ice';
import {Alert} from 'antd';
import {LockOutlined, UserOutlined} from '@ant-design/icons';
import {LoginForm, ProFormCheckbox, ProFormText} from '@ant-design/pro-form';
import styles from './index.module.css';
import type {LoginParams, LoginResult, UserInfo} from '@/interfaces/user';
import {fetchUserInfo, getUserMenu, login} from '@/services/user';
import store from '@/store';
import logo from '@/assets/logo.png';
import cookie from 'react-cookies';
import {useSessionStorageState} from 'ahooks';

const LoginMessage: React.FC<{
  content: string;
}> = ({content}) => {
  return (
    <Alert
      style={{
        marginBottom: 24,
      }}
      message={content}
      type="error"
      showIcon
    />
  );
};

const Login: React.FC = () => {
  const [loginResult, setLoginResult] = useState<LoginResult>({});
  const [, userDispatcher] = store.useModel('user');
  const [userInfoLocal, setUserInfoLocal] = useSessionStorageState<UserInfo>('userInfo', {
    defaultValue: {
      id: '',
      userName: '',
      userCode: '',
    },
  });
  const [userMenuLocal, setUserMenuLocal] = useSessionStorageState('userMenu', {
    defaultValue: [],
  });

  async function updateUserInfo() {
    const userInfo = await fetchUserInfo();
    const userMenu = await getUserMenu();
    console.log(userInfo.data);
    console.log(userMenu.data);
    userDispatcher.updateCurrentUser(userInfo.data);
    userDispatcher.updateCurrentUserAuth(userMenu.data);
    setUserInfoLocal(userInfo.data);
    setUserMenuLocal(userMenu.data);
    console.log('userInfoLocal', userInfoLocal);
    console.log('userMenuLocal', userMenuLocal);
  }

  async function handleSubmit(values: LoginParams) {
    try {
      const result = await login(values);
      if (result.data) {
        if (result.data.success) {
          console.log(result);
          // 如果失败去设置用户错误信息，显示提示信息
          setLoginResult(result.data);
          if (result.data.token) {
            cookie.save('userName', values.userName, {path: '/'});
            cookie.save('token', result.data.token, {path: '/'});
          } else {
            console.error('Token is not available');
          }
          await updateUserInfo();
          history?.push('/');
          return;
        }
      }
    } catch (error) {
      console.log(error);
    }
  }

  return (
    <div className={styles.container}>
      <LoginForm
        title="ICE Pro"
        logo={<img alt="logo" src={logo}/>}
        subTitle="基于 ice.js 3 开箱即用的中后台模板"
        onFinish={async (values) => {
          await handleSubmit(values as LoginParams);
        }}
      >
        {loginResult.success === false && (
          <LoginMessage
            content="账户或密码错误(admin/ice)"
          />
        )}
        <ProFormText
          name="userName"
          fieldProps={{
            size: 'large',
            prefix: <UserOutlined className={'prefixIcon'}/>,
          }}
          placeholder={'用户名: admin or user'}
          rules={[
            {
              required: true,
              message: '请输入用户名!',
            },
          ]}
        />
        <ProFormText.Password
          name="password"
          fieldProps={{
            size: 'large',
            prefix: <LockOutlined className={'prefixIcon'}/>,
          }}
          placeholder={'密码: ice'}
          rules={[
            {
              required: true,
              message: '请输入密码！',
            },
          ]}
        />
        <div
          style={{
            marginBottom: 24,
          }}
        >
          <ProFormCheckbox noStyle name="autoLogin">
            自动登录
          </ProFormCheckbox>
          <a
            style={{
              float: 'right',
            }}
          >
            忘记密码
          </a>
        </div>
      </LoginForm>
    </div>
  );
};

export const pageConfig = definePageConfig(() => {
  return {
    title: '登录',
  };
});

export default Login;
