import {createStore} from 'ice';
import loanApproval from './models/auto/LoanApproval';
import loanApprovalCustom from './models/custom/LoanApproval';

const store = createStore({
  loanApproval,
  loanApprovalCustom,
});

export default store;
