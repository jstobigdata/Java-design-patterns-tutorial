package jstobigdata.designpatterns.abstractfactory;

//Abstract factory class
public class NotificationFactoryBuilder {

    public static Notificationtype getNotificationType(String notification) {

        if (notification.equalsIgnoreCase("Email")) {
            return new EmailFactory();
        } else if (notification.equalsIgnoreCase("SMS")) {
            return new SMSFactory();

        }
        return null;
    }
}
