package Observer.Observers;

public class Iphone implements Observer{
    @Override
    public void display(double temp) {
        System.out.println("IPhone:"+temp);
    }
}
