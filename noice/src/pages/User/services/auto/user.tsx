import {request} from 'ice';

export default {
  userPage(pageNumber) {
    return request({
      url: '/authApi/userPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  userPageByEnterprise(pageNumber, data) {
    return request({
      url: '/authApi/userPageByEnterprise',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  userPageByRoleList(pageNumber, data) {
    return request({
      url: '/authApi/userPageByRoleList',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  userPageByAuthorityList(pageNumber, data) {
    return request({
      url: '/authApi/userPageByAuthorityList',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  userSave(data) {
    return request({
      url: '/authApi/userSave',
      method: 'post',
      data,
    });
  },
  userDelete(data) {
    return request({
      url: '/authApi/userDelete',
      method: 'post',
      data,
    });
  },
};
