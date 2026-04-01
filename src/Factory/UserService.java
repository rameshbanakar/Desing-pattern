package Factory;

import Factory.DatabaseFactory.DatabaseFactory;
import Factory.Query.Query;
import Factory.db.Database;
import Factory.db.MySql;
import Factory.db.NoSql;

public class UserService {
    public static Database db;

    UserService(Database db) {
        this.db = db;
    }
    public void createUser(){
        DatabaseFactory dbf=db.createDatabase();
        Query q=dbf.getQuery();
        q.execute();
    }
}
