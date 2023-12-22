package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Publisher{
    private List<NotificationObserver> subscribers;

    public NewsPublisher(){
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void registerObserver(NotificationObserver observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unregisterObserver(NotificationObserver observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver subscriber: subscribers){
            subscriber.update();
        }

    }
}
