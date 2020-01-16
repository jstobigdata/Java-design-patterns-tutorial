package jstobigdata.designpatterns.singleton;

public class StaticblockSingleton {

    private static StaticblockSingleton obj;

    private StaticblockSingleton() {
    }

    static {
        try {
            obj = new StaticblockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Something is Bad while creating singleton object");
        }
    }

    public static StaticblockSingleton getInstance() {
        return obj;
    }

}
