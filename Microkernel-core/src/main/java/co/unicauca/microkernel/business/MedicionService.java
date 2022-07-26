package co.unicauca.microkernel.business;

import co.unicauca.microkernel.common.entities.Medicion;
import co.unicauca.microkernel.plugin.manager.PluginManager;
import co.unicauca.microkernel.common.interfaces.IMedicionPlugin;

public class MedicionService {

    public double calculateDeliveryCost(Medicion deliveryData) throws Exception {

        String countryCode = deliveryData.getCode();
        PluginManager manager = PluginManager.getInstance();
        IMedicionPlugin plugin = manager.getDeliveryPlugin(countryCode);

        if (plugin == null) {
            throw new Exception("No hay un plugin disponible para la cerveza indicada indicada: " + countryCode);
        }
        
        
        
        return plugin.calculateMedicion(deliveryData);

    }

}
