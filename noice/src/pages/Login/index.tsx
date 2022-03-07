import React from 'react';
import { Checkbox, Form, Input, ResponsiveGrid } from '@alifd/next';
import pageStore from './store';
// @ts-ignore
import styles from './index.module.scss';

const FormItem = Form.Item;
const { Cell } = ResponsiveGrid;

const accountForm = (
  <>
    <FormItem required requiredMessage="必填">
      <Input name="username" maxLength={20} placeholder="用户名" />
    </FormItem>
    <FormItem required requiredMessage="必填" style={{ marginBottom: 0 }}>
      <Input.Password name="password" htmlType="password" placeholder="密码" />
    </FormItem>
  </>
);
const LoginPage = () => {
  const [loginState, loginDispatchers] = pageStore.useModel('login');
  const user = pageStore.useModelDispatchers('user');

  return (
    <ResponsiveGrid gap={20}>
      <Cell colSpan={12}>
        <div className={styles.LoginBlock}>
          <div className={styles.innerBlock}>
            <p className={styles.desc}>
              <span className={styles.active}> NOICE登录 </span>
            </p>
            <Form value={loginState} onChange={(value) => loginDispatchers.setDataForm(value)} size="large">
              {accountForm}
              <div className={styles.infoLine}>
                <FormItem style={{ marginBottom: 0 }}>
                  <Checkbox name="autoLogin" className={styles.infoLeft}> 自动登录 </Checkbox>
                </FormItem>
                <div>
                  <a href="/" className={styles.link}> 忘记密码 </a>
                </div>
              </div>
              <FormItem style={{ marginBottom: 10 }}>
                <Form.Submit
                  type="primary"
                  onClick={() => {
                    loginDispatchers.login(loginState);
                    user.setState({ username: loginState.username, token: loginState.token });
                  }}
                  className={styles.submitBtn}
                  validate
                > 登录
                </Form.Submit>
              </FormItem>
            </Form>
          </div>
        </div>
      </Cell>
    </ResponsiveGrid>
  );
};

export default LoginPage;
