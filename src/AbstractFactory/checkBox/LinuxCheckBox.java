package AbstractFactory.checkBox;

import AbstractFactory.interfaces.CheckBox;

public class LinuxCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Drawing Linux CheckBox");
    }
}
