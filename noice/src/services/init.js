import {request} from 'ice';

export default {
  findDataTableAndFormByName(persistentCode) {
    return request({
      url: '/entityCreateApi/findDataTableAndFormByName',
      method: 'post',
      params: {
        persistentCode,
      },
    });
  },
  runCustomMethod(data, url) {
    return request({
      url,
      method: 'post',
      data,
    });
  },
};
