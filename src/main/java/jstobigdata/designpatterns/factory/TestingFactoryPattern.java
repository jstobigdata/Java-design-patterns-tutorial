package jstobigdata.designpatterns.factory;

public class TestingFactoryPattern {

    public static void main(String[] args) {
        
        BasicCombo comboplan = new ComboCreationLogic();
        Combo officecombo = comboplan.createCombo("office");
        Combo casualcombo = comboplan.createCombo("casual");
        Combo officecasualcombo = comboplan.createCombo("casualoffice");
        
        //https://examples.javacodegeeks.com/factory-pattern-java-example/
    }
}
