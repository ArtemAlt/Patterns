package Singletone;

public class Main {
    static class AddThread implements Runnable{
        @Override
        public void run() {
            MySingleton c = MySingleton.getInstance();
            c.addValue(100);
        }
    }
    public static void main(String[] args) {
        MySingleton c1 = MySingleton.getInstance();
        MySingleton c2 = MySingleton.getInstance();
        MySingleton c3 = MySingleton.getInstance();
        c1.addValue(10);
        c1.printCurrentValue();
        c2.addValue(10);
        c2.printCurrentValue();
        c3.addValue(10);
        c3.printCurrentValue();


        Thread first = new Thread(new AddThread());
        Thread second = new Thread(new AddThread());
        Thread third = new Thread(new AddThread());
        first.start();
        second.start();
        third.start();
        // checking for multithreading should add just once

        c1.printCurrentValue();
        c2.printCurrentValue();
        c3.printCurrentValue();




    }
}
