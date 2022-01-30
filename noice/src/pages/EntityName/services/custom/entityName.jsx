import {request} from 'ice';

export default {
  createEntityFile(value) {
    return request({
      url: '/entityCreateApi/createEntity',
      method: 'post',
      data: value,
    });
  },
  createComponentFile(value) {
    return request({
      url: '/entityCreateApi/createComponentFile',
      method: 'post',
      data: value,
    });
  },
};
