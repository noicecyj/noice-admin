import { request } from 'ice';

export default {
  login(data) {
    return request({
      url: '/authApi/v1/login',
      method: 'post',
      data,
    });
  },
};
