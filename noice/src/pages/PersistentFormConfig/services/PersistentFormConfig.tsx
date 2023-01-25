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
  save(po, user) {
    return request({
      url: '/entityCreateApi/savePersistentFormConfig',
      method: 'post',
      data: {
        po,
        user,
      },
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
