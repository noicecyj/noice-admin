import {createStore} from 'ice';
import appService from './models/auto/AppService';
import appServiceCustom from './models/custom/AppService';
import authority from '@/pages/Authority/models/auto/Authority';
import persistent from '@/pages/Persistent/models/Persistent';

const store = createStore({
  appService,
  appServiceCustom,
  authority,
  persistent,
});

export default store;
