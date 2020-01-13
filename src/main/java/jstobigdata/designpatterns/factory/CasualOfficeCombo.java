package jstobigdata.designpatterns.factory;

public class CasualOfficeCombo extends Combo {
    @Override
    public void shirt() {

        System.out.println("Add Shirt into the cart from common category.");

    }

    @Override
    public void trousers() {
        System.out.println("Add trouser into the cart from common category.");

    }

    @Override
    public void shoes() {
        System.out.println("Add shoes into the cart form common category");
    }

}
