package org.example.singleton;

public enum EnumSingleton {
    // enum value is instantiated only once
    // It does not allow lazy loading
    SINGLETON;
    public static void doSomething() {

    }
}
