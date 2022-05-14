import {runApp, history} from 'ice';
import cookie from 'react-cookies';

const appConfig = {
  app: {
    rootId: 'ice-container',
  },
  router: {
    type: 'browser',
  },
  request: {
    // 拦截器
    interceptors: {
      request: {
        onConfig: (config) => {
          // 发送请求前：可以对 RequestConfig 做一些统一处理
          console.log("config---->",config);
          if (config.url !== '/authApi/v1/login') {
            // eslint-disable-next-line no-param-reassign
            config.headers = {Authorization: `Bearer ${cookie.load('token')}`};
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
          if (response.data === 402){
            history.push('/');
          }
          return response;
        },
        onError: (error) => {
          return Promise.reject(error);
        },
      },
    },
  },
};
runApp(appConfig);
