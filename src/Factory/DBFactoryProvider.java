package Factory;
import Factory.db.Database;
import Factory.db.MySql;
import Factory.db.NoSql;

public class DBFactoryProvider {

    public static Database CreateDatabase(String name){
        if(name.equalsIgnoreCase("mysql")){
            return new MySql();
        } else if (name.equalsIgnoreCase("nosql")) {
            return new NoSql();
        }else{
            return null;
        }
    }
}
