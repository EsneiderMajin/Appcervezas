/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.microkernel.plugins.poker;

import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.common.entities.Cerveza;
import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;

/**
 *
 * @author PC
 */
public class PokerMedicionPlugin implements IMedicionPlugin{
        
       Cerveza product;
       double estado=0;
      
       
       
        @Override
    public double calculateMedicion(Medicion delivery) {
        
       
   product= delivery.getProduct();
   
   if((product.getWeight()>=330)&& (product.getWeight()<=338)){

       estado=1;
   }
   
   return estado ;
}
}
