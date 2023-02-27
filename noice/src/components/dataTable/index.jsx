/* eslint-disable react/no-array-index-key */
import React from 'react';
import {Box, Button, Dialog, Form, Input, Loading, Pagination, ResponsiveGrid, Select, Table} from '@alifd/next';
import styles from './index.module.scss';

const {Cell} = ResponsiveGrid;
const FormItem = Form.Item;

function DataTable(props) {
  const loadingStyle = {width: '100%'};

  const {
    configItems,
    searchItems,
    titleButton,
    operationButton,
    runCustomMethod,
    dataSource,
    rowSelection,
    primaryKey,
    total,
    setPage,
    visibleLoading,
    addItem,
    deleteItem,
    editItem,
    searchFormValue,
    dispatchers,
    search,
    reset,
  } = props;

  const pageRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Box direction="row" spacing={5}>
          {editItem !== null &&
            <Button type="primary" size="small" onClick={() => editItem(record)}> 编辑 </Button>}
          {deleteItem !== null &&
            <Button type="primary" size="small" onClick={() => deleteConfirm(record)} warning> 删除 </Button>}
        </Box>
      </div>
    );
  };

  const columnRender = (value, index, record) => {
    return (
      <Box direction="row" spacing={5}>
        {
          operationButton.map(operation => {
            // @ts-ignore
            let url = operation.persistentTableConfigMethod;
            // @ts-ignore
            let name = operation.persistentTableConfigName;
            return (
              <Button
                type="normal"
                size="small"
                key={operation.persistentTableConfigCode}
                onClick={() => runCustomMethod({obj: record, url})}
              > {name} </Button>
            )
          })
        }
      </Box>
    );
  };

  const deleteConfirm = (record) => {
    Dialog.confirm({
      title: '删除',
      content: '是否确认删除',
      onOk: () => deleteItem(record),
    });
  };

  return (
    <ResponsiveGrid gap={20}>
      <Cell colSpan={12}>
        <div className={styles.Main}>
          <Form
            responsive={true}
            fullWidth
            value={searchFormValue}
            onChange={(value) => dispatchers(value)}>
            {searchItems.map((search) => {
              if (search.searchMode === 'Input') {
                return (
                  <FormItem
                    colSpan={3}
                    label={search.searchName}
                    key={search.id}>
                    <Input
                      id={search.searchCode}
                      name={search.searchCode}
                    />
                  </FormItem>
                )
              } else if (search.searchMode === 'Select' || search.searchMode === 'ManyToOne') {
                return (
                  <FormItem
                    colSpan={3}
                    label={`${search.searchName}`}
                    key={search.id}>
                    <Select
                      id={search.searchCode}
                      name={search.searchCode}
                      filterLocal={false}
                      dataSource={search.searchDataSource}
                      defaultValue={search.searchDefaultValve === null ? "" : search.searchDefaultValve}
                    />
                  </FormItem>)
              }
            })}
          </Form>
          <Box>
            <Box direction="row" spacing={15} margin={[10, 0]} justify="right">
              {!!search && <Button type="primary" onClick={() => search()} className={styles.boxButton}> 查询 </Button>}
              {!!reset && <Button onClick={() => reset()}> 重置 </Button>}
            </Box>
            <Box direction="row" spacing={15} margin={[10, 0]}>
              {!!addItem && <Button type="primary" onClick={() => addItem()}> 添加 </Button>}

              {
                titleButton.map(operation => {
                  // @ts-ignore
                  let url = operation.persistentTableConfigMethod;
                  // @ts-ignore
                  let name = operation.persistentTableConfigName;
                  return (
                    <Button
                      type="normal"
                      onClick={() => runCustomMethod({url})}
                      key={operation.persistentTableConfigCode}
                    > {name} </Button>
                  )
                })
              }
            </Box>

          </Box>

          <Loading
            tip="加载中..."
            visible={visibleLoading}
            style={loadingStyle}
          >
            <Table
              className={styles.Table}
              dataSource={dataSource}
              rowSelection={rowSelection}
              primaryKey={primaryKey}
            >
              {configItems.map((config) => {
                return (<Table.Column
                  title={config.persistentTableConfigName}
                  dataIndex={config.persistentTableConfigCode}
                  key={config.persistentTableConfigCode}
                />);
              })}
              {
                operationButton.length !== 0 && <Table.Column
                  title="自定义操作"
                  alignHeader="center"
                  align="center"
                  key="columnRender"
                  width="140px"
                  cell={columnRender}
                />
              }
              <Table.Column
                title="排序"
                dataIndex="sortCode"
                width="65px"
                key="sortCode"
                alignHeader="center"
                align="center"
              />
              {
                !!editItem && !!deleteItem && <Table.Column
                  title="操作"
                  key="pageRender"
                  width="150px"
                  alignHeader="center"
                  align="center"
                  cell={pageRender}
                />
              }
            </Table>
            <Box
              margin={[15, 0, 0, 0]}
              direction="row"
              align="center"
              justify="space-between"
            >
              <div className={styles.total}> 共 <span>{total}</span> 条</div>
              <Pagination
                onChange={(current) => setPage(current)}
                type="simple"
                pageSize={10}
                total={total}
              />
            </Box>
          </Loading>
        </div>
      </Cell>
    </ResponsiveGrid>
  );
}


export default DataTable;
