import {createStore} from 'ice';
import Persistent from './models/Persistent';

const store = createStore({
  Persistent,
});

export default store;
