/* eslint-disable no-unused-vars */
import React, { useEffect } from 'react';
import pageStore from '@/pages/EntityName/store';
import { Dialog, Form, Checkbox, Button } from '@alifd/next';
import styles from '@/pages/EntityName/index.module.scss';

const FormItem = Form.Item;
const { Group: CheckboxGroup } = Checkbox;

function CustomEntityName() {
  const [customEntityNameState, customEntityNameDispatchers] = pageStore.useModel('customEntityName');

  useEffect(() => {

  }, [customEntityNameDispatchers]);

  return (
    <div>
      <Button type="primary"> 生成代码 </Button>
      {/* <Dialog
        title="选择生成类"
        visible={customEntityNameState.chooseVisible}
        onOk={() => customEntityNameDispatchers.createEntityFile({
          ...customEntityNameState.chooseFormData,
          ...entityNameState.entityNameFormData,
          entityNameCurrent: entityNameState.entityNameCurrent,
        })}
        onCancel={() => customEntityNameDispatchers.setState({ chooseVisible: false })}
        onClose={() => customEntityNameDispatchers.setState({ chooseVisible: false })}
        style={{ width: '30%' }}
      >
        <Form
          style={{ width: '100%' }}
          {...formItemLayout}
          value={customEntityNameState.chooseFormData}
          onChange={(value) => customEntityNameDispatchers.setState({ chooseFormData: value })}
        >
          <FormItem label="选择生成：" requiredMessage="请选择生成类" >
            <CheckboxGroup
              dataSource={customEntityNameState.LEVEL_ENTITY_TYPE}
              direction="ver"
              id="choose"
              name="choose"
            />
          </FormItem>
        </Form>
      </Dialog>
      <Dialog
        title="选择生成类"
        visible={customEntityNameState.chooseFountVisible}
        onOk={() => customEntityNameDispatchers.createComponentFile({
          ...customEntityNameState.chooseFountFormData,
          ...entityNameState.entityNameFormData,
          entityNameCurrent: entityNameState.entityNameCurrent,
        })}
        onCancel={() => customEntityNameDispatchers.setState({ chooseFountVisible: false })}
        onClose={() => customEntityNameDispatchers.setState({ chooseFountVisible: false })}
        style={{ width: '30%' }}
      >
        <Form
          style={{ width: '100%' }}
          {...formItemLayout}
          value={customEntityNameState.chooseFountFormData}
          onChange={(value) => customEntityNameDispatchers.setState({ chooseFountFormData: value })}
        >
          <FormItem label="选择生成：" requiredMessage="请选择生成类" >
            <CheckboxGroup
              dataSource={customEntityNameState.LEVEL_ENTITY_TYPE_FOUNT}
              direction="ver"
              id="choose"
              name="choose"
            />
          </FormItem>
        </Form>
      </Dialog> */}
    </div>
  );
}

export default CustomEntityName;

