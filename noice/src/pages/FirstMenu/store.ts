import {createStore} from 'ice';
import firstMenu from './models/auto/firstMenu';
import customFirstMenu from './models/custom/firstMenu';
import secondMenu from './models/auto/secondMenu';
import customSecondMenu from './models/custom/secondMenu';

const store = createStore({
  firstMenu,
  customFirstMenu,
  secondMenu,
  customSecondMenu,
});

export default store;
