import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/userApi/pageUserRole',
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
      url: '/userApi/saveUserRole',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/userApi/deleteUserRole',
      method: 'post',
      data,
    });
  },
};
