package org.example.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    // Bill Pugh Singleton Implementation
    // It can be used for multiple threads, it doesn't require synchronized keyword
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    // Whenever we deserialize, this will create new instance and break singleton pattern
    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    // After providing readResolve() method implementation, we get same hashcode.
    protected Object readResolve() {
        return getInstance();
    }

}
