/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.microkernel.utilities;

import co.unicauca.microkernel.common.entities.Actuator;

/**
 *
 * @author PC
 */
public abstract class ItemMedicion {
    protected Sensor miSensor;
 protected Actuator miActuador;
 
 public void setSensor(Sensor sensor) {
 miSensor=sensor;
 }
 public void setActuador(Actuator actuador) {
 miActuador = actuador;
 }

    public Sensor getMiSensor() {
        return miSensor;
    }

    public Actuator getMiActuador() {
        return miActuador;
    }
}
