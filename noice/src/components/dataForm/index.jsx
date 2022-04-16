import React from 'react';
import {
  Checkbox,
  DatePicker,
  Dialog,
  Form,
  Input,
  NumberPicker,
  Radio,
  Range,
  Select,
  Switch,
  TimePicker
} from '@alifd/next';

const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};

const dataSource = [
  {value: '有效', label: '有效'},
  {value: '无效', label: '无效'},
];

const FormItem = Form.Item;
const {RangePicker} = DatePicker;
const {Group: RadioGroup} = Radio;
const {Group: CheckboxGroup} = Checkbox;

function DataForm(props) {
  const {
    items,
    dispatchers,
    onOk,
    formDataValue,
    title,
    visibleDialog,
    onClose,
    formType,
  } = props;

  const formCol = formType === 'FOUR_LIST' ? 3 : formType === 'THREE_LIST' ? 4 : formType === 'TWO_LIST' ? 6 : 12;

  return (
    <Dialog
      v2
      title={title}
      visible={visibleDialog}
      onOk={onOk}
      onClose={onClose}
      style={{width: '50%'}}>
      <Form
        responsive={true}
        {...formItemLayout}
        fullWidth
        value={formDataValue}
        onChange={(value) => dispatchers(value)}>
        {items.map((item) => {
          if (item.propertyCode !== "pid"){
            if (item.propertyMode === 'Input') {
              return (
                <FormItem
                  colSpan={formCol}
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
              )
            } else if (item.propertyMode === 'Password') {
              return (
                <FormItem
                  colSpan={formCol}
                  label={`${item.propertyLabel}`}
                  required={item.propertyRequired === '是'}
                  requiredMessage={`请输入${item.propertyLabel}`}
                  key={item.id}>
                  <Input.Password
                    id={item.propertyCode}
                    name={item.propertyName}
                    placeholder={`请输入${item.propertyLabel}`}
                  />
                </FormItem>)
            } else if (item.propertyMode === 'TextArea') {
              return (
                <FormItem
                  colSpan={formCol}
                  label={`${item.propertyLabel}`}
                  required={item.propertyRequired === '是'}
                  requiredMessage={`请输入${item.propertyLabel}`}
                  key={item.id}>
                  <Input.TextArea
                    id={item.propertyCode}
                    name={item.propertyName}
                    placeholder={`请输入${item.propertyLabel}`}
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>)
            } else if (item.propertyMode === 'Select') {
              return (
                <FormItem
                  colSpan={formCol}
                  label={`${item.propertyLabel}`}
                  required={item.propertyRequired === '是'}
                  requiredMessage={`请输入${item.propertyLabel}`}
                  key={item.id}>
                  <Select
                    id={item.propertyCode}
                    name={item.propertyName}
                    filterLocal={false}
                    dataSource={item.propertyDataSource}
                    mode={item.mode}
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>)
            } else if (item.propertyMode === 'NumberPicker') {
              return (
                <FormItem
                  colSpan={formCol}
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
                </FormItem>)
            } else if (item.propertyMode === 'Switch') {
              return (
                <FormItem
                  colSpan={formCol}
                  label={`${item.propertyLabel}`}
                  required={item.propertyRequired === '是'}
                  requiredMessage={`请输入${item.propertyLabel}`}
                  key={item.id}>
                  <Switch
                    id={item.propertyCode}
                    name={item.propertyName}
                    defaultChecked
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>)
            } else if (item.propertyMode === 'Range') {
              return (
                <FormItem
                  colSpan={formCol}
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
                </FormItem>)
            } else if (item.propertyMode === 'DatePicker') {
              return (
                <FormItem
                  colSpan={formCol}
                  label={`${item.propertyLabel}`}
                  required={item.propertyRequired === '是'}
                  requiredMessage={`请输入${item.propertyLabel}`}
                  key={item.id}>
                  <DatePicker
                    id={item.propertyCode}
                    name={item.propertyName}
                  />
                </FormItem>)
            } else if (item.propertyMode === 'RangePicker') {
              return (
                <FormItem
                  colSpan={formCol}
                  label={`${item.propertyLabel}`}
                  required={item.propertyRequired === '是'}
                  requiredMessage={`请输入${item.propertyLabel}`}
                  key={item.id}>
                  <RangePicker
                    id={item.propertyCode}
                    name={item.propertyName}
                  />
                </FormItem>)
            } else if (item.propertyMode === 'TimePicker') {
              return (
                <FormItem
                  colSpan={formCol}
                  label={`${item.propertyLabel}`}
                  required={item.propertyRequired === '是'}
                  requiredMessage={`请输入${item.propertyLabel}`}
                  key={item.id}>
                  <TimePicker
                    id={item.propertyCode}
                    name={item.propertyName}
                  />
                </FormItem>)
            } else if (item.propertyMode === 'Checkbox') {
              return (
                <FormItem
                  colSpan={formCol}
                  label={`${item.propertyLabel}`}
                  required={item.propertyRequired === '是'}
                  requiredMessage={`请输入${item.propertyLabel}`}
                  key={item.id}>
                  <CheckboxGroup
                    id={item.propertyCode}
                    name={item.propertyName}
                    dataSource={item.propertyDataSource}
                    direction={item.propertyDirection}
                  />
                </FormItem>)
            } else if (item.propertyMode === 'Radio') {
              return (
                <FormItem
                  colSpan={formCol}
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
                </FormItem>)
            } else {
              return (
                <FormItem
                  colSpan={formCol}
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
                </FormItem>)
            }
          }
        })}
        <FormItem
          colSpan={formCol}
          label="状态"
          required
          requiredMessage="请输入状态">
          <Select
            id="status"
            name="status"
            filterLocal={false}
            dataSource={dataSource}
            defaultValue="有效"
          />
        </FormItem>
        <FormItem
          colSpan={formCol}
          label="排序代码"
          required
          requiredMessage="请输入排序代码">
          <Input
            id="sortCode"
            name="sortCode"
            placeholder="请输入排序代码"
            defaultValue="0010"
          />
        </FormItem>
      </Form>
    </Dialog>
  );
}

export default DataForm;
