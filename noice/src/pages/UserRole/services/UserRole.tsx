import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/authApi/pageUserRole',
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
      url: '/authApi/saveUserRole',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/authApi/deleteUserRole',
      method: 'post',
      data,
    });
  },
};
