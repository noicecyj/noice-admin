import {createStore} from 'ice';
import persistent from './models/auto/Persistent';
import persistentCustom from './models/custom/Persistent';
import authority from '@/pages/Authority/models/auto/Authority';
import property from '@/pages/Property/models/auto/Property';
import appService from '@/pages/AppService/models/auto/AppService';

const store = createStore({
  persistent,
  persistentCustom,
  authority,
  property,
  appService,
});

export default store;
