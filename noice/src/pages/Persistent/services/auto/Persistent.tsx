import {request} from 'ice';

export default {
  page(data, pageNumber, pageSize) {
    return request({
      url: '/entityCreateApi/pagePersistent',
      method: 'post',
      params: {
        pageNumber,
        pageSize,
      },
      data,
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
};
