import { request } from 'ice';

export default {
  appServicePage(pageNumber) {
    return request({
      url: '/entityCreateApi/appServicePage',
      method: 'post',
      params: {
        pageNumber,
      },
    });
  },
  appServiceSave(data) {
    return request({
      url: '/entityCreateApi/appServiceSave',
      method: 'post',
      data,
    });
  },
  appServiceDelete(id) {
    return request({
      url: '/entityCreateApi/appServiceDelete',
      method: 'post',
      params: {
        id,
      },
    });
  },
  findAppServiceById(id) {
    return request({
      url: '/entityCreateApi/findAppServiceById',
      method: 'post',
      params: {
        id,
      },
    });
  },
};
