import {UserInfo} from '@/interfaces/user';
import {createModel} from 'ice';
import {useSessionStorageState} from "ahooks";

interface ModelState {
  currentUser: UserInfo;
  currentUserAuth: [];
}

export default createModel({
  state: {
    currentUser: {
      userName: '123',
    },
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
  effects: (dispatch: any) => ({
    init() {
      const [userInfoLocal] = useSessionStorageState<UserInfo>('userInfo');
      const [userMenuLocal] = useSessionStorageState('userMenu');

      if (userInfoLocal) {
        this.updateCurrentUser(userInfoLocal);
      }

      if (userMenuLocal) {
        this.updateCurrentUserAuth(userMenuLocal);
      }
    },
  }),
});
