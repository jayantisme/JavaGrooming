package org.example.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton lazySingleton;

    private LazyInitializedSingleton() {
    }

    // It works fine in single threaded environment
    public static LazyInitializedSingleton getLazySingleton() {
        if (lazySingleton == null)
            lazySingleton = new LazyInitializedSingleton();
        return lazySingleton;
    }

    // If we use multiple thread it will break singleton pattern
    // Multiple threads will get different instance of singleton.
}
