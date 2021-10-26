package com.inmemorysql.sqlDb;

import com.inmemorysql.sqlDb.exceptions.TableAlreadyExistsexception;
import com.inmemorysql.sqlDb.exceptions.TableDoesNotExists;

import java.util.HashMap;
import java.util.Map;

public class SqlDatabase {

    private static SqlDatabase sqlDatabaseInstance;
    private Map<String, Table> tableList;

    private SqlDatabase() {
        tableList = new HashMap<>();
    }

    public static SqlDatabase getInstance() {
        if (sqlDatabaseInstance == null) {
            sqlDatabaseInstance = new SqlDatabase();
        }
        return sqlDatabaseInstance;
    }


    public void createTable(String name,Table table) throws TableAlreadyExistsexception {
        if(tableList.containsKey(name)){
            throw new TableAlreadyExistsexception("Table Already Exists");
        }
        tableList.put(name, table);
    }

    public void removeTable(String name) throws TableDoesNotExists {
       if(!tableList.containsKey(name)){
           throw new TableDoesNotExists("Table Does not Exists");
       }
       tableList.remove(name);
    }

    public Table getATable(String name) throws TableDoesNotExists {
       if(!tableList.containsKey(name)){
           throw new TableDoesNotExists("Table Does not Exists");
       }
       return tableList.get(name);
    }



}
