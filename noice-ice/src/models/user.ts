/* eslint-disable @typescript-eslint/consistent-type-assertions */
import {UserInfo} from '@/interfaces/user';
import {createModel} from 'ice';

interface ModelState {
  currentUser: UserInfo;
  currentUserAuth: [];
}

export default createModel({
  state: {
    currentUser: {},
    currentUserAuth: [],
  } as ModelState,
  reducers: {
    updateCurrentUser(prevState: ModelState, payload) {
      prevState.currentUser = payload;
    },
    updateCurrentUserAuth(prevState: ModelState, payload) {
      prevState.currentUserAuth = payload;
    },
  },
});
