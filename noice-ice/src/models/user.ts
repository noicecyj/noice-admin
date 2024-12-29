import {UserInfo} from '@/interfaces/user';
import {createModel} from 'ice';

interface ModelState {
  currentUser: UserInfo;
}

export default createModel({
  state: {
    currentUser: {
      userName: '123',
    },
  } as ModelState,
  reducers: {
    updateCurrentUser(prevState: ModelState, payload: UserInfo) {
      prevState.currentUser = payload;
    },
  },
});
