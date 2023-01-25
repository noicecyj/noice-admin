import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/userApi/pageEnterprise',
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
      url: '/userApi/saveEnterprise',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/userApi/deleteEnterprise',
      method: 'post',
      data,
    });
  },
};
