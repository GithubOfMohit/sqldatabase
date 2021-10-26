package com.inmemorysql.sqlDb;

import java.util.Objects;

public class ColumnsProperty {
    private final String columnName;
    private final ColumnType columnType;

    public ColumnsProperty(String columnName, ColumnType columnType) {
        this.columnName = columnName;
        this.columnType = columnType;
    }

    public String getColumnName() {
        return columnName;
    }

    public ColumnType getColumnType() {
        return columnType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnsProperty that = (ColumnsProperty) o;
        return columnName.equals(that.columnName) && columnType == that.columnType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, columnType);
    }
}
