/* eslint-disable react/no-array-index-key */
import React from 'react';
import { Table, Box, Pagination, Loading } from '@alifd/next';
import styles from './index.module.scss';

function DataTable(props) {
  const loadingStyle = { width: '100%' };
  const { items, pageRender, operationRender, dataSource, rowSelection, primaryKey, total, getPage, visibleLoading } = props;
  console.log(operationRender);
  return (
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
        {operationRender !== null && <Table.Column
          title="自定义操作"
          align="right"
          key="operationRender"
          width="160px"
          cell={operationRender}
        />}
        <Table.Column
          title="状态"
          dataIndex="status"
          width="80px"
          key="status"
        />
        <Table.Column
          title="操作"
          align="right"
          key="pageRender"
          width="160px"
          cell={pageRender}
        />
      </Table>
      <Box
        margin={[15, 0, 0, 0]}
        direction="row"
        align="center"
        justify="space-between"
      >
        <div className={styles.total}> 共 <span>{total}</span> 条 </div>
        <Pagination
          onChange={(current) => getPage(current)}
          type="simple"
          pageSize={8}
          total={total}
        />
      </Box>
    </Loading>

  );
}

export default DataTable;
