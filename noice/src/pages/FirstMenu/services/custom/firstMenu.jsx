import { request } from 'ice';

export default {
  createMenu() {
    return request({
      url: '/entityCreateApi/firstMenuPage',
      method: 'post',
    });
  },
};
