import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/userApi/pageRoleAuthority',
      method: 'post',
      data: {
        po,
        pageNumber,
        pageSize,
      },
    });
  },
  save(po, user) {
    return request({
      url: '/userApi/saveRoleAuthority',
      method: 'post',
      data: {
        po,
        user,
      },
    });
  },
  delete(data) {
    return request({
      url: '/userApi/deleteRoleAuthority',
      method: 'post',
      data,
    });
  },
};
