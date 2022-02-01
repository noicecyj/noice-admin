import React from 'react';
import ReactJson from 'react-json-view';
import { Checkbox, DatePicker, Dialog, Form, Input, NumberPicker, Radio, Range, Select, Switch, TimePicker } from '@alifd/next';

const FormItem = Form.Item;
const { RangePicker } = DatePicker;
const { Group: CheckboxGroup } = Checkbox;
const { Group: RadioGroup } = Radio;
const formItemLayout = {
  labelCol: {
    fixedSpan: 6,
  },
  wrapperCol: {
    span: 40,
  },
};


const dataSource = [
  { value: '有效', label: '有效' },
  { value: '无效', label: '无效' },
];

function DataForm(props) {
  const { items, dispatchers, onOk, formDataValue, title, visibleDialog, onClose } = props;

  return (
    <Dialog
      title={title}
      visible={visibleDialog}
      footer={false}
      onClose={onClose}
      style={{ width: '30%' }}
    >
      <Form
        style={{ width: '100%' }}
        {...formItemLayout}
        value={formDataValue}
        onChange={(value) => dispatchers(value)}
      >
        {items.map((item) => {
          if (item.propertyMode === 'Input' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <Input
                    id={item.propertyCode}
                    name={item.propertyName}
                    placeholder={`请输入${item.propertyLabel}`}
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <Input
                    id={item.propertyCode}
                    name={item.propertyName}
                    placeholder={`请输入${item.propertyLabel}`}
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'Password' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <Input.Password id={item.propertyCode} name={item.propertyName} placeholder={`请输入${item.propertyLabel}`} />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <Input.Password id={item.propertyCode} name={item.propertyName} placeholder={`请输入${item.propertyLabel}`} />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'TextArea' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <Input.TextArea
                    id={item.propertyCode}
                    name={item.propertyName}
                    placeholder={`请输入${item.propertyLabel}`}
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <Input.TextArea
                    id={item.propertyCode}
                    name={item.propertyName}
                    placeholder={`请输入${item.propertyLabel}`}
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'Select') {
            if (item.propertyDataSource != null) {
              if (item.propertyRequired === '是') {
                return (
                  <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                    <Select
                      id={item.propertyCode}
                      name={item.propertyName}
                      filterLocal={false}
                      dataSource={item.propertyDataSource}
                      style={{ width: 414 }}
                      mode={item.mode}
                      defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                    />
                  </FormItem>
                );
              } else {
                return (
                  <FormItem label={`${item.propertyLabel}`} key={item.id}>
                    <Select
                      id={item.propertyCode}
                      name={item.propertyName}
                      filterLocal={false}
                      dataSource={item.propertyDataSource}
                      style={{ width: 414 }}
                      mode={item.mode}
                      defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                    />
                  </FormItem>
                );
              }
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <Select
                    id={item.propertyCode}
                    name={item.propertyName}
                    filterLocal={false}
                    style={{ width: 414 }}
                    mode={item.mode}
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'ReactJson') {
            let jsonObj = {};
            if (formDataValue.jsonData) {
              jsonObj = JSON.parse(formDataValue.jsonData);
            }
            return (
              <ReactJson
                src={jsonObj}
                name={item.propertyCode}
                key={item.id}
                onAdd={(add) => {
                  dispatchers({ ...formDataValue, jsonData: JSON.stringify(add.updated_src) });
                }}
                onEdit={(edit) => {
                  dispatchers({ ...formDataValue, jsonData: JSON.stringify(edit.updated_src) });
                }}
                onDelete={(deleteCont) => {
                  dispatchers({ ...formDataValue, jsonData: JSON.stringify(deleteCont.updated_src) });
                }}
              />
            );
          } else if (item.propertyMode === 'NumberPicker' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <NumberPicker
                    id={item.propertyCode}
                    name={item.propertyName}
                    min={1}
                    max={10}
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
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
          } else if (item.propertyMode === 'Switch' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <Switch
                    id={item.propertyCode}
                    name={item.propertyName}
                    defaultChecked
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <Switch
                    id={item.propertyCode}
                    name={item.propertyName}
                    defaultChecked
                    defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                  />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'Range' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <Range id={item.propertyCode} name={item.propertyName} defaultValue={0} scales={[0, 100]} marks={[0, 100]} />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <Range id={item.propertyCode} name={item.propertyName} defaultValue={0} scales={[0, 100]} marks={[0, 100]} />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'DatePicker' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <DatePicker id={item.propertyCode} name={item.propertyName} />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <DatePicker id={item.propertyCode} name={item.propertyName} />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'RangePicker' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <RangePicker id={item.propertyCode} name={item.propertyName} />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <RangePicker id={item.propertyCode} name={item.propertyName} />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'TimePicker' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <TimePicker id={item.propertyCode} name={item.propertyName} />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <TimePicker id={item.propertyCode} name={item.propertyName} />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'Checkbox' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <CheckboxGroup
                    id={item.propertyCode}
                    name={item.propertyName}
                    dataSource={item.propertyDataSource}
                    direction={item.propertyDirection}
                  />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <CheckboxGroup
                    id={item.propertyCode}
                    name={item.propertyName}
                    dataSource={item.propertyDataSource}
                    direction={item.propertyDirection}
                  />
                </FormItem>
              );
            }
          } else if (item.propertyMode === 'Radio' || item.propertyMode == null) {
            if (item.propertyRequired === '是') {
              return (
                <FormItem label={`${item.propertyLabel}`} required requiredMessage={`请输入${item.propertyLabel}`} key={item.id}>
                  <RadioGroup
                    id={item.propertyCode}
                    name={item.propertyName}
                    dataSource={item.propertyDataSource}
                    direction={item.propertyDirection}
                  />
                </FormItem>
              );
            } else {
              return (
                <FormItem label={`${item.propertyLabel}`} key={item.id}>
                  <RadioGroup
                    id={item.propertyCode}
                    name={item.propertyName}
                    dataSource={item.propertyDataSource}
                    direction={item.propertyDirection}
                  />
                </FormItem>
              );
            }
          } else {
            return (
              <FormItem label={`${item.propertyLabel}`} key={item.id}>
                <Input
                  id={item.propertyCode}
                  name={item.propertyName}
                  defaultValue={item.propertyDefaultValue != null ? item.propertyDefaultValue : null}
                />
              </FormItem>
            );
          }
        })}
        <FormItem label="状态" required requiredMessage="请输入状态">
          <Select
            id="status"
            name="status"
            filterLocal={false}
            style={{ width: 414 }}
            dataSource={dataSource}
            defaultValue="有效"
          />
        </FormItem>
        <FormItem label="排序代码" required requiredMessage="请输入排序代码">
          <Input id="sortCode" name="sortCode" placeholder="请输入排序代码" defaultValue="0010" />
        </FormItem>
        <FormItem>
          <Form.Submit
            validate
            type="primary"
            onClick={(v, e) => {
              if (e == null) {
                onOk();
              }
            }}
            style={{ marginRight: 10 }}
          >确定
          </Form.Submit>
          <Form.Reset>重置</Form.Reset>
        </FormItem>
      </Form>
    </Dialog>
  );
}

export default DataForm;
