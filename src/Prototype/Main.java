package Prototype;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setX(1);
        c1.setY(2);
        c1.setColor("red");
        c1.setRadius(10);

        Circle c2 = c1.clone();
        System.out.println(c1.equals(c2));
        c2.setColor("black");
        System.out.println(c1.equals(c2));
        c2.setRadius(20);
        System.out.println(c1.equals(c2));

    }


}
