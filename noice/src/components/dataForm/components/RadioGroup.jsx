import React from 'react';
import {Form, Radio} from '@alifd/next';

const FormItem = Form.Item;
const {Group: RadioGroup} = Radio;

function RadioGroupItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <RadioGroup
        id={item.propertyCode}
        name={item.propertyName}
        dataSource={item.propertyDataSource}
        direction={item.propertyDirection}
      />
    </FormItem>
  );
}

export default RadioGroupItem;
