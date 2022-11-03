package com.java_design_patterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();

        System.out.printf("Computer Spec%nHDD: %s%nRAM: %s%nHas Bluetooth: %b%nHas Graphics Card: %b%n",
                computer.getHDD(), computer.getRAM(), computer.isBluetoothEnabled(), computer.isGraphicsCardEnabled());
    }
}
