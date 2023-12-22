package DesignPatterns.Observer;

public class TabletNotificationObserver implements NotificationObserver{
    @Override
    public void update() {
        System.out.println("inside TabletNotificationObserver");
    }
}
