package jstobigdata.designpatterns.abstractfactory;

public class Client {

    public static void main(String[] args) {

        // Can provede sms or email parameter which will be the condition.
        Notificationtype nfType = NotificationFactoryBuilder.getNotificationType("sms");

        // code for push email notification
       
        // Notification emailnotify = nfType.getEmail("personal");
        // tring notificationResponse = emailnotify.pushNotification();

//        code for sms notification

        Notification smsnotify = nfType.getSMS("office");
        String notificationResponse = smsnotify.pushNotification();

        System.out.println(notificationResponse);
    }
}
