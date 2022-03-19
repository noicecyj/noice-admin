import {request} from 'ice';

export default {
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
};
