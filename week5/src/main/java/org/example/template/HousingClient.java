package org.example.template;

public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate house = new ConcreteHouse();
        // Building Concrete House
        house.buildHouse();
        System.out.println("*****BUILD SUCCESSFUL*****");
        house = new WoodenHouse();
        // Building Wooden House
        house.buildHouse();
    }
}
