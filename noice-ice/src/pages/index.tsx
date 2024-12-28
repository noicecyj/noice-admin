import {Button, Col, Dropdown, Row} from 'antd';
import CardBarChart from '@/components/CardBarChart';
import CardAreaChart from '@/components/CardAreaChart';
import CardTypebarChart from '@/components/CardTypebarChart';
import CardLineChart from '@/components/CardLineChart';
import CardRankChart from '@/components/CardRankChart';
import CardPieChart from '@/components/CardPieChart';
import CardGroupBarChart from '@/components/CardGroupBarChart';
import {useSessionStorageState} from "ahooks";
import {UserInfo} from "@/interfaces/user";
import {history} from 'ice';
import {PageContainer} from "@ant-design/pro-layout";
import {EllipsisOutlined} from "@ant-design/icons";

export default function Dashboard() {

  const [userInfoLocal] = useSessionStorageState<UserInfo>('userInfo');
  if (userInfoLocal === undefined) {
    console.log('userInfoLocal2', userInfoLocal);
    history?.push('/login');
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
