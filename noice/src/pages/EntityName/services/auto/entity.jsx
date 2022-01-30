import {request} from 'ice';

export default {
  entityPage(pageNumber, pid) {
    return request({
      url: '/entityCreateApi/entityPage',
      method: 'post',
      params: {
        pageNumber,
        pid,
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
  entityDelete(id) {
    return request({
      url: '/entityCreateApi/entityDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findEntityById(id) {
    return request({
      url: '/entityCreateApi/findEntityById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
