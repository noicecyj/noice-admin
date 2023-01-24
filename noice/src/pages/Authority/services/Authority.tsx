import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/authApi/pageAuthority',
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
      url: '/authApi/saveAuthority',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/authApi/deleteAuthority',
      method: 'post',
      data,
    });
  },
};
