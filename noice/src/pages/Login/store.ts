import {createStore} from 'ice';
import login from './models/login';

const store = createStore({
  login,
});

export default store;
