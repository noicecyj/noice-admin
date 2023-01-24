import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/authApi/pageUser',
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
      url: '/authApi/saveUser',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/authApi/deleteUser',
      method: 'post',
      data,
    });
  },
};
