import React from 'react';
import {Checkbox, Form} from '@alifd/next';

const FormItem = Form.Item;
const {Group: CheckboxGroup} = Checkbox;

function CheckboxGroupItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <CheckboxGroup
        id={item.propertyCode}
        name={item.propertyName}
        dataSource={item.propertyDataSource}
        direction={item.propertyDirection}
      />
    </FormItem>
  );
}

export default CheckboxGroupItem;
