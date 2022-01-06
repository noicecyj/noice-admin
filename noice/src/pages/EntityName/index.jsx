import React from 'react';
import EntityName from '@/pages/EntityName/view/auto/entityName';
import Entity from '@/pages/EntityName/view/auto/entity';
import EntityNameCustom from '@/pages/EntityName/view/custom/entityName';
import EntityCustom from '@/pages/EntityName/view/custom/entity';

function EntityNamePage() {
  return (
    <div>
      <EntityName custom={EntityNameCustom} />
      <Entity custom={EntityCustom} />
    </div>
  );
}

export default EntityNamePage;
