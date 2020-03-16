package jstobigdata.designpatterns.factory;

public class ComboCreationLogic extends BasicCombo {

    @Override
    public Combo createCombo(String comboype) {

        Combo combo;

        switch (comboype) {
        case "office":
            combo = new OfficeCombo();
            break;
        case "casual":
            combo = new CasualCombo();
            break;
        case "casualoffice":
            combo = new CasualOfficeCombo();
            break;

        default:
            throw new IllegalArgumentException("No such product exitsts.");
        }

        combo.shirt();
        combo.trousers();
        combo.shoes();

        return combo;
    }

}
