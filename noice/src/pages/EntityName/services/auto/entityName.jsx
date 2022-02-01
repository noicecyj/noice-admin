import { request } from 'ice';

export default {
  entityNamePage(pageNumber) {
    return request({
      url: '/entityCreateApi/entityNamePage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  entityNameSave(data) {
    return request({
      url: '/entityCreateApi/entityNameSave',
      method: 'post',
      data,
    });
  },
  entityNameDelete(id) {
    return request({
      url: '/entityCreateApi/entityNameDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findEntityNameById(id) {
    return request({
      url: '/entityCreateApi/findEntityNameById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
