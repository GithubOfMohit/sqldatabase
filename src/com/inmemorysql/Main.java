package com.inmemorysql;

import com.inmemorysql.query.CreateTableQuery;
import com.inmemorysql.query.GetQuery;
import com.inmemorysql.query.PutQuery;
import com.inmemorysql.query.QueryFactory;
import com.inmemorysql.sqlDb.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SqlDatabase s = SqlDatabase.getInstance();
        String [] cmd = {};
        CreateTableQuery.getInstance().executeCmd(cmd);
        PutQuery.getInstance().executeCmd(cmd);
        GetQuery.getInstance().executeCmd(cmd);

    }
}
