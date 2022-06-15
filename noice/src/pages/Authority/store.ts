import {createStore} from 'ice';
import authority from './models/auto/Authority';
import authorityCustom from './models/custom/Authority';
import persistent from '@/pages/Persistent/models/auto/Persistent';
import appService from '@/pages/AppService/models/auto/AppService';

const store = createStore({
  authority,
  authorityCustom,
  persistent,
  appService,
});

export default store;
