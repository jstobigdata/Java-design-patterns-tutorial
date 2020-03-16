package jstobigdata.designpatterns.singleton;

public class SingletonwithDoubleChecked {

    private SingletonwithDoubleChecked obj = null;

    private SingletonwithDoubleChecked() {
    }

    public SingletonwithDoubleChecked getInstance() {

        if (obj == null) {
            synchronized (obj) {
                obj = new SingletonwithDoubleChecked();
            }
        }
        return obj;
    }
}
