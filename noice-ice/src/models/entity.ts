import {createModel} from 'ice';
import initService from "@/services/init";
import {message} from "antd";

interface Entity {
  formData: {
    id: string,
  },
  title: string,
  visible: boolean,
  readonly: boolean,
  status: string,
}

interface pageResult {
  data: [],
  success: boolean,
  total: number
}

export default createModel({
  // 定义  model 的初始 state
  state: {
    formData: {},
    title: '添加',
    visible: false,
    readonly: false,
    status: '',
  } as Entity,
  // 定义改变该 model 状态的纯函数
  reducers: {
    update(state, payload) {
      return {
        ...state,
        ...payload,
      };
    },
  },
  effects: () => ({
    async page(data: {
      pageUrl: string;
      params: object;
    }) {
      const dataRes = await initService.http({
        url: data.pageUrl,
        obj: data.params,
      });
      return this.setPageData(dataRes);
    },
    setPageData(dataRes: any) {
      return {
        data: dataRes.data.records,
        success: dataRes.code == 200,
        total: dataRes.data.total,
      } as pageResult;
    },
    save(data: {
      saveUrl: string;
      formData: any;
    }) {
      initService.http({
        url: data.saveUrl,
        obj: data.formData
      }).then(res => {
        if (res.code == 200) {
          this.update({
            visible: false,
            status: 'page',
          })
          message.success('添加成功').then(r => {
            console.log(r)
          });
        } else {
          message.error('添加失败').then(r => {
            console.log(r)
          });
        }
      });
    },
    async remove(data: {
      id: string;
      deleteUrl: string;
    }) {
      const dataRes = await initService.http({
        url: data.deleteUrl + "?id=" + data.id,
      });
      return dataRes.code == 200;
    },
    add() {
      this.update({
        formData: {},
        title: '添加',
        visible: true,
        status: 'add',
      });
    },
    async edit(data: {
      id: string;
      getUrl: string;
      readonly: boolean;
    }) {
      const dataRes = await initService.http({
        url: data.getUrl + "?id=" + data.id,
      });
      this.update({
        formData: dataRes.data,
        title: '编辑',
        visible: true,
        readonly: data.readonly,
        status: 'edit',
      });
    },
  }),
})