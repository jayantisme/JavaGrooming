package org.example.abstractfactory;

public class Main {
    public static final String RAM  = "2 GB";
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory(RAM, "2 GHz"));
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("8 GB", "2.9 GHz"));
        System.out.println("PC -> "+pc);
        System.out.println("Laptop -> "+laptop);
    }
}