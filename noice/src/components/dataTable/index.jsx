/* eslint-disable react/no-array-index-key */
import React from 'react';
import {Box, Button, Dialog, Form, Input, Loading, Pagination, ResponsiveGrid, Select, Table,} from '@alifd/next';
import styles from './index.module.scss';

const {Cell} = ResponsiveGrid;
const FormItem = Form.Item;

function DataTable(props) {
  const loadingStyle = {width: '100%'};

  const {
    items,
    dataSource,
    rowSelection,
    primaryKey,
    total,
    getPage,
    visibleLoading,
    addItem,
    deleteItem,
    editItem,
    searchFormValue,
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
            value={searchFormValue}>
            {!!addItem && <Button type="primary" onClick={() => addItem()}> 添加 </Button>}
            {items.map((item) => {
              console.log("item====>", item)
              console.log("item.INFO====>", item.INFO)
              console.log("item.CONFIG====>", item.CONFIG)
              console.log("item.SEARCH====>", item.SEARCH)
              return item.SEARCH.map((search) => {
                if (search.searchMode === 'Input') {
                  console.log("item.SEARCH.Input====>", search)
                  return (
                    <FormItem
                      colSpan={2}
                      label={`${search.searchName}`}
                      key={search.id}>
                      <Input
                        id={search.searchCode}
                        name={search.searchName}
                      />
                    </FormItem>
                  )
                } else if (search.searchMode === 'Select' || search.searchMode === 'ManyToOne') {
                  console.log("item.SEARCH.Select|ManyToOne====>", search)
                  return (
                    <FormItem
                      colSpan={2}
                      label={`${search.searchName}`}
                      key={search.id}>
                      <Select
                        id={search.searchCode}
                        name={search.searchName}
                        filterLocal={false}
                        dataSource={search.searchDataSource}
                      />
                    </FormItem>)
                }
              })
            })}
            {!!search && <Button type="primary" onClick={() => search()}> 查询 </Button>}
            {!!reset && <Button onClick={() => reset()}> 重置 </Button>}
          </Form>

          <Loading
            tip="加载中..."
            visible={visibleLoading}
            style={loadingStyle}
          >
            <Table
              hasBorder
              className={styles.Table}
              dataSource={dataSource}
              rowSelection={rowSelection}
              primaryKey={primaryKey}
            >
              {items.map((item) => {
                console.log("item.CONFIG====>", item.CONFIG)
                return item.CONFIG.map((config, index) => {
                  return (<Table.Column
                    title={config.persistentTableConfigName}
                    dataIndex={config.persistentTableConfigCode}
                    width={config.persistentTableConfigWidth != null ? item.persistentTableConfigWidth : null}
                    key={index}
                  />);
                })
              })}
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
                onChange={(current) => getPage(current)}
                type="simple"
                pageSize={13}
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
