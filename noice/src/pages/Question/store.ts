import {createStore} from 'ice';
import question from './models/auto/Question';
import questionCustom from './models/custom/Question';
import questionBase from '@/pages/QuestionBase/models/auto/QuestionBase';

const store = createStore({
  question,
  questionCustom,
  questionBase,
});

export default store;
