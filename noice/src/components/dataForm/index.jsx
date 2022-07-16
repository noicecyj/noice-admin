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

const dataSource = [
  {value: '有效', label: '有效'},
  {value: '无效', label: '无效'},
];

const FormItem = Form.Item;
const {RangePicker} = DatePicker2;
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
    customData,
    formSortCode,
  } = props;

  const formCol = customData.formCol === 4 ? 3 : customData.formCol === 3 ? 4 : customData.formCol === 2 ? 6 : 12;

  console.log("formDataValue====>",formDataValue)

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
            isPreview={!customData.editEnable}
            onChange={(value) => dispatchers(value)}>
            {items.map((item) => {
              console.log("item====>",item)
              if (item.propertyMode === 'Input') {
                return (
                  <FormItem
                    colSpan={formCol}
                    label={`${item.propertyLabel}`}
                    required={item.propertyRequired}
                    requiredMessage={`请输入${item.propertyLabel}`}
                    disabled={item.propertyEditEnable}
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
                    required={item.propertyRequired}
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
                    required={item.propertyRequired}
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
                    required={item.propertyRequired}
                    requiredMessage={`请输入${item.propertyLabel}`}
                    key={item.id}>
                    <Select
                      id={item.propertyCode}
                      name={item.propertyName}
                      filterLocal={false}
                      dataSource={item.propertyDataSource}
                      defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                    />
                  </FormItem>)
              } else if (item.propertyMode === 'NumberPicker') {
                return (
                  <FormItem
                    colSpan={formCol}
                    label={`${item.propertyLabel}`}
                    required={item.propertyRequired}
                    requiredMessage={`请输入${item.propertyLabel}`}
                    key={item.id}>
                    <NumberPicker
                      id={item.propertyCode}
                      name={item.propertyName}
                      stringMode
                      type="inline"
                      step={10}
                      defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                    />
                  </FormItem>)
              } else if (item.propertyMode === 'Switch') {
                return (
                  <FormItem
                    colSpan={formCol}
                    label={`${item.propertyLabel}`}
                    required={item.propertyRequired}
                    requiredMessage={`请输入${item.propertyLabel}`}
                    key={item.id}>
                    <Switch
                      id={item.propertyCode}
                      name={item.propertyName}
                      autoWidth
                      checkedChildren={'是'}
                      unCheckedChildren={'否'}
                    />
                  </FormItem>)
              } else if (item.propertyMode === 'Range') {
                return (
                  <FormItem
                    colSpan={formCol}
                    label={`${item.propertyLabel}`}
                    required={item.propertyRequired}
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
                    required={item.propertyRequired}
                    requiredMessage={`请输入${item.propertyLabel}`}
                    key={item.id}>
                    <DatePicker2
                      id={item.propertyCode}
                      name={item.propertyName}
                      format="YYYY/MM/DD"
                      outputFormat="YYYY/MM/DD"
                    />
                  </FormItem>)
              } else if (item.propertyMode === 'RangePicker') {
                return (
                  <FormItem
                    colSpan={formCol}
                    label={`${item.propertyLabel}`}
                    required={item.propertyRequired}
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
                    required={item.propertyRequired}
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
                    required={item.propertyRequired}
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
                    required={item.propertyRequired}
                    requiredMessage={`请输入${item.propertyLabel}`}
                    key={item.id}>
                    <RadioGroup
                      id={item.propertyCode}
                      name={item.propertyName}
                      dataSource={item.propertyDataSource}
                      direction={item.propertyDirection}
                    />
                  </FormItem>)
              } else if (item.propertyOut && item.propertyOutType === 'ManyToOne') {
                return (
                  <FormItem
                    colSpan={formCol}
                    label={`${item.propertyLabel}`}
                    required={item.propertyRequired}
                    requiredMessage={`请输入${item.propertyLabel}`}
                    key={item.id}>
                    <Select
                      id={item.propertyCode + "_id"}
                      name={item.propertyName + "Id"}
                      filterLocal={false}
                      dataSource={item.propertyDataSource}
                      defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                    />
                  </FormItem>)
              }
            })}
            {!customData.customForm && <FormItem
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
            </FormItem>}
            {!customData.customForm && <FormItem
              colSpan={formCol}
              label="排序代码"
              required
              requiredMessage="请输入排序代码">
              <NumberPicker
                id="sortCode"
                name="sortCode"
                defaultValue={formSortCode}
                stringMode
                type="inline"
                step={10}
              />
            </FormItem>}
          </Form>
        </Card.Content>
      </Card>
    </Dialog>
  );
}

export default DataForm;
