package AbstractFactory.checkBox;

import AbstractFactory.interfaces.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Drawing Windows CheckBox");
    }
}
