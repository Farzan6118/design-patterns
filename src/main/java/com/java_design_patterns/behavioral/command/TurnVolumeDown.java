package com.java_design_patterns.behavioral.command;

public class TurnVolumeDown implements Command {
    private final ElectronicDevice electronicDevice;

    public TurnVolumeDown(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {

        electronicDevice.volumeDown();

    }
}