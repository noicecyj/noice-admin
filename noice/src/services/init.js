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
};
