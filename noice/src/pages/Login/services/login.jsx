import {request} from 'ice';

export default {

  login(data) {
    return request({
      url: '/userApi/v1/login',
      method: 'post',
      data,
    });
  },

};
