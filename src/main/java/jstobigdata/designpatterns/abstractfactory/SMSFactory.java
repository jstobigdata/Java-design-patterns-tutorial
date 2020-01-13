package jstobigdata.designpatterns.abstractfactory;

public class SMSFactory implements Notificationtype {

    public SMSFactory() {

    }

    public Notification getSMS(String sms) {

        if (sms == null) {
            return null;
        }
        if (sms.equalsIgnoreCase("personal")) {
            return new PersonalMpbile();
        } else if (sms.equalsIgnoreCase("office")) {
            return new OfficeMpbile();
        }

        return null;
    }

    public Notification getEmail(String str) {
        // TODO Auto-generated method stub
        return null;
    }

}
