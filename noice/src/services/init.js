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
  runCustomMethod(data) {
    console.log(data)
    return request({
      url: data.url,
      method: 'post',
      data: data.obj,
    });
  },
};
