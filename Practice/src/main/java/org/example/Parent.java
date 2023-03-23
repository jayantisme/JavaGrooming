package org.example;

public class Parent {
    private void displayPrivate() {
        System.out.println("Private Display Method");
    }

    public void show() {
        displayPrivate(); // Private members & methods are only accessible inside class
    }

    protected void displayProtected() {
        System.out.println("Private Display Method");
    }

    public void displayPublic() {
        System.out.println("Public Display Method");
    }
}
