import {createStore} from 'ice';
import sql from './models/auto/Sql';
import sqlCustom from './models/custom/Sql';

const store = createStore({
  sql,
  sqlCustom,
});

export default store;
