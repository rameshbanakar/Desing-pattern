package Factory.db;

import Factory.DatabaseFactory.DatabaseFactory;
import Factory.DatabaseFactory.MySqlFactory;

public class MySql extends Database{
    @Override
    public DatabaseFactory createDatabase() {
        return new MySqlFactory();
    }
}
