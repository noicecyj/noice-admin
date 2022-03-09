import {createStore} from 'ice';
import role from './models/auto/role';
import customRole from './models/custom/role';

const store = createStore({
  role,
  customRole,
});

export default store;
