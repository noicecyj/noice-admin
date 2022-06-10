import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/authApi/pageAuthority',
      method: 'post',
      params: {
        pageNumber,
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
  authorityByRole(roleId) {
    return request({
      url: '/authApi/authorityByRole',
      method: 'post',
      params: {
        roleId,
      },
    });
  },
  authoritySaveRole(roleId, data) {
    return request({
      url: '/authApi/authoritySaveRole',
      method: 'post',
      params: {
        roleId,
      },
      data,
    });
  },
};
