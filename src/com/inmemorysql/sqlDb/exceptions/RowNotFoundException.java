package com.inmemorysql.sqlDb.exceptions;

public class RowNotFoundException extends Throwable {
    public RowNotFoundException(String message) {
        super(message);
    }
}
