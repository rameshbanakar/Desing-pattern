package Observer;

import Observer.Observers.Iphone;
import Observer.Observers.MacBook;
import Observer.Observers.Observer;

public class Client {
    public static void main(String[] args) {
        WeatherUpdater w=new WeatherUpdater();
        Observer macbook=new MacBook();
        w.addObserver(macbook);
        Observer iphone=new Iphone();
        w.addObserver(iphone);
        w.removeObserver(iphone);
        w.tempUpdate(23.0);
    }
}
