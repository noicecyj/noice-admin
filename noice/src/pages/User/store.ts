import {createStore} from 'ice';
import user from './models/auto/user';
import customUser from './models/custom/user';

const store = createStore({
  user,
  customUser,
});

export default store;
