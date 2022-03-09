import {request} from 'ice';

export default {
  authorityPage(pageNumber) {
    return request({
      url: '/authApi/authorityPage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  authoritySave(data) {
    return request({
      url: '/authApi/authoritySave',
      method: 'post',
      data,
    });
  },
  authorityDelete(id) {
    return request({
      url: '/authApi/authorityDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findAuthorityById(id) {
    return request({
      url: '/authApi/findAuthorityById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
