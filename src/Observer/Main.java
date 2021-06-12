package Observer;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.subscribe(new BigDisplay());
        sensor.subscribe(new SmallDisplay());

        sensor.setT(100);
    }
}
