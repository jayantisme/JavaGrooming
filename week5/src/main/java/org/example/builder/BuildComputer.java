package org.example.builder;

public class BuildComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("1 TB", "8 GB")
                .setGraphicCardMode(true)
//                .setWifiMode(true)
                .build();

        System.out.println("Computer Build With Specifications");
        System.out.println("HDD -> "+ computer.getHDD());
        System.out.println("RAM -> "+ computer.getRAM());
        System.out.println("Graphic Card Present -> "+ computer.isGraphicCardThere());
        System.out.println("WiFi Enabled? -> "+ computer.isWifiEnabled());
    }
}
