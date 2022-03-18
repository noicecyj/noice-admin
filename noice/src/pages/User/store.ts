import {createStore} from 'ice';
import user from './models/auto/user';
import customUser from './models/custom/user';
import role from "@/pages/Role/models/auto/role";

const store = createStore({
  user,
  customUser,
  role,
});

export default store;
