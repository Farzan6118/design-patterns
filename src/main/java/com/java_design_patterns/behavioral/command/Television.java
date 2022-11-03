package com.java_design_patterns.behavioral.command;

public class Television implements ElectronicDevice {
    private int volume = 0;

    @Override
    public void on() {
        System.out.println("TV is ON");
    }

    @Override
    public void off() {
        System.out.println("TV is OFF");

    }

    @Override
    public void volumeUp() {
        if (volume < 4) {
            volume++;
        }
        if (volume == 4) {
            System.out.println("TV Volume is at MAX ");
        } else {
            System.out.println("TV Volume is at " + volume);
        }
    }

    @Override
    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
        if (volume == 0) {
            System.out.println("TV Volume is MUTE ");
        } else {
            System.out.println("TV Volume is at " + volume);
        }

    }
}