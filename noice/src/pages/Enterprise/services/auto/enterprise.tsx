import {request} from 'ice';

export default {
  enterprisePage(pageNumber) {
    return request({
      url: '/authApi/enterprisePage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  enterpriseSave(data) {
    return request({
      url: '/authApi/enterpriseSave',
      method: 'post',
      data,
    });
  },
  enterpriseDelete(data) {
    return request({
      url: '/authApi/enterpriseDelete',
      method: 'post',
      data,
    });
  },
};
