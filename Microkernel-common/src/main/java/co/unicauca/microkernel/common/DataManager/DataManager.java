package co.unicauca.microkernel.common.DataManager;

import co.unicauca.microkernel.common.entities.Cerveza;

public class DataManager extends Cerveza {
    private static Cerveza dataManager;

    public static DataManager getInstance() {
        if (dataManager == null) {
            dataManager = new DataManager();
        }
        return (DataManager) dataManager;
    }

    private DataManager() {
    }
}
