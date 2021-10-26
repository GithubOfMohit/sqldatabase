package com.inmemorysql.sqlDb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Row {
    Map<ColumnsProperty,Columns<?>> columnsFields;

    public Row() {
        columnsFields = new HashMap<>();
    }

    public Row(Map<ColumnsProperty, Columns<?>> columnsFields) {
        this.columnsFields = columnsFields;
    }

    public Columns getColumns(ColumnsProperty columnsProperty){
        if(columnsFields.containsKey(columnsProperty)){
            return columnsFields.get(columnsProperty);
        }
        return null;
    }

    public Columns updateColumns(Columns columns){
        if(columnsFields.containsKey(columns.getColumnsProperty())){
            return columnsFields.get(columns.getColumnsProperty());
        }
        return null;
    }

    public Map<ColumnsProperty, Columns<?>> getColumnsFields() {
        return columnsFields;
    }

    public Boolean matchRow(Row row){
        for(Map.Entry<ColumnsProperty,Columns<?>> entry : row.getColumnsFields().entrySet()){
            if(columnsFields.get(entry.getKey()).matchColumnField(entry.getValue()) == false){
                return false;
            }
        }
        return true;
    }

}
