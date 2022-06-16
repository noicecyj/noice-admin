import {createStore} from 'ice';
import persistent from './models/auto/Persistent';
import persistentCustom from './models/custom/Persistent';
import appService from '@/pages/AppService/models/auto/AppService';
import authority from '@/pages/Authority/models/auto/Authority';
import property from '@/pages/Property/models/auto/Property';

const store = createStore({
  persistent,
  persistentCustom,
  appService,
  authority,
  property,
});

export default store;
