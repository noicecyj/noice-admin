import sqlService from '@/pages/Sql/services/auto/sql';
import initService from '@/services/init';

export default {

  namespace: 'sql',

  state: {
    sqlTitle: '添加',
    sqlTableData: [],
    sqlVisible: false,
    sqlFormData: {},
    sqlLoadingVisible: true,
    sqlTotal: 0,
    sqlCurrent: 1,
    sqlForm: [],
    sqlTable: [],
    sqlId: '',
    customType: false,
  },

  reducers: {
    setState(prevState, payload) {
      return {...prevState, ...payload};
    },
  },

  effects: (dispatch) => ({
    async sqlPage(sqlCurrent) {
      const dataRes = await sqlService.sqlPage(sqlCurrent);
      const payload = {
        sqlTableData: dataRes.data.results,
        sqlTotal: dataRes.data.total,
        sqlCurrent,
        sqlLoadingVisible: false,
      };
      dispatch.sql.setState(payload);
    },
    async sqlEdit(data) {
      if (data) {
        const sql = await sqlService.findSqlById(data.id);
        const fromData = {
          ...sql.data,
        };
        const payload = {
          sqlFormData: fromData,
          sqlTitle: '编辑',
          sqlVisible: true,
        };
        dispatch.sql.setState(payload);
      } else {
        const payload = {
          sqlFormData: {},
          sqlTitle: '添加',
          sqlVisible: true,
        };
        dispatch.sql.setState(payload);
      }
    },
    async sqlDelete(data) {
      await sqlService.sqlDelete(data.record.id);
      await this.sqlPage(data.data.pageNumber);
      const payload = {
        sqlVisible: false,
      };
      dispatch.sql.setState(payload);
    },
    async sqlSave(data) {
      await sqlService.sqlSave(data.sqlFormData);
      await this.sqlPage(data.pageNumber);
      const payload = {
        sqlVisible: false,
      };
      dispatch.sql.setState(payload);
    },
    setDataForm(data) {
      const payload = {
        sqlFormData: data,
      };
      dispatch.sql.setState(payload);
    },
    async findDataTableAndFormByName() {
      const ret = await initService.findDataTableAndFormByName('sql');
      await this.sqlPage(1);
      const payload = {
        sqlTable: ret.data.dataTable,
        sqlForm: ret.data.dataForm,
        customType: ret.data.customType,
      };
      dispatch.sql.setState(payload);
    },
  }),
};
