package AbstractFactory.button;

import AbstractFactory.interfaces.Button;

public class LinuxButton implements Button {

    @Override
    public void paint() {
        System.out.println("Drawing Linux button");
    }
}
