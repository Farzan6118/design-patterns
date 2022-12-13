package com.java_design_patterns.behavioral.command;

public class DeviceButton {
    private final Command theCommand;

    public DeviceButton(Command theCommand) {
        this.theCommand = theCommand;
    }

    public void press() {

        theCommand.execute();

    }

}