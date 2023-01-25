import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/entityCreateApi/pagePersistentTableConfig',
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
      url: '/entityCreateApi/savePersistentTableConfig',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deletePersistentTableConfig',
      method: 'post',
      data,
    });
  },
};
