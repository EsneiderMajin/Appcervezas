/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.microkernel.common.entities;

import javax.swing.JOptionPane;



public class BrazoEmpuje extends Actuator{

    @Override
    public void actuar(double estado) {
      if(estado!=1)
        JOptionPane.showMessageDialog(null, "Se activó el brazo");
      else
        JOptionPane.showMessageDialog(null, "No se activó el brazo");
    }
}
