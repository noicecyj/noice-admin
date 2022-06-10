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
