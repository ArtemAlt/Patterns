package Mediator;

import Mediator.interfaces.PultMediator;

public class Button {
    private final PultMediator pult;

    public Button(PultMediator pult) {
        this.pult = pult;
    }

    public void press(){
        pult.press();
    }
}
