package jstobigdata.designpatterns.singleton;

public class BullPughApproach {

    private BullPughApproach() {}
    private static class Singlehelper{
        private static final BullPughApproach obj = new BullPughApproach();
    }
    public static BullPughApproach getInstance() {
        return Singlehelper.obj;
    }    
}
