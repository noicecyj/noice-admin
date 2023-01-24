import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/entityCreateApi/pageAppService',
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
      url: '/entityCreateApi/saveAppService',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deleteAppService',
      method: 'post',
      data,
    });
  },
};
