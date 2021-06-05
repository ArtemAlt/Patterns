package FactoryMethod.interfaces;

import FactoryMethod.buttons.HTMLButton;

public class HTMLDialog extends Dialog {
    @Override
    public DialogButton createButton() {
        return new HTMLButton();
    }
}
