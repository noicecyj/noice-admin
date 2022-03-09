import {createStore} from 'ice';
import appService from './models/auto/appService';
import customAppService from './models/custom/appService';

const store = createStore({
  appService,
  customAppService,
});

export default store;
