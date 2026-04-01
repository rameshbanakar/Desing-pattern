package Factory.DatabaseFactory;

import Factory.Query.MySql;
import Factory.Query.Query;

public class MySqlFactory implements DatabaseFactory{
    @Override
    public Query getQuery() {
        return new MySql();
    }
}
