package Mediator;

import Mediator.interfaces.PultMediator;

public class PultVCelofane implements PultMediator {
    private Button button;
    private Fan fan;
    private PowerAdapter adapter;

    @Override
    public void press() {
        if(fan.isOn()){
            fan.turnOFF();
        } else fan.turnOn();

    }
    public void start(){
        adapter.on();
    }

    public void stop(){
        adapter.off();
    }

}
