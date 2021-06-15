package Bridge.interfaces;

public interface Device {
    boolean isEnable();
    void switchON();
    void switchOFF();
    int getVolume();
    void setVolume( int level);
    int getCurrentChannel();
    void setChannel(int channel);
    void showStatus();

}
