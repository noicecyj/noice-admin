import React from 'react';
import {Dialog} from "@alifd/next";
import Role from '@/pages/Role/view/auto/role';
import Authority from "@/pages/Authority";
import pageStore from "@/pages/Authority/store";

function RolePage() {

  const [state, dispatchers] = pageStore.useModel('authority');

  return (
    <div>
      <Role/>
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
        <Authority/>
      </Dialog>
    </div>
  );
}

export default RolePage;
