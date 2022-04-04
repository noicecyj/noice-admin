import React from 'react';
import {Form, TimePicker} from '@alifd/next';

const FormItem = Form.Item;

function TimePickerItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <TimePicker
        id={item.propertyCode}
        name={item.propertyName}
      />
    </FormItem>
  );
}

export default TimePickerItem;
