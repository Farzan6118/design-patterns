package com.java_design_patterns.behavioral.command;

public class TurnTVOn implements Command {
    private final ElectronicDevice electronicDevice;

    public TurnTVOn(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {

        electronicDevice.on();

    }
}