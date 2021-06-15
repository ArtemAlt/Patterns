package Adapter;

public class SquareBox {
    private Double wight;

    public Double getWight() {
        return wight;
    }

    public SquareBox(Double wight) {
        this.wight = wight;
    }
    public Double getSquare (){
        return Math.pow(this.getWight(),2);
    }
}
