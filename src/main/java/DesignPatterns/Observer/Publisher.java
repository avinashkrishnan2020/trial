package DesignPatterns.Observer;

public interface Publisher {
    public void registerObserver(NotificationObserver observer);
    public void unregisterObserver(NotificationObserver observer);
    public void notifyObservers();
}
