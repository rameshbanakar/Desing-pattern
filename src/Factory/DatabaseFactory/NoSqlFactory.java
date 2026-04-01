package Factory.DatabaseFactory;

import Factory.Query.NoSql;
import Factory.Query.Query;

public class NoSqlFactory implements DatabaseFactory{
    @Override
    public Query getQuery() {
        return new NoSql();
    }
}
