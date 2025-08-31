import { defineAppConfig, history } from 'ice';
import { defineRequestConfig } from '@ice/plugin-request/types';
import cookie from 'react-cookies';

// App config, see https://v3.ice.work/docs/guide/basic/app
export default defineAppConfig(() => ({}));


export const requestConfig = defineRequestConfig({
  // 可选的，全局设置 request 是否返回 response 对象，默认为 false
  withFullResponse: false,

  // 拦截器
  interceptors: {
    request: {
      onConfig: (config) => {
        // 发送请求前：可以对 RequestConfig 做一些统一处理
        if (config.url !== '/v1/login') {
          // eslint-disable-next-line no-param-reassign
          config.headers = {
            userName: `${cookie.load('userName')}`,
            token: `${cookie.load('token')}`,
          };
        }
        return config;
      },
      onError: (error) => {
        return Promise.reject(error);
      },
    },
    response: {
      onConfig: (response) => {
        console.log(response);
        return response;
      },
      onError: (error) => {
        // 请求出错：服务端返回错误状态码
        console.log(error);
        if (error.response?.status === 402) {
          history?.push('/');
        }
        if (error.response?.status === 401) {
          history?.push('/login');
        }
        return Promise.reject(error);
      },
    },
  },
});