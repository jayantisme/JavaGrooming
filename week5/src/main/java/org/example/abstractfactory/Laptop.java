package org.example.abstractfactory;

public class Laptop extends Computer {

    private String RAM;
    private String CPU;

    public Laptop(String RAM, String CPU) {
        this.RAM = RAM;
        this.CPU = CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }
}
