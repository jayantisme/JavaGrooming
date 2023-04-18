package org.example.singleton;

// In eager initialization, the instance of the singleton class is created at the time of class loading.
public class EagerInitializedSingleton {

    // The drawback of eager initialization is that the method is created even though the client
    // application might not be using it. Also, this method doesn't provide any option for
    // exception handling.
    private static EagerInitializedSingleton eagerSingleton = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
