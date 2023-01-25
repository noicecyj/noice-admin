import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/entityCreateApi/pagePersistent',
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
      url: '/entityCreateApi/savePersistent',
      method: 'post',
      data: {
        po,
        user,
      },
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
