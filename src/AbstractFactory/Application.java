package AbstractFactory;

import AbstractFactory.interfaces.AbstractFactory;
import AbstractFactory.interfaces.Button;
import AbstractFactory.interfaces.CheckBox;

public class Application {
    public Button button;
    public CheckBox checkBox;

    public Application(AbstractFactory factory){
        button= factory.createButton();
        checkBox= factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }

}
