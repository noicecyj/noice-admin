import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/sqlApi/pageSql',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/sqlApi/saveSql',
      method: 'post',
      data,
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
