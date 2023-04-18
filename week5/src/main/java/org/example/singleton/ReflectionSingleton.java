package org.example.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {
    public static void main(String[] args) {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getEagerSingleton();
        EagerInitializedSingleton instance2 = null;
        try {
            Constructor[] constructors  = EagerInitializedSingleton.class.getConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy singleton pattern
                constructor.setAccessible(true);
                instance2 = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            System.out.println("Exception Occur");
        }
        // Both hashCodes are different. Singleton pattern is destroyed
        // To Overcome this we use Enum
        System.out.println("Instance 1 " + instance1.hashCode());
        System.out.println("Instance 2 " + instance2.hashCode());
    }
}
