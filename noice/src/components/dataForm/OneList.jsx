import React from 'react';
import {Form, Input, Select} from '@alifd/next';
import InputItem from '@/components/dataForm/components/Input'
import PasswordItem from "@/components/dataForm/components/Password";
import TextAreaItem from "@/components/dataForm/components/TextArea";
import SelectItem from "@/components/dataForm/components/Select";
import NumberPickerItem from "@/components/dataForm/components/NumberPicker";
import SwitchItem from "@/components/dataForm/components/Switch";
import RangeItem from "@/components/dataForm/components/Range";
import DatePickerItem from "@/components/dataForm/components/DatePicker";
import RangePickerItem from "@/components/dataForm/components/RangePicker";
import TimePickerItem from "@/components/dataForm/components/TimePicker";
import CheckboxGroupItem from "@/components/dataForm/components/CheckboxGroup";
import RadioGroupItem from "@/components/dataForm/components/RadioGroup";

const FormItem = Form.Item;

const dataSource = [
  {value: '有效', label: '有效'},
  {value: '无效', label: '无效'},
];

function OneList(props) {
  const {items, onOk, customType} = props;

  return (
    <>
      {items.map((item) => {
        if (item.propertyMode === 'Input') {
          return (<InputItem item={item}/>)
        } else if (item.propertyMode === 'Password') {
          return (<PasswordItem item={item}/>)
        } else if (item.propertyMode === 'TextArea') {
          return (<TextAreaItem item={item}/>)
        } else if (item.propertyMode === 'Select') {
          return (<SelectItem item={item}/>)
        } else if (item.propertyMode === 'NumberPicker') {
          return (<NumberPickerItem item={item}/>)
        } else if (item.propertyMode === 'Switch') {
          return (<SwitchItem item={item}/>)
        } else if (item.propertyMode === 'Range') {
          return (<RangeItem item={item}/>)
        } else if (item.propertyMode === 'DatePicker') {
          return (<DatePickerItem item={item}/>)
        } else if (item.propertyMode === 'RangePicker') {
          return (<RangePickerItem item={item}/>)
        } else if (item.propertyMode === 'TimePicker') {
          return (<TimePickerItem item={item}/>)
        } else if (item.propertyMode === 'Checkbox') {
          return (<CheckboxGroupItem item={item}/>)
        } else if (item.propertyMode === 'Radio') {
          return (<RadioGroupItem item={item}/>)
        } else {
          return (<InputItem item={item}/>)
        }
      })}
      {
        customType && <FormItem label="状态" required requiredMessage="请输入状态">
          <Select
            id="status"
            name="status"
            filterLocal={false}
            style={{width: 414}}
            dataSource={dataSource}
            defaultValue="有效"
          />
        </FormItem>
      }
      {
        customType && <FormItem label="排序代码" required requiredMessage="请输入排序代码">
          <Input id="sortCode" name="sortCode" placeholder="请输入排序代码" defaultValue="0010"/>
        </FormItem>
      }
      <FormItem>
        <Form.Submit
          validate
          type="primary"
          htmlType="submit"
          onClick={(v, e) => {
            if (e == null) {
              onOk();
            }
          }}
          style={{marginRight: 10}}
        >确定
        </Form.Submit>
        <Form.Reset>重置</Form.Reset>
      </FormItem>
    </>
  );
}

export default OneList;
