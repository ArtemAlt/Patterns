package Prototype;

import java.util.Objects;

public class Circle extends Shape implements Cloneable{
    private int radius;

    public Circle() {

    }

    public Circle(Circle odj) {
        super(odj);
        this.radius = odj.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
