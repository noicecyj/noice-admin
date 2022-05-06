import {createStore} from 'ice';
import enterprise from './models/auto/enterprise';
import customEnterprise from './models/custom/enterprise';

const store = createStore({
  enterprise,
  customEnterprise,
});

export default store;
