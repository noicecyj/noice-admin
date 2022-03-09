import {request} from 'ice';

export default {
  createMenu() {
    return request({
      url: '/entityCreateApi/createMenu',
      method: 'post',
    });
  },
};
