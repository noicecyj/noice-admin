import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/authApi/pageRole',
      method: 'post',
      params: {
        pageNumber,
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
  authorityByRole(id) {
    return request({
      url: '/authApi/authorityByRole',
      method: 'post',
      params: {
        id,
      },
    });
  },
  authoritySaveRole(id, data) {
    return request({
      url: '/authApi/authoritySaveRole',
      method: 'post',
      params: {
        id,
      },
      data,
    });
  },
};
