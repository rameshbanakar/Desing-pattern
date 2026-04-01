package Observer;

import Observer.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherUpdater {
    List<Observer> clients;

    double temp=10.5;

    WeatherUpdater(){
        System.out.println("Initial temp: "+this.temp);
        this.clients=new ArrayList<>();
    }

    public void addObserver(Observer client){
        this.clients.add(client);
    }

    public void removeObserver(Observer client){
        this.clients.remove(client);
    }

    public void tempUpdate(double temp){
        this.temp=temp;
        sendNotification();
    }

    public void sendNotification(){
        for(Observer ob:this.clients){
            ob.display(this.temp);
        }
    }

}
