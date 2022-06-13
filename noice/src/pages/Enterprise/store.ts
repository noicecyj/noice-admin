import {createStore} from 'ice';
import enterprise from './models/auto/Enterprise';
import enterpriseCustom from './models/custom/Enterprise';
import user from '@/pages/User/models/auto/User';

const store = createStore({
  enterprise,
  enterpriseCustom,
  user,
});

export default store;
