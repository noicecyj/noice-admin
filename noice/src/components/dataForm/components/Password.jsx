import React from 'react';
import {Form, Input} from '@alifd/next';

const FormItem = Form.Item;

function PasswordItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <Input.Password
        id={item.propertyCode}
        name={item.propertyName}
        placeholder={`请输入${item.propertyLabel}`}
      />
    </FormItem>
  );
}

export default PasswordItem;
