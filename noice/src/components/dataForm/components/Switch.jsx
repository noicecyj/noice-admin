import React from 'react';
import {Form, Switch} from '@alifd/next';

const FormItem = Form.Item;

function SwitchItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <Switch
        id={item.propertyCode}
        name={item.propertyName}
        defaultChecked
        defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
      />
    </FormItem>
  );
}

export default SwitchItem;
