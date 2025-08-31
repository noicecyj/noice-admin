import React from 'react';
import DataTable from "@/components/DataTable";
import DataForm from "@/components/DataForm";

function PageModel(props: {
  url: any,
  table: any,
  form: any,
  infoState: any,
  infoDispatchers: any
}) {

  const {
    url,
    table,
    form,
    infoState,
    infoDispatchers,
  } = props;

  return (
    <>
      <DataTable
        table={table.data}
        url={url.data}
        infoState={infoState}
        infoDispatchers={infoDispatchers}
      />
      <DataForm
        url={url.data}
        config={form.data}
      />
    </>
  );
}

export default PageModel;
