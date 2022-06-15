import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/entityCreateApi/pageAppService',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/saveAppService',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deleteAppService',
      method: 'post',
      data,
    });
  },
  pageAuthorityByAppService(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pageAuthorityByAppService',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
  pagePersistentByAppService(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pagePersistentByAppService',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
};
