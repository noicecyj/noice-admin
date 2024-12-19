import React from 'react';
import DataTable from "@/components/DataTable";
import DataForm from "@/components/DataForm";

function PageModel(props: {
  url: any;
  table: any;
  form: any;
}) {

  const {
    url,
    table,
    form,
  } = props;

  return (
    <>
      <DataTable
        tableColumns={table.data.tableConfigVoList}
        url={url.data}
      />
      <DataForm
        url={url.data}
        config={form.data}
      />
    </>
  );
}

export default PageModel;
