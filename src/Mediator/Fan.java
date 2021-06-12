package Mediator;

import Mediator.interfaces.PultMediator;

public class Fan {
    private final PultMediator pult;
    private boolean isOn = false;

    public Fan(PultMediator pult) {
        this.pult = pult;
    }

    public void turnOn() {
        pult.start();
        this.isOn = true;
    }

    public void turnOFF() {
        pult.stop();
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }
}
