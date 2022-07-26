package co.unicauca.microkernel.common.utilities;

import co.unicauca.microkernel.common.entities.Actuator;

/**
 *
 * @author PC
 */
public abstract class ItemMedicion {
    protected Sensor miSensor;
    protected Actuator miActuador;

    public void setSensor(Sensor sensor) {
        miSensor = sensor;
    }

    public void setActuador(Actuator actuador) {
        miActuador = actuador;
    }

}
