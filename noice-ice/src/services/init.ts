import {request} from 'ice';
import {message} from "antd";

export default {
  http(data: {
    url: string,
    method?: string,
    obj?: any
    id?: string
  }) {
    console.log(data)
    if (data.url === 'noAuth') {
      message.error('接口权限不存在').then(r => {
        console.log(r)
      });
    }
    return request({
      url: data.url,
      method: !!data.method ? data.method : 'post',
      data: !!data.obj ? data.obj : data.id,
    });
  },
};
