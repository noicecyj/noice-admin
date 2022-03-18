import {request} from 'ice';

export default {
  findDataTableAndFormByName(entityCode) {
    return request({
      url: '/entityCreateApi/findDataTableAndFormByName',
      method: 'post',
      params: {
        entityCode,
      },
    });
  },
};
