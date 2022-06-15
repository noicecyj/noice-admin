import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/entityCreateApi/pagePersistent',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/savePersistent',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deletePersistent',
      method: 'post',
      data,
    });
  },
  pageAuthorityByPersistent(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pageAuthorityByPersistent',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
  pagePropertyByPersistent(pageNumber, id) {
    return request({
      url: '/entityCreateApi/pagePropertyByPersistent',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
};
