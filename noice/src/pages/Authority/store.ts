import {createStore} from 'ice';
import authority from './models/auto/Authority';
import authorityCustom from './models/custom/Authority';
import persistent from '@/pages/Persistent/models/Persistent';

const store = createStore({
  authority,
  authorityCustom,
  persistent,
});

export default store;
