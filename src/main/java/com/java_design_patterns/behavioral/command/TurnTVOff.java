package com.java_design_patterns.behavioral.command;

public class TurnTVOff implements Command {
    private final ElectronicDevice electronicDevice;

    public TurnTVOff(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {

        electronicDevice.off();

    }
}