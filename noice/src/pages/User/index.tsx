import React from 'react';
import {Dialog} from "@alifd/next";
import User from '@/pages/User/view/auto/user';
import Role from "@/pages/Role";
import pageStore from "@/pages/Role/store";

function UserPage() {

  const [state, dispatchers] = pageStore.useModel('role');

  return (
    <div>
      <User/>
      <Dialog
        v2
        visible={state.divVisible}
        footer={false}
        onClose={() => dispatchers.setState({
          divVisible: false,
          parent: {},
        })}
        style={{width: '100%'}}
      >
        <Role/>
      </Dialog>
    </div>
  );
}

export default UserPage;
