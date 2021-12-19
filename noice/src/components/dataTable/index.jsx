/* eslint-disable react/no-array-index-key */
import React from 'react';
import { Table, Box, Pagination, Loading } from '@alifd/next';
import styles from './index.module.scss';

function DataTable(props) {
  const loadingStyle = { width: '100%' };
  const { items, pageRender, operationRender, dataSource, rowSelection, total, getPage, visibleLoading } = props;
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
      >
        {items.length === 0 ? null : items.map((item, index) => {
          if (item.propertyType === 'customOperation') {
            return (<Table.Column
              style={item.propertyDisplay === '0'}
              title={item.propertyLabel}
              dataIndex={item.propertyCode}
              width={item.propertyWidth != null ? item.propertyWidth : null}
              align="right"
              cell={operationRender}
              key={index}
            />);
          }
          return (<Table.Column
            hidden={item.propertyDisplay === '0'}
            title={item.propertyLabel}
            dataIndex={item.propertyCode}
            width={item.propertyWidth != null ? item.propertyWidth : null}
            key={index}
          />);
        })}
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
