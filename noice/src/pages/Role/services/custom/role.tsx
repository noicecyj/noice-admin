import { request } from 'ice';
export default {
  getRoleAuthority(userId) {
    return request({
      url: '/authApi/getRoleAuthority',
      method: 'post',
      params: {
        userId,
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
