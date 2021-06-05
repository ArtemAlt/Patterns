package AbstractFactory.interfaces;

import AbstractFactory.interfaces.Button;
import AbstractFactory.interfaces.CheckBox;

public interface AbstractFactory {
    Button createButton();
    CheckBox createCheckBox();
}
