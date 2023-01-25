import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/entityCreateApi/pagePersistentTable',
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
      url: '/entityCreateApi/savePersistentTable',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deletePersistentTable',
      method: 'post',
      data,
    });
  },
};
