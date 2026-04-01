package Observer.Observers;

public class AppleWatch implements Observer{
    @Override
    public void display(double temp) {
        System.out.println("Apple Wacth:"+temp);
    }
}
