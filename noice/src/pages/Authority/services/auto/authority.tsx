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
  authorityPageByAppService(pageNumber, data) {
    return request({
      url: '/authApi/authorityPageByAppService',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  authorityPageByEntity(pageNumber, data) {
    return request({
      url: '/authApi/authorityPageByEntity',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  authorityPageByUserList(pageNumber, data) {
    return request({
      url: '/authApi/authorityPageByUserList',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  authorityPageByRoleList(pageNumber, data) {
    return request({
      url: '/authApi/authorityPageByRoleList',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  authoritySave(data) {
    return request({
      url: '/authApi/authoritySave',
      method: 'post',
      data,
    });
  },
  authorityDelete(data) {
    return request({
      url: '/authApi/authorityDelete',
      method: 'post',
      data,
    });
  },
};
