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
  persistentFormConfigDataSource?: string;
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
  config: Form;
  dispatchers: any;
  state: any;
}) {

  const [entityState, entityDispatcher] = store.useModel('entity');

  const {
    config,
    dispatchers,
    state,
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
          disabled={item.persistentFormConfigEdit}
          request={dispatchers.getOptions(item.persistentFormConfigDataSource)}
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
          request={dispatchers.getOptions(item.persistentFormConfigDataSource)}
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
          request={dispatchers.getOptions(item.persistentFormConfigDataSource)}
        />
      )
    } else if (item.persistentFormConfigMode === 'SelectForm') {
      return (
        <ProForm.Item
          label={item.persistentFormConfigName}
          key={item.id}
          initialValue={item.persistentFormConfigDefaultValue}
          labelCol={{span: 24}}
          wrapperCol={{span: 24}}
        >
          <PageFormSelect
            colProps={{md: item.persistentFormConfigColSpan}}
            name={item.persistentFormConfigCode}
            label={item.persistentFormConfigName}
            key={item.id}
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
        />
      )
    }
  }


  return (
    <ModalForm
      // @ts-ignore
      labelWidth="auto"
      grid={false}
      open={state.visible}
      onOpenChange={open => {
        dispatchers.setState({visible: open});
      }}
      onFinish={async (values: any) => {
        await entityDispatcher.save({
          saveUrl: '/entityCreateApi/Persistent/add',
          formData: values,
        })
        console.log(values);
        message.success('提交成功');
      }}
      initialValues={state}
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
