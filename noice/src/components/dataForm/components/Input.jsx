import React from 'react';
import {Form, Input} from '@alifd/next';

const FormItem = Form.Item;

function InputItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <Input
        id={item.propertyCode}
        name={item.propertyName}
        placeholder={`请输入${item.propertyLabel}`}
        defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
      />
    </FormItem>
  );
}

export default InputItem;
