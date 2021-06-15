package Bridge.entity;

import Bridge.interfaces.Device;

public class TV implements Device {
    int DEFAULT_MAX_VOLUME_LEVEL = 100;
    private boolean on = false;
    private int volume = DEFAULT_MAX_VOLUME_LEVEL;
    private int channel = 1;
    @Override
    public boolean isEnable() {
        return on;
    }

    @Override
    public void switchON() {
        on = true;
    }

    @Override
    public void switchOFF() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int level) {
        if (level > DEFAULT_MAX_VOLUME_LEVEL) {
            this.volume = DEFAULT_MAX_VOLUME_LEVEL;
        } else if (level < 0) {
            this.volume = 0;
        } else this.volume = level;
    }

    @Override
    public int getCurrentChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void showStatus() {
        System.out.println("-----------------------");
        System.out.println("------It's TV-------");
        System.out.println("I'm "+(on? "enable":"disable"));
        System.out.println("Current volume level - "+volume);
        System.out.println("Current channel - "+channel);
        System.out.println("-----------------------");
    }
}
