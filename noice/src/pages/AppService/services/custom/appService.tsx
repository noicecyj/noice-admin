import { request } from 'ice';
export default {
  createAppFile(value) {
    return request({
      url: '/entityCreateApi/createAppFile',
      method: 'post',
      data: value,
    });
  },
};
