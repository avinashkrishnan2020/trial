package DesignPatterns.Observer;

public class MobileNotificationObserver implements NotificationObserver{
    @Override
    public void update() {
        System.out.println("inside mobileNotificationObserver");
    }
}
