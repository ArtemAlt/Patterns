package Observer.interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer){
        subscribers.add(observer);
    }
    public void unsubscribe(Observer observer){
        subscribers.remove(observer);
    }

    public void notify(Object obj){
        for (Observer observer: subscribers){
            observer.update(this,obj);
        }
    }

}
