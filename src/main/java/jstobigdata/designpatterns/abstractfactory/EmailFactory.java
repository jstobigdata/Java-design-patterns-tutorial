package jstobigdata.designpatterns.abstractfactory;
//Factory class responsible to generate the concrete classes
public class EmailFactory implements Notificationtype {

    public Notification getEmail(String email) {
        if (email == null) {
            return null;
        }
        if (email.equalsIgnoreCase("personal")) {
            return new PersonalEmail();
        } else if (email.equalsIgnoreCase("office")) {
            return new OfficeEmail();
        }
        return null;
    }

    public Notification getSMS(String sms) {
        return null;
    }

}
