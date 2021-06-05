package FactoryMethod;

import AbstractFactory.Application;
import AbstractFactory.factories.LinuxFactoryImp;
import AbstractFactory.factories.WindowsFactoryImp;
import FactoryMethod.buttons.HTMLButton;
import FactoryMethod.buttons.WindowsButton;
import FactoryMethod.interfaces.DialogButton;

import java.util.Locale;

public class Main {
    private static DialogButton dialogButton;

    static void configure() {
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        switch (osName) {
            case ("html"):
                dialogButton = new HTMLButton();
                break;
            case ("windows"):
                dialogButton = new WindowsButton();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + osName);
        }
    }
    static void runApplication(){
        dialogButton.onClick();
        dialogButton.render();
    }

    public static void main(String[] args) {
        configure();
        runApplication();
    }
}
