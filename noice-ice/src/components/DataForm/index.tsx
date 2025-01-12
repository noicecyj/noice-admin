import type {ProFormInstance} from '@ant-design/pro-components';
import {ModalForm, ProFormDateRangePicker, ProFormSelect, ProFormText,} from '@ant-design/pro-components';
import {Col, Row} from 'antd';
import {ProFormDigit, ProFormDigitRange, ProFormTextArea, ProFormTimePicker} from "@ant-design/pro-form/lib";
import {ProForm, ProFormCheckbox, ProFormDatePicker, ProFormRadio, ProFormSwitch} from "@ant-design/pro-form";
import store from "@/store";
import PageFormSelect from "@/components/DataForm/PageFormSelect";
import React, {useRef} from "react";

interface Option {
  label: string,
  value: string
}

type FormConfig = {
  persistentFormConfigName: string;
  persistentFormConfigCode: string;
  persistentFormConfigMode: string;
  id: string;
  persistentFormConfigColSpan?: number;
  persistentFormConfigDataSource?: Option[];
  persistentFormConfigDefaultValue?: string;
  persistentFormConfigDirection?: string;
  persistentFormConfigEdit?: boolean;
  persistentFormConfigRequired?: boolean;

};

type Form = {
  formConfigRowVoList: FormRow[];
  persistentFormCode: string;
  persistentFormName: string;
  persistentFormRow: number;
  persistentFormType: string;
}

type FormRow = {
  formConfigVoList: FormConfig[];
}

function DataForm(props: {
  config: Form,
  url?: {
    add: string,
    update: string,
  },
}) {

  const [entityState, entityDispatcher] = store.useModel('entity');

  const {
    config,
    url = {
      add: '',
      update: '',
    },
  } = props;

  const components = (item: FormConfig) => {
    if (item.persistentFormConfigMode === 'Input') {
      return (
        <ProFormText
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'Password') {
      return (
        <ProFormText.Password
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          placeholder={`请输入${item.persistentFormConfigName}`}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'TextArea') {
      return (
        <ProFormTextArea
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          placeholder={`请输入${item.persistentFormConfigName}`}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'Select') {
      return (
        <ProFormSelect
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          placeholder={`请选择${item.persistentFormConfigName}`}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          options={item.persistentFormConfigDataSource}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'NumberPicker') {
      return (
        <ProFormDigit
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          readonly={entityState.readonly}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'Switch') {
      return (
        <ProFormSwitch
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'Range') {
      return (
        <ProFormDigitRange
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'DatePicker') {
      return (
        <ProFormDatePicker
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />)
    } else if (item.persistentFormConfigMode === 'RangePicker') {
      return (
        <ProFormDateRangePicker
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />)
    } else if (item.persistentFormConfigMode === 'TimePicker') {
      return (
        <ProFormTimePicker
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'Checkbox') {
      return (
        <ProFormCheckbox.Group
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          options={item.persistentFormConfigDataSource}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'Radio') {
      return (
        <ProFormRadio.Group
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          options={item.persistentFormConfigDataSource}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'SelectForm') {
      return (
        <ProForm.Item
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          labelCol={{span: 24}}
          wrapperCol={{span: 24}}
          rules={[{required: item.persistentFormConfigRequired, message: '请选择'}]}
        >
          <PageFormSelect
            key={item.id}
            dataSource={item.persistentFormConfigDataSource}
            disabled={item.persistentFormConfigEdit}
            readonly={entityState.readonly}
          />
        </ProForm.Item>
      )
    } else {
      return (
        <ProFormText
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    }
  }

  const formRef = useRef<ProFormInstance>();

  return (
    <ModalForm
      formRef={formRef}
      readonly={entityState.readonly}
      grid={false}
      title={entityState.title}
      open={entityState.visible}
      onOpenChange={open => {
        if (open) {
          config.formConfigRowVoList.map((row: FormRow) => {
            row.formConfigVoList.map((item: FormConfig) => {
              formRef.current?.setFieldValue(item.persistentFormConfigCode, null);
              Object.keys(entityState.formData).forEach(key => {
                formRef.current?.setFieldValue(key, entityState.formData[key]);
              });
            })
          })
        } else {
          entityDispatcher.update({
            readonly: open
          });
        }
        entityDispatcher.update({
          visible: open
        });
      }}
      onFinish={async (values: any) => {
        entityDispatcher.save({
          saveUrl: entityState.status === 'add' ? url.add : url.update,
          formData: {
            ...values,
            id: entityState.formData.id,
          },
        });
      }}
    >
      {config.formConfigRowVoList.map((row: FormRow) => {
        return (
          <Row gutter={16}>
            {
              row.formConfigVoList.map((item: FormConfig) => {
                return (
                  <Col className="gutter-row" span={item.persistentFormConfigColSpan}>
                    {components(item)}
                  </Col>
                );
              })
            }
          </Row>
        );
      })}
    </ModalForm>
  );
}

export default DataForm;
