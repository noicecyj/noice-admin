/* eslint-disable react/no-array-index-key */
import React from 'react';
import {Box, Button, Dialog, Loading, Pagination, ResponsiveGrid, Table} from '@alifd/next';
import styles from './index.module.scss';

const {Cell} = ResponsiveGrid;

function DataTable(props) {
  const loadingStyle = {width: '100%'};
  console.log(props)

  const {
    items,
    customType,
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
    customMethod1,
    customMethod2,
    customMethod3,
    customMethodName1,
    customMethodName2,
    customMethodName3,
  } = props;

  const pageRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Box direction="row" spacing={5}>
          {editItem !== null && <Button type="primary" size="small" onClick={() => editItem(record)}> 编辑 </Button>}
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
          <div className={styles.add}>
            {!!createItem && <Button type="primary" onClick={() => createItem()}> 添加 </Button>}
            {!!customMethodName1 && <Button onClick={() => customMethod1()}> {customMethodName1} </Button>}
            {!!customMethodName2 && <Button onClick={() => customMethod2()}> {customMethodName2} </Button>}
            {!!customMethodName3 && <Button onClick={() => customMethod3()}> {customMethodName3} </Button>}
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
                return (<Table.Column
                  hidden={item.propertyDisplay === '否'}
                  title={item.propertyLabel}
                  dataIndex={item.propertyName}
                  width={item.propertyWidth != null ? item.propertyWidth : null}
                  key={index}
                />);
              })}
              {customType && <Table.Column
                title="自定义操作"
                align="right"
                key="columnRender"
                width="160px"
                cell={columnRender}
              />}
              <Table.Column
                title="状态"
                dataIndex="status"
                width="80px"
                key="status"
              />
              <Table.Column
                title="排序"
                dataIndex="sortCode"
                width="80px"
                key="sortCode"
              />
              {
                !!editItem && !!deleteItem && <Table.Column
                  title="操作"
                  align="right"
                  key="pageRender"
                  width="160px"
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
