import {createStore} from 'ice';
import PersistentTable from './models/PersistentTable';

const store = createStore({
  PersistentTable,
});

export default store;
