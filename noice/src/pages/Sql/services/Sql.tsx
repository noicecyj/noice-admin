import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/sqlApi/pageSql',
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
      url: '/sqlApi/saveSql',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/sqlApi/deleteSql',
      method: 'post',
      data,
    });
  },
};
