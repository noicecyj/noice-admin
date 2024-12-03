import type {ProColumns} from '@ant-design/pro-components';
import {Button} from 'antd';
import pageStore from './store';
import DataTable from "@/components/DataTable";
import DataForm from "@/components/DataForm";
import {PlusOutlined} from "@ant-design/icons";
import {defineDataLoader} from "@ice/runtime/data-loader";
import {getForm, getTable} from "@/services/formAndTableAndUrl";
import {useData} from "@ice/runtime/router";

type PersistentItem = {
  appServiceId: string;
  persistentCode: string;
  persistentId: string;
  persistentName: string;
  persistentType: string;
};

const tableColumns: ProColumns<PersistentItem>[] = [
  {
    dataIndex: 'index',
    valueType: 'index',
    width: 48,
  },
  {
    title: '实体名称',
    dataIndex: 'persistentName',
    copyable: false,
    ellipsis: false,
  },
  {
    title: '实体编码',
    dataIndex: 'persistentCode',
    copyable: false,
    ellipsis: false,
  },
  {
    title: '实体类型',
    dataIndex: 'persistentType',
    copyable: false,
    ellipsis: false,
    valueType: 'select',
    valueEnum: {
      Bean: {
        text: 'Bean',
      },
      Relation: {
        text: 'Relation',
      },
    },
  },
  {
    title: '排序',
    dataIndex: 'sortCode',
    copyable: false,
    ellipsis: false,
    valueType: 'digit',
    width: 60,
  },
  {
    title: '状态',
    dataIndex: 'status',
    copyable: false,
    ellipsis: false,
    width: 60,
    valueType: 'select',
    valueEnum: {
      true: {
        text: '有效',
        status: 'true',
      },
      false: {
        text: '无效',
        status: 'false',
      },
    },
  },
  {
    title: '操作',
    valueType: 'option',
    key: 'option',
    width: 150,
    render: (text, record, _, action) => [
      <a
        // key="editable"
        // onClick={() => {
        //     action?.startEditable?.(record.id);
        // }}
      >
        编辑
      </a>,
      <a
        // href={record.url} target="_blank" rel="noopener noreferrer" key="view"
      >
        查看
      </a>,
      // <TableDropdown
      //     key="actionGroup"
      //     onSelect={() => action?.reload()}
      //     menus={[
      //         {key: 'copy', name: '复制'},
      //         {key: 'delete', name: '删除'},
      //     ]}
      // />,
    ],
  },
];

const valueEnum = {
  all: {
    text: '全部',
    status: 'Default'
  },
  open: {
    text: '未解决',
    status: 'Error',
  },
  closed: {
    text: '已解决',
    status: 'Success',
    disabled: true,
  },
  processing: {
    text: '解决中',
    status: 'Processing',
  },
};

export default function Persistent() {

  const [persistentState, persistentDispatchers] = pageStore.useModel('Persistent');
  const [form, table] = useData();
  console.log("dataLoader.form", form.data);
  console.log("dataLoader.table", table.data);
  return (
    <>
      <DataTable<PersistentItem>
        states={persistentState}
        search={() => {
          return persistentDispatchers.page(persistentState)
        }}
        tableColumns={tableColumns}
        toolBar={[
          <Button
            key="button"
            onClick={() => {
              console.log("click")
              persistentDispatchers.setState({visible: true})
            }}
            type="primary"
          >
            <PlusOutlined/>
            新建
          </Button>
        ]}/>
      <DataForm
        config={form.data}
        dispatchers={persistentDispatchers}
        state={persistentState}/>
    </>
  );
}

export const dataLoader = defineDataLoader([
  async (ctx) => {
    return await getForm(ctx.pathname);
  },
  async (ctx) => {
    return await getTable(ctx.pathname);
  },
]);

// export const pageConfig = definePageConfig(() => {
//     return {
//         auth: ['admin'],
//     };
// });
