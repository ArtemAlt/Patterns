package FactoryMethod.interfaces;

public abstract class Dialog {
    public  void renderMessageWindow(){
        DialogButton button = createButton();
        button.render();
    }
    public abstract DialogButton createButton();
}
