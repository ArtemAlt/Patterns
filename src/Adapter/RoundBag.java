package Adapter;

public class RoundBag {
    private Double radius;

    public Double getRadius() {
        return radius;
    }


    public boolean isFit(Double radius){
        return (radius<= this.getRadius());
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }
}
