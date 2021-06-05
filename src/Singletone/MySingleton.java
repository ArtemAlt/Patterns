package Singletone;

public final class MySingleton {
    private static volatile MySingleton instance;
    private int value;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        MySingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (MySingleton.class) {
            if (instance == null) {
                instance = new MySingleton();
            }
            return instance;
        }
    }
    public void addValue(int value){
        this.value+=value;
    }
    public void printCurrentValue(){
        System.out.println("Current singleton value - "+this.value);
    }
}
