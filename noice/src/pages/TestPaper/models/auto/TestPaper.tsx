import initService from '@/services/init';
import {Message} from "@alifd/next";
import service from '@/pages/TestPaper/services/auto/TestPaper';
import testPaperConfigService from '@/pages/TestPaperConfig/services/auto/TestPaperConfig'
import testPaperInstanceService from '@/pages/TestPaperInstance/services/auto/TestPaperInstance'

export default {

  namespace: 'testPaper',

  state: {
    title: '添加',
    tableData: [],
    visible: false,
    formData: {},
    loadingVisible: true,
    total: 0,
    current: 1,
    form: [],
    table: [],
    customData: {},
    divVisible: false,
    parent: "",
    select: [],
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async page(current) {
      const dataRes = await service.page(current);
      const payload = {
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current,
        loadingVisible: false,
      };
      dispatch.testPaper.setState(payload);
    },
    async save(data) {
      const ret = await service.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.page(data.current);
        const payload = {
          visible: false,
        };
        dispatch.testPaper.setState(payload);
      }
    },
    async delete(data) {
      const ret = await service.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.page(data.current);
        const payload = {
          visible: false,
        };
        dispatch.testPaper.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.testPaper.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.testPaper.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.testPaper.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('test_paper');
      await this.page(1);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.testPaper.setState(payload);
    },
    async pageTestPaperConfigByTestPaper(data) {
      const ret = await initService.findDataTableAndFormByName('test_paper_config');
      const dataRes = await service.pageTestPaperConfigByTestPaper(data.current, data.id);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current: data.current,
        loadingVisible: false,
        divVisible: true,
        parent: data.id,
        visible: false,
      };
      dispatch.testPaperConfig.setState(payload);
    },
    async saveTestPaperConfigByTestPaper(data) {
      const ret = await testPaperConfigService.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.pageTestPaperConfigByTestPaper({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.testPaperConfig.setState(payload);
      }
    },
    async deleteTestPaperConfigByTestPaper(data) {
      const ret = await testPaperConfigService.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.pageTestPaperConfigByTestPaper({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.testPaperConfig.setState(payload);
      }
    },
    async pageTestPaperInstanceByTestPaper(data) {
      const ret = await initService.findDataTableAndFormByName('test_paper_instance');
      const dataRes = await service.pageTestPaperInstanceByTestPaper(data.current, data.id);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
        tableData: dataRes.data.content,
        total: dataRes.data.totalElements,
        current: data.current,
        loadingVisible: false,
        divVisible: true,
        parent: data.id,
        visible: false,
      };
      dispatch.testPaperInstance.setState(payload);
    },
    async saveTestPaperInstanceByTestPaper(data) {
      const ret = await testPaperInstanceService.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.pageTestPaperInstanceByTestPaper({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.testPaperInstance.setState(payload);
      }
    },
    async deleteTestPaperInstanceByTestPaper(data) {
      const ret = await testPaperInstanceService.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.pageTestPaperInstanceByTestPaper({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.testPaperInstance.setState(payload);
      }
    },
  }),
};
