package com.inmemorysql.query;

import com.inmemorysql.sqlDb.*;
import com.inmemorysql.sqlDb.exceptions.TableAlreadyExistsexception;

import java.util.HashMap;
import java.util.Map;

public class CreateTableQuery implements IQuery {

    private static CreateTableQuery createTableCommandInstance;

    private CreateTableQuery() {
    }

    public static CreateTableQuery getInstance() {
        if (createTableCommandInstance == null) {
            createTableCommandInstance = new CreateTableQuery();
        }
        return createTableCommandInstance;
    }

    @Override
    public void executeCmd(String[] cmd) {
        String tableName = "Student";
        Map<String, ColumnsProperty> columns = new HashMap<>();

        columns.put("Name", new ColumnsProperty("Name", ColumnType.STRING));
        columns.put("Age", new ColumnsProperty("Age", ColumnType.INT));
        columns.put("Marks", new ColumnsProperty("Marks", ColumnType.INT));

        Table table = new Table(columns);


        try {
            SqlDatabase.getInstance().createTable("Student",table);
        } catch (TableAlreadyExistsexception e) {
            System.out.println(e.getMessage());
        }


    }
}
