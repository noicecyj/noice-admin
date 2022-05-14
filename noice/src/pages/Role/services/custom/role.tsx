import {request} from 'ice';

export default {
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
