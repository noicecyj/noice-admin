import React from 'react';
import {DatePicker, Form} from '@alifd/next';

const FormItem = Form.Item;

function DatePickerItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <DatePicker
        id={item.propertyCode}
        name={item.propertyName}
      />
    </FormItem>
  );
}

export default DatePickerItem;
