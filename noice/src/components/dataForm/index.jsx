import React from 'react';
import {
  Card,
  Checkbox,
  DatePicker2,
  Dialog,
  Form,
  Input,
  NumberPicker,
  Radio,
  Range,
  Select,
  Switch,
  TimePicker,
} from '@alifd/next';

const FormItem = Form.Item;
const {RangePicker} = DatePicker2;
const {Group: RadioGroup} = Radio;
const {Group: CheckboxGroup} = Checkbox;


function DataForm(props) {
  const {
    configItems,
    dispatchers,
    onOk,
    formDataValue,
    title,
    visibleDialog,
    onClose,
  } = props;

  return (
    <Dialog
      v2
      title={title}
      visible={visibleDialog}
      onOk={onOk}
      onClose={onClose}
      style={{width: '50%'}}>
      <Card free>
        <Card.Content>
          <Form
            responsive={true}
            fullWidth
            labelAlign="top"
            value={formDataValue}
            onChange={(value) => dispatchers(value)}>
            {configItems.map((config) => {
              console.log("item====>", config)
              if (config.formMode === 'Input') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    disabled={config.formEdit}
                    key={config.id}>
                    <Input
                      id={config.formCode}
                      name={config.formCode}
                      placeholder={`请输入${config.formName}`}
                    />
                  </FormItem>
                )
              } else if (config.formMode === 'Password') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <Input.Password
                      id={config.formCode}
                      name={config.formCode}
                      placeholder={`请输入${config.formName}`}
                    />
                  </FormItem>)
              } else if (config.formMode === 'TextArea') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <Input.TextArea
                      id={config.formCode}
                      name={config.formCode}
                      placeholder={`请输入${config.formName}`}
                    />
                  </FormItem>)
              } else if (config.formMode === 'Select') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请选择${config.formName}`}
                    key={config.id}>
                    <Select
                      id={config.formCode}
                      name={config.formCode}
                      placeholder={`请选择${config.formName}`}
                      filterLocal={false}
                      dataSource={config.formDataSource}
                      defaultValue={config.formDefaultValve}
                    />
                  </FormItem>)
              } else if (config.formMode === 'NumberPicker') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <NumberPicker
                      id={config.formCode}
                      name={config.formCode}
                      stringMode
                      type="inline"
                      step={10}
                      defaultValue={config.formDefaultValve}
                    />
                  </FormItem>)
              } else if (config.formMode === 'Switch') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <Switch
                      id={config.formCode}
                      name={config.formCode}
                      autoWidth
                      checkedChildren={'是'}
                      unCheckedChildren={'否'}
                    />
                  </FormItem>)
              } else if (config.formMode === 'Range') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <Range
                      id={config.formCode}
                      name={config.formCode}
                      defaultValue={0}
                      scales={[0, 100]}
                      marks={[0, 100]}
                    />
                  </FormItem>)
              } else if (config.formMode === 'DatePicker') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <DatePicker2
                      id={config.formCode}
                      name={config.formCode}
                      format="YYYY/MM/DD"
                      outputFormat="YYYY/MM/DD"
                    />
                  </FormItem>)
              } else if (config.formMode === 'RangePicker') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <RangePicker
                      id={config.formCode}
                      name={config.formCode}
                    />
                  </FormItem>)
              } else if (config.formMode === 'TimePicker') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <TimePicker
                      id={config.formCode}
                      name={config.formCode}
                    />
                  </FormItem>)
              } else if (config.formMode === 'Checkbox') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <CheckboxGroup
                      id={config.formCode}
                      name={config.formCode}
                      dataSource={config.formDataSource}
                      direction={config.formDirection}
                    />
                  </FormItem>)
              } else if (config.formMode === 'Radio') {
                return (
                  <FormItem
                    colSpan={config.formColSpan}
                    label={config.formName}
                    required={config.formRequired}
                    requiredMessage={`请输入${config.formName}`}
                    key={config.id}>
                    <RadioGroup
                      id={config.formCode}
                      name={config.formCode}
                      dataSource={config.formDataSource}
                      direction={config.formDirection}
                    />
                  </FormItem>)
              }
            })}
          </Form>
        </Card.Content>
      </Card>
    </Dialog>
  );
}

export default DataForm;
