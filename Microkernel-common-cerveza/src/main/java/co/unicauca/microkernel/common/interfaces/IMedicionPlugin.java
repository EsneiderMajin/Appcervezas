package co.unicauca.microkernel.common.interfaces;

import co.unicauca.microkernel.common.entities.Medicion;

public interface IMedicionPlugin {

    /**
     * Establece el costo de envi�o en dolares.
     *
     * @param delivery envi�o
     * @return costo del envi�o
     */
    double calculateCost(Medicion delivery);

}
