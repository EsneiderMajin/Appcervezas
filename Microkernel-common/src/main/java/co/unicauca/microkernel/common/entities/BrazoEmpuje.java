/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.microkernel.common.entities;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class BrazoEmpuje extends Actuator{

  double estado=0;
    @Override
    public void actuar() {
      if(estado==1)
          JOptionPane.showMessageDialog(null, "No se activó el brazo");
         
      else
           JOptionPane.showMessageDialog(null, "Se activó el brazo");
    }
    
}
