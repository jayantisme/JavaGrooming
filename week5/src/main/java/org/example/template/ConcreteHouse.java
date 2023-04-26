package org.example.template;

public class ConcreteHouse extends HouseTemplate{
    @Override
    void buildPillars() {
        System.out.println("Building Concrete Pillars");
    }

    @Override
    void buildWalls() {
        System.out.println("Building Concrete Walls");
    }
}
