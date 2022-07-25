package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.plugin.manager.PluginManager;
import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;

public class DeliveryService {

    public double calculateDeliveryCost(Medicion deliveryData) throws Exception {

        String countryCode = deliveryData.getCountryCode();
        PluginManager manager = PluginManager.getInstance();
        IMedicionPlugin plugin = manager.getDeliveryPlugin(countryCode);

        if (plugin == null) {
            throw new Exception("No hay un plugin disponible para el país indicado: " + countryCode);
        }

        return plugin.calculateCost(deliveryData);

    }

}
