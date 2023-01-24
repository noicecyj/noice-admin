import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/entityCreateApi/pagePersistentTableSearchConfig',
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
      url: '/entityCreateApi/savePersistentTableSearchConfig',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deletePersistentTableSearchConfig',
      method: 'post',
      data,
    });
  },
};
