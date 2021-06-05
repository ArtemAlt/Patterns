package AbstractFactory.factories;

import AbstractFactory.button.LinuxButton;
import AbstractFactory.checkBox.LinuxCheckBox;
import AbstractFactory.interfaces.AbstractFactory;
import AbstractFactory.interfaces.Button;
import AbstractFactory.interfaces.CheckBox;

public class LinuxFactoryImp implements AbstractFactory {


    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }
}
