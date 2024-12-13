import {ModalForm, ProFormDateRangePicker, ProFormSelect, ProFormText,} from '@ant-design/pro-components';
import {Col, message, Row} from 'antd';
import {ProFormDigit, ProFormDigitRange, ProFormTextArea, ProFormTimePicker} from "@ant-design/pro-form/lib";
import {ProForm, ProFormCheckbox, ProFormDatePicker, ProFormRadio, ProFormSwitch} from "@ant-design/pro-form";
import store from "@/store";
import PageFormSelect from "@/components/DataForm/PageFormSelect";

type FormConfig = {
  persistentFormConfigName: string;
  persistentFormConfigCode: string;
  persistentFormConfigMode: string;
  id: string;
  persistentFormConfigColSpan?: number;
  persistentFormConfigDataSource?: string | undefined;
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
  }
}) {

  const [entityState, entityDispatcher] = store.useModel('entity');

  const {
    config,
    url = {
      add: '',
    }
  } = props;

  const components = (item: FormConfig) => {
    if (item.persistentFormConfigMode === 'Input') {
      return (
        <ProFormText
          colProps={{md: item.persistentFormConfigColSpan}}
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
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
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
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
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
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          placeholder={`请选择${item.persistentFormConfigName}`}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={!item.persistentFormConfigEdit}
          request={async () => {
            return entityDispatcher.getOption(item.persistentFormConfigDataSource);
          }}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'NumberPicker') {
      return (
        <ProFormDigit
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={!item.persistentFormConfigEdit}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'Switch') {
      return (
        <ProFormSwitch
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
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
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
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
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
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
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
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
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
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
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          request={async () => {
            return entityDispatcher.getOption(item.persistentFormConfigDataSource);
          }}
          required={item.persistentFormConfigRequired}
          rules={[{required: item.persistentFormConfigRequired, message: '请输入' + item.persistentFormConfigName}]}
        />
      )
    } else if (item.persistentFormConfigMode === 'Radio') {
      return (
        <ProFormRadio.Group
          id={item.id}
          colProps={{md: item.persistentFormConfigColSpan}}
          name={item.persistentFormConfigCode}
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          disabled={item.persistentFormConfigEdit}
          request={async () => {
            return entityDispatcher.getOption(item.persistentFormConfigDataSource);
          }}
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
            colProps={{md: item.persistentFormConfigColSpan}}
            key={item.id}
            dataSource={item.persistentFormConfigDataSource}
            initialValue={item.persistentFormConfigDefaultValue}
            disabled={item.persistentFormConfigEdit}
          />
        </ProForm.Item>
      )
    } else {
      return (
        <ProFormText
          colProps={{md: item.persistentFormConfigColSpan}}
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

  const [form] = ProForm.useForm();

  form.validateFields

  return (
    <ModalForm
      // @ts-ignore
      labelWidth="auto"
      grid={false}
      title={entityState.title}
      open={entityState.visible}
      onOpenChange={open => {
        entityDispatcher.update({visible: open});
      }}
      onFinish={async (values: any) => {
        await entityDispatcher.save({
          saveUrl: url.add,
          formData: values,
        })
        console.log(values);
        message.success('提交成功');
      }}
      initialValues={entityState.formData}
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
