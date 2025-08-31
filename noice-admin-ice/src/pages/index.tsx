import { definePageConfig, history, useAuth } from 'ice';
import { useEffect } from 'react';
import { Col, Row } from 'antd';
import CardBarChart from '@/components/CardBarChart';
import CardAreaChart from '@/components/CardAreaChart';
import CardTypebarChart from '@/components/CardTypebarChart';
import CardLineChart from '@/components/CardLineChart';
import CardRankChart from '@/components/CardRankChart';
import CardPieChart from '@/components/CardPieChart';
import CardGroupBarChart from '@/components/CardGroupBarChart';

export default function Dashboard() {
  const [auth] = useAuth();

  useEffect(() => {
    // 检查是否已登录

    if (!auth || (!auth.admin && !auth.user)) {
      // 未登录时重定向到登录页，并记录当前路径用于登录后返回
      if (typeof window !== 'undefined' && history) {
        const redirectPath = encodeURIComponent(window.location.pathname);
        history.push(`/login?redirect=${redirectPath}`);
      }
    }
  }, [auth, history]);

  // 如果未登录，不渲染首页内容
  if (!auth || (!auth.admin && !auth.user)) {
    return null;
  }

  return (
    <Row gutter={[16, 16]}>
      <Col xs={24} sm={12} md={6}>
        <CardBarChart/>
      </Col>
      <Col xs={24} sm={12} md={6}>
        <CardAreaChart/>
      </Col>
      <Col xs={24} sm={12} md={6}>
        <CardTypebarChart/>
      </Col>
      <Col xs={24} sm={12} md={6}>
        <CardLineChart/>
      </Col>
      <Col span={24}>
        <CardRankChart/>
      </Col>
      <Col span={8}>
        <CardPieChart/>
      </Col>
      <Col span={16}>
        <CardGroupBarChart/>
      </Col>
    </Row>
  );
}

export const pageConfig = definePageConfig(() => {
  return {
    auth: ['admin', 'user'],
  };
});