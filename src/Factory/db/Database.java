package Factory.db;

import Factory.DatabaseFactory.DatabaseFactory;

public abstract class Database {
    public abstract DatabaseFactory createDatabase();
}
