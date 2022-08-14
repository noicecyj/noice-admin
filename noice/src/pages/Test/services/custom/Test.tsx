import {request} from 'ice';

export default {
  startTest(data) {
    return request({
      url: '/entityCreateApi/startTest',
      method: 'post',
      data,
    });
  },
};
