import { createStore } from 'ice';
import sql from './models/auto/sql';
import customSql from './models/custom/sql';

const store = createStore({
  sql,
  customSql,
});

export default store;
