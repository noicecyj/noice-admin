import React from 'react';
import {Form, NumberPicker} from '@alifd/next';

const FormItem = Form.Item;

function NumberPickerItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <NumberPicker
        id={item.propertyCode}
        name={item.propertyName}
        min={1}
        max={10}
        defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
      />
    </FormItem>
  );
}

export default NumberPickerItem;
