import { createStore } from 'ice';
import login from './models/login';
import user from '../../models/user';

const store = createStore({
  login,
  user,
});

export default store;
