package Facade.entity;

public class GPSService {
   private GPSAdvisor advisor=new GPSAdvisor();
    private GPSInformer informer=new GPSInformer();
    private GPSPower power=new GPSPower();

    public GPSService(GPSAdvisor advisor, GPSInformer informer, GPSPower power) {
        this.advisor = advisor;
        this.informer = informer;
        this.power = power;
    }
    public void activateGPS(){
        power.powerOn();
        informer.downloadRoadInfo();
        advisor.crateRoute();
    }
}
