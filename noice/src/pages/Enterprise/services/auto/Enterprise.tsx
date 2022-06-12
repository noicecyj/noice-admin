import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/authApi/pageEnterprise',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/authApi/saveEnterprise',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/authApi/deleteEnterprise',
      method: 'post',
      data,
    });
  },
  pageByEnterprise(pageNumber, data) {
    return request({
      url: '/authApi/pageByEnterprise',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
};
