import {request} from 'ice';

export default {
  createEntityFile(data) {
    return request({
      url: '/entityCreateApi/createEntity',
      method: 'post',
      data,
    });
  },
  deleteEntityFile(data) {
    return request({
      url: '/entityCreateApi/deleteEntity',
      method: 'post',
      data,
    });
  },
};
