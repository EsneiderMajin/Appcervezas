package co.unicauca.microkernel.common.entities;

import javax.swing.JOptionPane;

public class BrazoEmpuje extends Actuator {

    double estado = 0;

    @Override
    public void actuar() {
        if (estado == 1)
            JOptionPane.showMessageDialog(null, "No se activó el brazo");

        else
            JOptionPane.showMessageDialog(null, "Se activó el brazo");
    }

}