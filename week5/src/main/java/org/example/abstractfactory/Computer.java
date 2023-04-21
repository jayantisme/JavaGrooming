package org.example.abstractfactory;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM = "+this.getRAM()+"\nCPU = "+this.getCPU();
    }
}
