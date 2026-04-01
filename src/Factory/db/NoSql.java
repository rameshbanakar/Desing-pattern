package Factory.db;

import Factory.DatabaseFactory.DatabaseFactory;
import Factory.DatabaseFactory.NoSqlFactory;

public class NoSql extends Database{

    @Override
    public DatabaseFactory createDatabase() {
        return new NoSqlFactory();
    }
}
