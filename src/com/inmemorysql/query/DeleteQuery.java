package com.inmemorysql.query;

public class DeleteQuery implements IQuery {
    private static DeleteQuery deleteCommandInstance;

    private DeleteQuery() {
    }

    public static DeleteQuery getInstance() {
        if (deleteCommandInstance == null) {
            deleteCommandInstance = new DeleteQuery();
        }
        return deleteCommandInstance;
    }

    @Override
    public void executeCmd(String[] cmd) {

    }
}
