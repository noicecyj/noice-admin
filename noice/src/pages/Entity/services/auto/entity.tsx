import {request} from 'ice';

export default {
  entityPage(pageNumber) {
    return request({
      url: '/entityCreateApi/entityPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  entitySave(data) {
    return request({
      url: '/entityCreateApi/entitySave',
      method: 'post',
      data,
    });
  },
  entityDelete(data) {
    return request({
      url: '/entityCreateApi/entityDelete',
      method: 'post',
      data,
    });
  },
};
