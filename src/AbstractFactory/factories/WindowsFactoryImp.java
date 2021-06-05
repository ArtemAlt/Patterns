package AbstractFactory.factories;

import AbstractFactory.button.WindowsButton;
import AbstractFactory.checkBox.WindowsCheckBox;
import AbstractFactory.interfaces.AbstractFactory;
import AbstractFactory.interfaces.Button;
import AbstractFactory.interfaces.CheckBox;

public class WindowsFactoryImp implements AbstractFactory {


    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
