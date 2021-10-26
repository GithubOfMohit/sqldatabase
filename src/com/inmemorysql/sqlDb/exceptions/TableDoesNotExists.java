package com.inmemorysql.sqlDb.exceptions;

public class TableDoesNotExists extends Throwable {
    public TableDoesNotExists(String message) {
        super(message);
    }
}
