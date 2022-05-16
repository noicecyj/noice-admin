import {request} from 'ice';

export default {
  authorityPage(pageNumber) {
    return request({
      url: '/authApi/authorityPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  authoritySave(data) {
    return request({
      url: '/authApi/authoritySave',
      method: 'post',
      data,
    });
  },
  authorityDelete(id) {
    return request({
      url: '/authApi/authorityDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findAuthorityById(id) {
    return request({
      url: '/authApi/findAuthorityById',
      method: 'post',
      params: {
        id,
      },
    });
  },
  getUserAuthority(userId) {
    return request({
      url: '/authApi/getUserAuthority',
      method: 'post',
      params: {
        userId,
      },
    });
  },
  setUserAuthority(data) {
    return request({
      url: '/authApi/setUserAuthority',
      method: 'post',
      data,
    });
  },
  getRoleAuthority(roleId) {
    return request({
      url: '/authApi/getRoleAuthority',
      method: 'post',
      params: {
        roleId,
      },
    });
  },
  setRoleAuthority(data) {
    return request({
      url: '/authApi/setRoleAuthority',
      method: 'post',
      data,
    });
  },
};
