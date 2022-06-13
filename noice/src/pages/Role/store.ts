import {createStore} from 'ice';
import role from './models/auto/Role';
import roleCustom from './models/custom/Role';
import authority from '@/pages/Authority/models/auto/Authority';

const store = createStore({
  role,
  roleCustom,
  authority,
});

export default store;
