import {createStore} from 'ice';
import user from '@/models/user';
import entity from '@/models/entity';

export default createStore({
  user,
  entity
});
