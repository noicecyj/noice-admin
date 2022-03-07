import { Message } from '@alifd/next';
import { history } from 'ice';
import cookie from 'react-cookies';
import loginService from '../services/login';

export default {

  namespace: 'login',

  state: {
    username: '',
    password: '',
    autoLogin: true,
    token:'',
  },

  reducers: {
    setState(prevState, payload) {
      return { ...prevState, ...payload };
    },
  },

  effects: (dispatch) => ({
    /**
     * 数据
     *
     * @param {*} data
     */
    login(data) {
      loginService.login(data)
        .then((res) => {
          console.log(res);
          // @ts-ignore
          cookie.save('token', res.data.accessToken);
          // @ts-ignore
          history.push('/admin');
          Message.success('登录成功');
        }).catch(() => {
          Message.success('登录失败');
        });
    },

    setDataForm(data) {
      const payload = data;
      dispatch.login.setState(payload);
    },
  }),
};
