import React from 'react';
import {Form, Range} from '@alifd/next';

const FormItem = Form.Item;

function RangeItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <Range
        id={item.propertyCode}
        name={item.propertyName}
        defaultValue={0}
        scales={[0, 100]}
        marks={[0, 100]}
      />
    </FormItem>
  );
}

export default RangeItem;
