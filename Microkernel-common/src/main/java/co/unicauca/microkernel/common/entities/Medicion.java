package co.unicauca.microkernel.common.entities;

/**
 * Envio
 * @author Libardo, Julio
 */
public class Medicion {

    private Cerveza product;
    private double peso;
    /**
     * Código del país donde será entregado el producto.
     * */
    private String code;

    public Medicion(Cerveza product, double peso, String countryCode) {
        this.product = product;
        this.peso = peso;
        this.code = countryCode;
         
    }

    public Cerveza getProduct() {
        return product;
    }

    public void setProduct(Cerveza product) {
        this.product = product;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
}
