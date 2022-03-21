import {request} from 'ice';

export default {
  resetPassword(userId) {
    return request({
      url: '/authApi/resetPassword',
      method: 'post',
      params: {
        userId,
      },
    });
  },
  getUserRole(userId) {
    return request({
      url: '/authApi/getUserRole',
      method: 'post',
      params: {
        userId,
      },
    });
  },
  setUserRole(data) {
    return request({
      url: '/authApi/setUserRole',
      method: 'post',
      data,
    });
  },
  getUserAuthority(userId) {
    return request({
      url: '/authApi/getUserAuthority',
      method: 'post',
      params: {
        userId,
      },
    });
  },
  setUserAuthority(data) {
    return request({
      url: '/authApi/setUserAuthority',
      method: 'post',
      data,
    });
  },
};
