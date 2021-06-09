package Bridge;

import Bridge.entity.NewModelRemoteControl;
import Bridge.entity.Radio;
import Bridge.entity.SimpleRemoteControl;
import Bridge.entity.TV;
import Bridge.interfaces.Device;

public class Main {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());

    }

    public static void testDevice(Device device) {
        System.out.println("Test with simple remote control:");
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl(device);
        simpleRemoteControl.channelUp();
        simpleRemoteControl.volumeUp();
        device.showStatus();
        System.out.println("Test with new model remote:");
        NewModelRemoteControl newModelRemoteControl = new NewModelRemoteControl(device);
        newModelRemoteControl.mute();
        device.showStatus();
    }
}
