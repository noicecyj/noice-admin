import {createStore} from 'ice';
import AppService from './models/AppService';

const store = createStore({
  AppService,
});

export default store;
