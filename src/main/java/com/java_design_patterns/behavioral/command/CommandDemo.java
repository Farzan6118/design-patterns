package com.java_design_patterns.behavioral.command;

public class CommandDemo {

    public static void main(String[] args) {

        //-----------------------pick up the TV Remote

        ElectronicDevice TVOne = TVRemote.getDevice();

        //-----------------------Turn ON the TV

        TurnTVOn turnOnCommand = new TurnTVOn(TVOne);

        DeviceButton pressAButton = new DeviceButton(turnOnCommand);

        pressAButton.press();

        //-----------------------Volume UP

        TurnVolumeUp turnVolumeUp = new TurnVolumeUp(TVOne);

        pressAButton = new DeviceButton(turnVolumeUp);

        pressAButton.press();
        pressAButton.press();
        pressAButton.press();
        pressAButton.press();
        pressAButton.press();
        pressAButton.press();

        //-----------------------Volume DOWN

        TurnVolumeDown turnVolumeDown = new TurnVolumeDown(TVOne);

        pressAButton = new DeviceButton(turnVolumeDown);

        pressAButton.press();
        pressAButton.press();
        pressAButton.press();
        pressAButton.press();
        pressAButton.press();

        //-----------------------Turn OFF the TV

        TurnTVOff turnOffCommand = new TurnTVOff(TVOne);

        pressAButton = new DeviceButton(turnOffCommand);

        pressAButton.press();

        //-----------------------put aside the TV remote

        // TVOne = null;

    }

}
