import React from 'react';
import {Form, Select} from '@alifd/next';

const FormItem = Form.Item;

function SelectItem(props) {
  const {item} = props;

  return (
    <FormItem
      label={`${item.propertyLabel}`}
      required={item.propertyRequired === '是'}
      requiredMessage={`请输入${item.propertyLabel}`}
      key={item.id}>
      <Select
        id={item.propertyCode}
        name={item.propertyName}
        filterLocal={false}
        dataSource={item.propertyDataSource}
        style={{width: 414}} mode={item.mode}
        defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
      />
    </FormItem>
  );
}

export default SelectItem;
