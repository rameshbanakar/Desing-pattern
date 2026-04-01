package Factory.Query;

public class NoSql implements Query{
    @Override
    public void execute() {
        System.out.println("NoSql query executed");
    }
}
