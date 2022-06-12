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
  pageUserByEnterprise(pageNumber, id) {
    return request({
      url: '/authApi/pageUserByEnterprise',
      method: 'post',
      params: {
        pageNumber,
        id,
      },
    });
  },
};
