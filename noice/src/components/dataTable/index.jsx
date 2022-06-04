/* eslint-disable react/no-array-index-key */
import React from 'react';
import {Box, Button, Dialog, Loading, Pagination, ResponsiveGrid, Table} from '@alifd/next';
import styles from './index.module.scss';

const {Cell} = ResponsiveGrid;

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
    manyToMany1,
    manyToMany2,
    manyToMany3,
    manyToManyMethod1,
    manyToManyMethod2,
    manyToManyMethod3,
    son1,
    son2,
    son3,
    sonMethod1,
    sonMethod2,
    sonMethod3,
    customMethod1,
    customMethod2,
    customMethod3,
    customMethodName1,
    customMethodName2,
    customMethodName3,
  } = props;
  console.log(sonMethod2)

  const pageRender = (value, index, record) => {
    return (
      <div className={styles.opt}>
        <Box direction="row" spacing={5}>
          {!!sonMethod1 && <Button size="small" onClick={() => sonMethod1(record)}> {son1} </Button>}
          {!!sonMethod2 && <Button size="small" onClick={() => sonMethod2(record)}> {son2} </Button>}
          {!!sonMethod3 && <Button size="small" onClick={() => sonMethod3(record)}> {son3} </Button>}
          {!!manyToManyMethod1 && <Button size="small" onClick={() => manyToManyMethod1(record)}> {manyToMany1} </Button>}
          {!!manyToManyMethod2 && <Button size="small" onClick={() => manyToManyMethod2(record)}> {manyToMany2} </Button>}
          {!!manyToManyMethod3 && <Button size="small" onClick={() => manyToManyMethod3(record)}> {manyToMany3} </Button>}
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
