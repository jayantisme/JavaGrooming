package org.example.singleton;


//  This is similar to eager initialized singleton, but static initialization provide the option
//  for exception handling.
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            System.out.println("Exception Occur");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
