package jstobigdata.designpatterns.singleton;

public class EagerLoading {

    private static final EagerLoading obj = new EagerLoading();

    private EagerLoading() {
    }

    public static EagerLoading getInstance() {
        return obj;
    }
}
