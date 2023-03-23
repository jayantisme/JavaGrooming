package org.example;

class Child extends Parent {

}
public class Modifier {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.show();
        Child obj = new Child();
        obj.displayPublic(); // Works Fine because of public access
        //obj.displayPrivate(); // Not accessible due to private access
    }
}


