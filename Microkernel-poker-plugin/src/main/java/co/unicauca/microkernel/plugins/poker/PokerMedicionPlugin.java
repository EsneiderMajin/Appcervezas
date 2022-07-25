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
        
        //Cerveza product;
        //double weight = product.getWeight();
        
        //double estado;
    
    public double calculateCost(Medicion medicion) {
        
        
        Cerveza cerveza = medicion.getProduct();
        double estado;
        double weight = cerveza.getWeight();
       
        if(weight==330){
         estado=1;
        }
        else{
        estado=0;
        }
        return estado;
    }
}
