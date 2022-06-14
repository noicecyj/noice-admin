import {createStore} from 'ice';
import authority from './models/auto/Authority';
import authorityCustom from './models/custom/Authority';
import entity from '@/pages/Entity/models/auto/Entity';

const store = createStore({
  authority,
  authorityCustom,
  entity,
});

export default store;
