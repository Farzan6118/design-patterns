package com.java_design_patterns.behavioral.command;

public class TVRemote {
    public static ElectronicDevice getDevice() {
        return new Television();
    }

}
