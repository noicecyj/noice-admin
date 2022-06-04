import {request} from 'ice';

export default {
  rolePage(pageNumber) {
    return request({
      url: '/authApi/rolePage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  rolePageByUserList(pageNumber, data) {
    return request({
      url: '/authApi/rolePageByUserList',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  rolePageByAuthorityList(pageNumber, data) {
    return request({
      url: '/authApi/rolePageByAuthorityList',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  roleSave(data) {
    return request({
      url: '/authApi/roleSave',
      method: 'post',
      data,
    });
  },
  roleDelete(data) {
    return request({
      url: '/authApi/roleDelete',
      method: 'post',
      data,
    });
  },
};
