import React, { useEffect } from 'react';
import pageStore from '@/pages/EntityName/store';
import { Button, Dialog, Form, Switch } from '@alifd/next';

const FormItem = Form.Item;
const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

function CustomEntityName(props) {
  // eslint-disable-next-line no-unused-vars
  const { value, index, record } = props;
  const [customEntityNameState, customEntityNameDispatchers] = pageStore.useModel('customEntityName');
  const [entityNameState, entityNameDispatchers] = pageStore.useModel('entityName');

  useEffect(() => {
  }, [customEntityNameDispatchers]);

  return (
    <>
      <Button type="normal" size="small" onClick={() => customEntityNameDispatchers.setState({ chooseVisible: true })}> 生成代码 </Button>
      <Dialog
        title="选择生成实体"
        visible={customEntityNameState.chooseVisible}
        onOk={() => customEntityNameDispatchers.createEntityFile({ id: entityNameState.entityNameId, ...customEntityNameState.chooseFormData })}
        onCancel={() => customEntityNameDispatchers.setState({ chooseVisible: false })}
        onClose={() => customEntityNameDispatchers.setState({ chooseVisible: false })}
        style={{ width: '30%' }}
      >
        <Form
          style={{ width: '100%' }}
          {...formItemLayout}
          value={customEntityNameState.chooseFormData}
          onChange={(data) => customEntityNameDispatchers.setState({ chooseFormData: data })}
        >
          <FormItem label="选择生成:" requiredMessage="请选择生成类">
            <Switch autoWidth />
          </FormItem>
        </Form>
      </Dialog>
    </>
  );
}

export default CustomEntityName;

