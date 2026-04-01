package Factory.Query;

public class MySql implements Query{
    @Override
    public void execute() {
        System.out.println("Mysql query");
    }
}
