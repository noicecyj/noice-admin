import {createModel} from 'ice';
import initService from "@/services/init";

interface Entity {
  pageResult: {
    data: any
    success: boolean;
    total: number;
  },
  saveResult: {
    success: boolean;
  },
  removeResult: {
    success: boolean;
  }
}

export default createModel({
  // 定义  model 的初始 state
  state: {
    pageResult: {},
    saveResult: {},
    removeResult: {},
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
  effects: (dispatch) => ({
    async page(data: any) {
      console.log('page', data);
      const dataRes = await initService.http({
        url: data.pageUrl,
        // url: '/entityCreateApi/Persistent/page',
        obj: data.params,
      });
      return {
        data: dataRes.data.records,
        // success 请返回 true，
        // 不然 table 会停止解析数据，即使有数据
        success: dataRes.code == 200,
        total: dataRes.data.total,
      };
    },
    async save(data: {
      formData: any;
      saveUrl: any;
    }) {
      const dataRes = await initService.http({
        url: data.saveUrl,
        obj: {
          po: data.formData,
        }
      });
      this.update({
        saveResult: {
          success: dataRes.code == 200,
        }
      });
    },
    async remove(data: {
      record: string;
      deleteUrl: any;
    }) {
      const dataRes = await initService.http({
        url: data.deleteUrl + data.record,
        method: 'get'
      });
      this.update({
        removeResult: {
          success: dataRes.code == 200,
        }
      });
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.Entity.setState(payload);
    },
    edit(data: any) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.Entity.setState(payload);
    },
  }),
})