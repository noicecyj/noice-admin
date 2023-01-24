import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/entityCreateApi/pagePersistentForm',
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
      url: '/entityCreateApi/savePersistentForm',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deletePersistentForm',
      method: 'post',
      data,
    });
  },
};
