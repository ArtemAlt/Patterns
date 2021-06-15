package Bridge.entity;

import Bridge.interfaces.Device;
import Bridge.interfaces.RemoteControl;

public class SimpleRemoteControl implements RemoteControl {
    public Device device;

    public SimpleRemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        if ((device.isEnable())) {
            device.switchOFF();
        } else {
            device.switchON();
        }
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        device.setChannel(device.getCurrentChannel() - 1);
    }

    @Override
    public void channelUp() {
        device.setChannel(device.getCurrentChannel() + 1);
    }
}
