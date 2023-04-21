package org.example.abstractfactory;

public class LaptopFactory implements ComputerAbstractFactory{
    private String RAM;
    private String CPU;

    public LaptopFactory(String RAM, String CPU) {
        this.RAM = RAM;
        this.CPU = CPU;
    }
    @Override
    public Computer createComputer() {
        return new Laptop(RAM,CPU);
    }
}
