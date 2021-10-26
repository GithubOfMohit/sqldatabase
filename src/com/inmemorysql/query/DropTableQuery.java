package com.inmemorysql.query;

public class DropTableQuery implements IQuery {
    private static DropTableQuery dropTableCommandInstance;

    private DropTableQuery() {
    }

    public static DropTableQuery getInstance() {
        if (dropTableCommandInstance == null) {
            dropTableCommandInstance = new DropTableQuery();
        }
        return dropTableCommandInstance;
    }

    @Override
    public void executeCmd(String[] cmd) {

    }
}
