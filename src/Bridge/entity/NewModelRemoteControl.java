package Bridge.entity;

import Bridge.interfaces.Device;

public class NewModelRemoteControl extends SimpleRemoteControl{

    public NewModelRemoteControl(Device device) {
        super(device);
    }

    public void mute(){
        device.setVolume(0);

    }
}
