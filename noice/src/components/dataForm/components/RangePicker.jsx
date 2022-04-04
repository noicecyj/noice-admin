import React from 'react';
import {DatePicker, Form} from '@alifd/next';

const FormItem = Form.Item;
const {RangePicker} = DatePicker;

function RangePickerItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <RangePicker
        id={item.propertyCode}
        name={item.propertyName}/>
    </FormItem>
  );
}

export default RangePickerItem;
