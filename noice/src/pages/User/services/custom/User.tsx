import {request} from 'ice';

export default {
  resetPassword(data) {
    return request({
      url: '/authApi/resetPassword',
      method: 'post',
      data,
    });
  },
};
