import {createStore} from 'ice';
import authority from './models/auto/Authority';
import authorityCustom from './models/custom/Authority';
import appService from "@/pages/AppService/models/auto/appService";
import entity from "@/pages/Entity/models/auto/entity";
import user from "@/pages/User/models/auto/User";
import role from "@/pages/Role/models/auto/Role";

const store = createStore({
  authority,
  authorityCustom,
  appService,
  entity,
  user,
  role,
});

export default store;
