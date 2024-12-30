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
        table={table.data}
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
