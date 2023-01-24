import {createStore} from 'ice';
import persistent from './models/Persistent';

const store = createStore({
  persistent,
});

export default store;
