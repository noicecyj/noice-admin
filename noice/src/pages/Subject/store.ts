import {createStore} from 'ice';
import subject from './models/auto/Subject';
import subjectCustom from './models/custom/Subject';

const store = createStore({
  subject,
  subjectCustom,
});

export default store;
