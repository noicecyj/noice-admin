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
  userSave(data) {
    return request({
      url: '/authApi/userSave',
      method: 'post',
      data,
    });
  },
  userDelete(id) {
    return request({
      url: '/authApi/userDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findUserById(id) {
    return request({
      url: '/authApi/findUserById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
