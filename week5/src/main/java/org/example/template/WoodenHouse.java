package org.example.template;

public class WoodenHouse extends HouseTemplate{
    @Override
    void buildPillars() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    void buildWalls() {
        System.out.println("Building Wooden Pillars");
    }
}
