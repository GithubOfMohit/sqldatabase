package com.inmemorysql.query;

import com.inmemorysql.sqlDb.*;
import com.inmemorysql.sqlDb.exceptions.TableDoesNotExists;

import java.util.HashMap;
import java.util.Map;

public class GetQuery implements IQuery {
    private static GetQuery getCommandInstance;

    private GetQuery() {
    }

    public static GetQuery getInstance() {
        if (getCommandInstance == null) {
            getCommandInstance = new GetQuery();
        }
        return getCommandInstance;
    }

    @Override
    public void executeCmd(String[] cmd) {

        try {
            Table t = SqlDatabase.getInstance().getATable("Student");
            String name = "Robby";
            Integer age = 21;
            Integer marks = 92;
            Map<ColumnsProperty, Columns<?>> columnsMap = new HashMap<>();
            ColumnsProperty c1 = new ColumnsProperty("Name", ColumnType.STRING);
//            ColumnsProperty c2 = new ColumnsProperty("Age",ColumnType.INT);
            ColumnsProperty c3 = new ColumnsProperty("Marks",ColumnType.INT);
            columnsMap.put(c1,new Columns<String>(c1,name));
//            columnsMap.put(c2,new Columns<Integer>(c2,age));
            columnsMap.put(c3,new Columns<Integer>(c3,marks));
            Row row = new Row(columnsMap);
            Row r = t.findARow(row);
            Integer a = 10;
        } catch (TableDoesNotExists e) {
            e.printStackTrace();
        }

    }
}
