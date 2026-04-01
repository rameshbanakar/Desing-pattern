package Observer.Observers;

public class MacBook implements Observer{
    @Override
    public void display(double temp) {
        System.out.println("MacBook:"+temp);
    }
}
