package com.inmemorysql.query;

import com.inmemorysql.sqlDb.*;
import com.inmemorysql.sqlDb.exceptions.TableDoesNotExists;

import java.util.HashMap;
import java.util.Map;

public class PutQuery implements IQuery {
    private static PutQuery putCommandInstance;

    private PutQuery() {
    }

    public static PutQuery getInstance() {
        if (putCommandInstance == null) {
            putCommandInstance = new PutQuery();
        }
        return putCommandInstance;
    }

    @Override
    public void executeCmd(String[] cmd) {
        String tableName = "Student";
        String name = "Raj";
        Integer age = 20;
        Integer marks = 90;
        String name1 = "Robby";
        Integer age1 = 21;
        Integer marks1 = 92;
        Map<ColumnsProperty, Columns<?>> columnsMap = new HashMap<>();
        ColumnsProperty c1 = new ColumnsProperty("Name", ColumnType.STRING);
        ColumnsProperty c2 = new ColumnsProperty("Age",ColumnType.INT);
        ColumnsProperty c3 = new ColumnsProperty("Marks",ColumnType.INT);
        columnsMap.put(c1,new Columns<String>(c1,name));
        columnsMap.put(c2,new Columns<Integer>(c2,age));
        columnsMap.put(c3,new Columns<Integer>(c3,marks));

        Map<ColumnsProperty, Columns<?>> columnsMap1 = new HashMap<>();
        ColumnsProperty c4 = new ColumnsProperty("Name", ColumnType.STRING);
        ColumnsProperty c5 = new ColumnsProperty("Age",ColumnType.INT);
        ColumnsProperty c6 = new ColumnsProperty("Marks",ColumnType.INT);
        columnsMap1.put(c4,new Columns<String>(c1,name1));
        columnsMap1.put(c5,new Columns<Integer>(c2,age1));
        columnsMap1.put(c6,new Columns<Integer>(c3,marks1));

        Row row = new Row(columnsMap);
        Row r1 = new Row(columnsMap1);

        try {
            SqlDatabase.getInstance().getATable(tableName).addRow(row);
            SqlDatabase.getInstance().getATable(tableName).addRow(r1);

        } catch (TableDoesNotExists e) {
            e.printStackTrace();
        }

    }
}
