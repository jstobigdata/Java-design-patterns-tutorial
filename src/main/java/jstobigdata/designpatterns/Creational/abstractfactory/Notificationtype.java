package jstobigdata.designpatterns.abstractfactory;

public interface Notificationtype {
    public Notification getEmail(String str);

    public Notification getSMS(String str);
}
