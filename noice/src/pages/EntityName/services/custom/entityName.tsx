import { request } from 'ice';

export default {
  createEntityFile(value) {
    return request({
      url: '/entityCreateApi/createEntity',
      method: 'post',
      data: value,
    });
  },
};
