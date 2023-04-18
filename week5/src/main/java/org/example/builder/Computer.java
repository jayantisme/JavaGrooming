package org.example.builder;

public class Computer {
    // required fields
    private String HDD;
    private String RAM;

    // optional fields
    private boolean isGraphicCardThere;
    private boolean isWifiEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicCardThere() {
        return isGraphicCardThere;
    }

    public boolean isWifiEnabled() {
        return isWifiEnabled;
    }

    private Computer(ComputerBuilder computerBuilder) {
        this.HDD = computerBuilder.HDD;
        this.RAM = computerBuilder.RAM;
        this.isGraphicCardThere = computerBuilder.isGraphicCardThere;
        this.isWifiEnabled = computerBuilder.isWifiEnabled;
    }

    public static class ComputerBuilder{
        //required field
        private String HDD;
        private String RAM;

        // optional fields
        private boolean isGraphicCardThere;
        private boolean isWifiEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }
        public ComputerBuilder setGraphicCardMode(boolean isGraphicCardThere){
            this.isGraphicCardThere = isGraphicCardThere;
            return this;
        }
        public ComputerBuilder setWifiMode(boolean isWifiEnabled) {
            this.isWifiEnabled = isWifiEnabled;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
