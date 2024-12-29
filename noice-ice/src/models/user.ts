import {UserInfo} from '@/interfaces/user';
import {createModel} from 'ice';
import {TabsProps} from "antd";

interface ModelState {
  currentUser: UserInfo;
  tabs: TabsProps['items'];
}

export default createModel({
  state: {
    currentUser: {
      userName: '123',
    },
    tabs: [{
      key: 'index',
      label: '首页',
      closable: false,
    }],
  } as ModelState,
  reducers: {
    updateCurrentUser(prevState: ModelState, payload: UserInfo) {
      prevState.currentUser = payload;
    },
    updateTabs(prevState: ModelState, payload: TabsProps['items']) {
      prevState.tabs = payload;
    },
  },
});
