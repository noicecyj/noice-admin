import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/entityCreateApi/pageTestInstanceAnswer',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/entityCreateApi/saveTestInstanceAnswer',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/entityCreateApi/deleteTestInstanceAnswer',
      method: 'post',
      data,
    });
  },
};
