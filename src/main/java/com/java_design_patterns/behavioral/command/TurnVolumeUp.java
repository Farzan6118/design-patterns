package com.java_design_patterns.behavioral.command;

public class TurnVolumeUp implements Command {
    private final ElectronicDevice electronicDevice;

    public TurnVolumeUp(ElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {

        electronicDevice.volumeUp();

    }
}