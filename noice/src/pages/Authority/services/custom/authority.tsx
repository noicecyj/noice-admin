import {request} from 'ice';

export default {
  createAuthority() {
    return request({
      url: '/authApi/createAuthority',
      method: 'post',
    });
  },
};
