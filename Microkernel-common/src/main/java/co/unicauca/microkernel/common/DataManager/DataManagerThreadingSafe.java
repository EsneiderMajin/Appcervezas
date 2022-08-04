package co.unicauca.microkernel.common.DataManager;

public class DataManagerThreadingSafe {
    // Volatile is present so that whenever someone accesses this value.
    // We fetch it from memory and not cache. This is done because multiple threads
    // are involved.
    private volatile static DataManagerThreadingSafe dataManager;

    public static DataManagerThreadingSafe getInstance() {
        if (dataManager == null) {
            synchronized (DataManagerThreadingSafe.class) {
                if (dataManager == null)
                    dataManager = new DataManagerThreadingSafe();
            }
        }
        return dataManager;
    }

    private DataManagerThreadingSafe() {
    }
}