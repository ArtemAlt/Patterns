package FactoryMethod.buttons;

import FactoryMethod.interfaces.DialogButton;

public class WindowsButton implements DialogButton {
    @Override
    public void onClick() {
        System.out.println("Click window button");
    }

    @Override
    public void render() {
        System.out.println("Render window button");

    }
}
