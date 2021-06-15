package Observer;

import Observer.interfaces.Observer;
import Observer.interfaces.Publisher;

public class SmallDisplay implements Observer {
    @Override
    public void update(Publisher subject, Object obj) {
        System.out.println("Current temperature " + subject.toString());
    }
}
