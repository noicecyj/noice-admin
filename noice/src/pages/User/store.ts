import {createStore} from 'ice';
import user from './models/auto/User';
import userCustom from './models/custom/User';
import enterprise from '@/pages/Enterprise/models/auto/Enterprise';
import role from '@/pages/Role/models/auto/Role';

const store = createStore({
  user,
  userCustom,
  enterprise,
  role,
});

export default store;
