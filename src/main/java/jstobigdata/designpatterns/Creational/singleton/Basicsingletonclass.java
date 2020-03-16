package jstobigdata.designpatterns.singleton;

public class Basicsingletonclass {

    private static Basicsingletonclass obj = null;

    private Basicsingletonclass() {
    }

    public static Basicsingletonclass getInstance() {
        if (obj == null) {

            obj = new Basicsingletonclass();
        }
        return obj;
    }

}
