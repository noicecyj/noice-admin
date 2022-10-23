import initService from '@/services/init';
import {Message} from "@alifd/next";
import service from '@/pages/TestInstance/services/auto/TestInstance';
import questionInstanceAnswerService from '@/pages/QuestionInstanceAnswer/services/auto/QuestionInstanceAnswer'

export default {

  namespace: 'testInstance',

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
      dispatch.testInstance.setState(payload);
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
        dispatch.testInstance.setState(payload);
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
        dispatch.testInstance.setState(payload);
      }
    },
    add() {
      const payload = {
        formData: {},
        title: '添加',
        visible: true,
      };
      dispatch.testInstance.setState(payload);
    },
    edit(data) {
      const payload = {
        formData: data,
        title: '编辑',
        visible: true,
      };
      dispatch.testInstance.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        formData: data,
      };
      dispatch.testInstance.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('test_instance');
      await this.page(1);
      const payload = {
        table: ret.data.dataTable,
        form: ret.data.dataForm,
        customData: ret.data.customData,
      };
      dispatch.testInstance.setState(payload);
    },
    async pageQuestionInstanceAnswerByTestInstance(data) {
      const ret = await initService.findDataTableAndFormByName('question_instance_answer');
      const dataRes = await service.pageQuestionInstanceAnswerByTestInstance(data.current, data.id);
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
      dispatch.questionInstanceAnswer.setState(payload);
    },
    async saveQuestionInstanceAnswerByTestInstance(data) {
      const ret = await questionInstanceAnswerService.save(data.formData);
      if (ret.code === 400) {
        Message.error(ret.data.defaultMessage);
      } else {
        Message.success('保存成功');
        await this.pageQuestionInstanceAnswerByTestInstance({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.questionInstanceAnswer.setState(payload);
      }
    },
    async deleteQuestionInstanceAnswerByTestInstance(data) {
      const ret = await questionInstanceAnswerService.delete(data.record);
      if (ret.code === 400) {
        Message.error('删除失败');
      } else {
        Message.success('删除成功');
        await this.pageQuestionInstanceAnswerByTestInstance({
          current: data.current,
          id: data.id,
        });
        const payload = {
          visible: false,
        };
        dispatch.questionInstanceAnswer.setState(payload);
      }
    },
  }),
};
