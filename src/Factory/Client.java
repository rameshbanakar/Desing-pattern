package Factory;

import Factory.db.Database;
public class Client {
    public static void main(String[] args) {
         Database db=DBFactoryProvider.CreateDatabase("nosql");
         UserService user=new UserService(db);
         user.createUser();
    }
}