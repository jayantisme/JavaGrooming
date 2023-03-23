package org.newPackage;
import org.example.*;  // Imported class from other package to explain
                      // default and protected

// Parent is extended in another package due to public access
// When parent had default access it was not accessible in another package
public class Test extends Parent{
    public static void main(String[] args) {
        Test obj = new Test();
        // protected modifier allows access in other packages also.
        obj.displayProtected();
    }
}

