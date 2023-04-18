package org.example.singleton;

public class CloneableSingleton implements Cloneable {
    private static CloneableSingleton instance;

    private CloneableSingleton() {
    }

    public static CloneableSingleton getInstance() {
        synchronized (CloneableSingleton.class) {
            if (instance == null) {
                instance = new CloneableSingleton();
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // If we do this clone of obj is created and singleton pattern is destroyed.
        //return super.clone();
        throw new CloneNotSupportedException();
        // We throw this exception to prevent object cloning.
    }

    public static void main(String[] args) {
        CloneableSingleton instance = CloneableSingleton.getInstance();
        try {
            CloneableSingleton clone = (CloneableSingleton) instance.clone();
        } catch (Exception e) {
            System.out.println("Can Not Clone Singleton Instance");
        }
    }
}
