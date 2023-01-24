import {request} from 'ice';

export default {
  login(data) {
    return request({
      url: '/v1/login',
      method: 'post',
      data,
    });
  },
};
