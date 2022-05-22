import {request} from 'ice';

export default {
  propertyPage(pageNumber, data) {
    return request({
      url: '/entityCreateApi/propertyPageByEntity',
      method: 'post',
      params: {
        pageNumber,
      },
      data,
    });
  },
  propertySave(data) {
    return request({
      url: '/entityCreateApi/propertySave',
      method: 'post',
      data,
    });
  },
  propertyDelete(data) {
    return request({
      url: '/entityCreateApi/propertyDelete',
      method: 'post',
      data,
    });
  },
};
