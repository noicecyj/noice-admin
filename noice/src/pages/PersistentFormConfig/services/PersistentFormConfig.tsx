import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/entityCreateApi/pagePersistentFormConfig',
      method: 'post',
      data: {
        po,
        pageNumber,
        pageSize,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/savePersistentFormConfig',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deletePersistentFormConfig',
      method: 'post',
      data,
    });
  },
};
