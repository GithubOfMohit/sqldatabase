package com.inmemorysql.query;

import java.util.Map;

public class QueryFactory implements IQuery {

    private static QueryFactory commandFactoryInstance;
    private Map<String, IQuery> commandMap;
    private QueryFactory() {
        commandMap.put("CreateTable", CreateTableQuery.getInstance());
        commandMap.put("DeleteTable", DropTableQuery.getInstance());
        commandMap.put("Put", PutQuery.getInstance());
        commandMap.put("Get", GetQuery.getInstance());
        commandMap.put("Delete", DeleteQuery.getInstance());
    }

    public static QueryFactory getInstance() {
        if (commandFactoryInstance == null) {
            commandFactoryInstance = new QueryFactory();
        }
        return commandFactoryInstance;
    }

    @Override
    public void executeCmd(String[] cmd) {
        commandMap.get(cmd[0]).executeCmd(cmd);
    }
}
