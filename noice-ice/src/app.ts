import {defineAppConfig, history} from 'ice';
import {fetchUserInfo} from './services/user';
import {defineRequestConfig} from '@ice/plugin-request/types';
import cookie from 'react-cookies';

// App config, see https://v3.ice.work/docs/guide/basic/app
export default defineAppConfig(() => ({}));

// export const authConfig = defineAuthConfig(async (appData) => {
//     const {userInfo = {}} = appData;
//
//     if (userInfo.error) {
//         history?.push('/login');
//     }
//
//     return {
//         initialAuth: {
//             admin: true,
//         },
//     };
// });

// export const storeConfig = defineStoreConfig(async (appData) => {
//     const {userInfo = {}, userMenu = {}} = appData;
//     if (userInfo.error) {
//         history?.push('/login');
//     }
//     if (userMenu.error) {
//         history?.push('/login');
//     }
//     return {
//         initialStates: {
//             user: {
//                 currentUser: userInfo,
//             },
//         },
//     };
// });

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
        if (response.data === 402) {
          history?.push('/');
        }
        return response;
      },
      onError: (error) => {
        return Promise.reject(error);
      },
    },
  },
});