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
  entityPageByEntity(pageNumber, data) {
    return request({
      url: '/entityCreateApi/entityPageByEntity',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  entityPageByAppService(pageNumber, data) {
    return request({
      url: '/entityCreateApi/entityPageByAppService',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
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
