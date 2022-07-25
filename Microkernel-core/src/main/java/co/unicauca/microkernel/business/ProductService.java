package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.entities.Cerveza;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    public List<Cerveza> getAll() {

        List<Cerveza> products = new ArrayList<>();

        /*En un escenario normal, los productos vendrían de la capa de acceso a datos.
         * Para este ejemplo, se crearán objetos de prueba directamente aquí.
         * */
        Cerveza productOne = new Cerveza(1, "Play Station 4", 2.1);
        Cerveza productTwo = new Cerveza(2, "Xbox One", 3.2);
        Cerveza productThree = new Cerveza(2, "Wii U", 1.5);

        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);

        return products;
    }

}
