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
    customData,
    columnRender,
    dataSource,
    rowSelection,
    primaryKey,
    total,
    getPage,
    visibleLoading,
    createItem,
    deleteItem,
    editItem,
    searchFormValue,
  } = props;

  const pageRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Box direction="row" spacing={5}>
          {editItem !== null && customData.editEnable &&
            <Button type="primary" size="small" onClick={() => editItem(record)}> 编辑 </Button>}
          {editItem !== null && !customData.editEnable &&
            <Button type="primary" size="small" onClick={() => editItem(record)}> 预览 </Button>}
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
        <Form
          responsive={true}
          fullWidth
          labelAlign="top"
          value={searchFormValue}>
          {items.map((item) => {
            console.log("item====>", item)
            if (item.propertyMode === 'Input') {
              return (
                <FormItem
                  colSpan={4}
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
            } else if (item.propertyMode === 'Select') {
              return (
                <FormItem
                  colSpan={4}
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
            } else if (item.propertyOut && item.propertyOutType === 'ManyToOne') {
              return (
                <FormItem
                  colSpan={4}
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
        </Form>
        <div className={styles.Main}>
          <div className={styles.add}>
            {!!createItem && <Button type="primary" onClick={() => createItem()}> 添加 </Button>}
          </div>
          <div className={styles.add}>
            {!!search && <Button type="primary" onClick={() => search()}> 查询 </Button>}
          </div>
          <div className={styles.add}>
            {!!reset && <Button onClick={() => reset()}> 重置 </Button>}
          </div>
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
              {items.length === 0 ? null : items.map((item, index) => {
                if (!item.propertyDisplay) {
                  return (<Table.Column
                    hidden={item.propertyDisplay}
                    title={item.propertyLabel}
                    dataIndex={item.propertyName}
                    width={item.propertyWidth != null ? item.propertyWidth : null}
                    key={index}
                  />);
                }
              })}
              {customData.customType && <Table.Column
                title="自定义操作"
                alignHeader="center"
                align="center"
                key="columnRender"
                width="160px"
                cell={columnRender}
              />}
              <Table.Column
                title="状态"
                dataIndex="status"
                width="65px"
                key="status"
                alignHeader="center"
                align="center"
              />
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
