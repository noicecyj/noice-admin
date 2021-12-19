import { createStore } from 'ice';
import appService from './models/auto/appService';

const store = createStore({
  appService,
});

export default store;
