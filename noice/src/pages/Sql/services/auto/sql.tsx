import { request } from 'ice';

export default {
  sqlPage(pageNumber) {
    return request({
      url: '/sqlApi/sqlPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  sqlSave(data) {
    return request({
      url: '/sqlApi/sqlSave',
      method: 'post',
      data,
    });
  },
  sqlDelete(id) {
    return request({
      url: '/sqlApi/sqlDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findSqlById(id) {
    return request({
      url: '/sqlApi/findSqlById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
