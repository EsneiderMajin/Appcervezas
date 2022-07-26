package co.unicauca.microkernel.common.entities;

import co.unicauca.microkernel.utilities.ItemMedicion;


public class Cerveza extends ItemMedicion {

    private int productId;
    private String name;
    

    /**
     * Peso del producto, en ml.
     *
     */
    private double weight;


    public Cerveza() {

    }

    public Cerveza(int productId, String name, double weight) {
        this.productId = productId;
        this.name = name;
        this.weight = weight;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
       
    
    
}
