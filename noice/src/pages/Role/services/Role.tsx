import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/authApi/pageRole',
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
      url: '/authApi/saveRole',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/authApi/deleteRole',
      method: 'post',
      data,
    });
  },
};
