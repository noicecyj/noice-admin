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
  roleSave(data) {
    return request({
      url: '/authApi/roleSave',
      method: 'post',
      data,
    });
  },
  roleDelete(id) {
    return request({
      url: '/authApi/roleDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findRoleById(id) {
    return request({
      url: '/authApi/findRoleById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
