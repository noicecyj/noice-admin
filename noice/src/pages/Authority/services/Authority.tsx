import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/userApi/pageAuthority',
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
      url: '/userApi/saveAuthority',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/userApi/deleteAuthority',
      method: 'post',
      data,
    });
  },
};
