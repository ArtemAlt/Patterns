package Facade;

import Facade.entity.GPSAdvisor;
import Facade.entity.GPSInformer;
import Facade.entity.GPSPower;
import Facade.entity.GPSService;

public class Main {
    public static void main(String[] args) {
        GPSAdvisor advisor=new GPSAdvisor();
        GPSInformer informer=new GPSInformer();
        GPSPower power=new GPSPower();
        GPSService gpsService = new GPSService(advisor,informer,power);
        gpsService.activateGPS();
        power.powerOFF();
    }
}
