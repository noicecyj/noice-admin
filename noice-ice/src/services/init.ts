import {request} from 'ice';

export default {
  http(data: {
    url: string,
    method?: string,
    obj?: any
    id?: string
  }) {
    console.log(data)
    return request({
      url: data.url,
      method: !!data.method ? data.method : 'post',
      data: !!data.obj ? data.obj : data.id,
    });
  },
};
