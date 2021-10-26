package com.inmemorysql.sqlDb;

import com.inmemorysql.sqlDb.exceptions.RowNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    Map<String, ColumnsProperty> columns;
    List<Row> listOfRows;
    public Table() {
        columns = new HashMap<>();
        listOfRows = new ArrayList<>();
    }
    public Table(Map<String, ColumnsProperty> columns) {
        listOfRows = new ArrayList<>();
        this.columns = columns;
    }

    public void addRow(Row row){
        listOfRows.add(row);
    }

    public Row findARow(Row row) {
        for(Row r: listOfRows){
            if(r.matchRow(row)){
                return r;
            }
        }
        return null;
    }
    public void removeARow(Row row){
        for(Row r: listOfRows){
            if(r.matchRow(row)){
                listOfRows.remove(r);
                break;
            }
        }
    }

    public Row updateRow(Row row){
        return null;
    }



}
