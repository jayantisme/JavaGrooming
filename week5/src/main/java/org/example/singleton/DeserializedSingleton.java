package org.example.singleton;

import java.io.*;

public class DeserializedSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Serialization
        SerializedSingleton instance1 = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("serializedSingletonObj.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialization
        ObjectInput in = new ObjectInputStream(new FileInputStream("serializedSingletonObj.ser"));
        SerializedSingleton instance2 = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("Instance 1 HashCode -> " + instance1.hashCode());
        System.out.println("Instance 2 HashCode -> " + instance2.hashCode());
        // We received different hashcode, singleton pattern is destroyed
        // To overcome this we need to provide implementation of readResolve() method.
    }
}
