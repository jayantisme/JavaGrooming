package org.example.abstractfactory;

public class PCFactory implements ComputerAbstractFactory{
    private String RAM;
    private String CPU;

    public PCFactory(String RAM, String CPU) {
        this.RAM = RAM;
        this.CPU = CPU;
    }
    @Override
    public Computer createComputer() {
        return new PC(RAM,CPU);
    }
}
