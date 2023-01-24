import {request} from 'ice';

export default {
  page(po, pageNumber, pageSize) {
    return request({
      url: '/authApi/pageRoleAuthority',
      method: 'post',
      data: {
        po,
        pageNumber,
        pageSize,
      },
    });
  },
  save(data) {
    return request({
      url: '/authApi/saveRoleAuthority',
      method: 'post',
      data,
    });
  },
  delete(data) {
    return request({
      url: '/authApi/deleteRoleAuthority',
      method: 'post',
      data,
    });
  },
};
