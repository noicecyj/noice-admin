import {createStore} from 'ice';
import User from './models/User';

const store = createStore({
  User,
});

export default store;
