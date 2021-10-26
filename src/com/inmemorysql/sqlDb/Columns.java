package com.inmemorysql.sqlDb;

public class Columns<Type>{

    private final ColumnsProperty columnsProperty;
    private Type t;

    public Columns(ColumnsProperty columnsProperty) {
        this.columnsProperty = columnsProperty;
    }

    public Columns(ColumnsProperty columnsProperty, Type t) {
        this.columnsProperty = columnsProperty;
        this.t = t;
    }

    public ColumnsProperty getColumnsProperty() {
        return columnsProperty;
    }

    public Type getT() {
        return t;
    }

    public void setT(Type t) {
        this.t = t;
    }
    public Boolean matchColumnField(Columns columns){
        if(this.getColumnsProperty().equals(columns.getColumnsProperty()) && this.getT() == columns.getT())
            return true;
        return false;
    }
}
