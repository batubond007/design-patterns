package main;

public class DCLSingleton {
    private static volatile DCLSingleton instance;
    private int value;

    public static DCLSingleton getInstance() {
        var result = instance;
        if (result != null) {
            return result;
        }

        synchronized (DCLSingleton.class) {
            if (instance == null) {
                instance = new DCLSingleton();
            }
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
