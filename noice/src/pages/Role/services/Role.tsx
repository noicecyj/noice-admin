import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/userApi/pageRole',
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
      url: '/userApi/saveRole',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/userApi/deleteRole',
      method: 'post',
      data,
    });
  },
};
