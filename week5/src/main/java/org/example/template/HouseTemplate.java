package org.example.template;

public abstract class HouseTemplate {

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built successfully.");
    }

    public void buildWindows(){
        System.out.println("Building Windows");
    }

    abstract void buildPillars();
    abstract void buildWalls();

    private void buildFoundation(){
        System.out.println("Building Foundation");
    }

}
