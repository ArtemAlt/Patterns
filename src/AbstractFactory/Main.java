package AbstractFactory;

import AbstractFactory.factories.LinuxFactoryImp;
import AbstractFactory.factories.WindowsFactoryImp;
import AbstractFactory.interfaces.AbstractFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class Main {

    private static Application config(){
        Application app;
        AbstractFactory factory;
        String osName = System.getProperty("os.name").toLowerCase(Locale.ROOT);

       switch (osName){
           case ("linux"):
               factory=new LinuxFactoryImp();
               app=new Application(factory);
               break;
           case ("windows"):
               factory=new WindowsFactoryImp();
               app=new Application(factory);
               break;
           default:
               throw new IllegalStateException("Unexpected value: " + osName);
       }
       return app;
    }

    public static void main(String[] args) {
        Application application = config();
        application.paint();

    }



}
