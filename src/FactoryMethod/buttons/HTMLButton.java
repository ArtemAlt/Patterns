package FactoryMethod.buttons;

import FactoryMethod.interfaces.DialogButton;

public class HTMLButton implements DialogButton {
    @Override
    public void onClick() {
        System.out.println("Click HTML button");
    }

    @Override
    public void render() {
        System.out.println("Render HTML button");

    }
}
