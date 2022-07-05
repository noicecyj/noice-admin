import {createStore} from 'ice';
import questionBase from './models/auto/QuestionBase';
import questionBaseCustom from './models/custom/QuestionBase';
import subject from '@/pages/Subject/models/auto/Subject';
import question from '@/pages/Question/models/auto/Question';

const store = createStore({
  questionBase,
  questionBaseCustom,
  subject,
  question,
});

export default store;
