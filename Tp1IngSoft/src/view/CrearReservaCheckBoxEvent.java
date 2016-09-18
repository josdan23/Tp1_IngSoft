package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

/**
 *
 * @author Pablo Fernández
 */
public class CrearReservaCheckBoxEvent implements ActionListener {

    private CrearReserva view;

    public CrearReservaCheckBoxEvent(CrearReserva view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "BUTACA_1":
                this.agregarButaca(1, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_2":
                this.agregarButaca(2, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_3":
                this.agregarButaca(3, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_4":
                this.agregarButaca(4, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_5":
                this.agregarButaca(5, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_6":
                this.agregarButaca(6, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_7":
                this.agregarButaca(7, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_8":
                this.agregarButaca(8, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_9":
                this.agregarButaca(9, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_10":
                this.agregarButaca(10, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_11":
                this.agregarButaca(11, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_12":
                this.agregarButaca(12, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_13":
                this.agregarButaca(13, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_14":
                this.agregarButaca(14, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_15":
                this.agregarButaca(15, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_16":
                this.agregarButaca(16, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_17":
                this.agregarButaca(17, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_18":
                this.agregarButaca(18, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_19":
                this.agregarButaca(19, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_20":
                this.agregarButaca(20, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_21":
                this.agregarButaca(21, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_22":
                this.agregarButaca(22, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_23":
                this.agregarButaca(23, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_24":
                this.agregarButaca(24, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_25":
                this.agregarButaca(25, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_26":
                this.agregarButaca(26, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_27":
                this.agregarButaca(27, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_28":
                this.agregarButaca(28, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_29":
                this.agregarButaca(29, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_30":
                this.agregarButaca(30, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_31":
                this.agregarButaca(31, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_32":
                this.agregarButaca(32, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_33":
                this.agregarButaca(33, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_34":
                this.agregarButaca(34, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_35":
                this.agregarButaca(35, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_36":
                this.agregarButaca(36, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_37":
                this.agregarButaca(37, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_38":
                this.agregarButaca(38, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_39":
                this.agregarButaca(39, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_40":
                this.agregarButaca(40, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_41":
                this.agregarButaca(41, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_42":
                this.agregarButaca(42, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_43":
                this.agregarButaca(43, ((JCheckBox) e.getSource()));
                break;
            case "BUTACA_44":
                this.agregarButaca(44, ((JCheckBox) e.getSource()));
                break;
        }
    }

    private void agregarButaca(int nroButaca, JCheckBox butaca) {
        if (butaca.isSelected()) {
            this.view.getPresentador().seleccionarButaca(nroButaca);
        }
    }
}
