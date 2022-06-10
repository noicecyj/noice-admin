import {request} from 'ice';

export default {
  page(pageNumber) {
    return request({
      url: '/authApi/pageUser',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  save(data) {
    return request({
      url: '/authApi/saveUser',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/authApi/deleteUser',
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
  roleByUser(userId) {
    return request({
      url: '/authApi/roleByUser',
      method: 'post',
      params: {
        userId,
      },
    });
  },
  roleSaveUser(userId, data) {
    return request({
      url: '/authApi/roleSaveUser',
      method: 'post',
      params: {
        userId,
      },
      data,
    });
  },
};
