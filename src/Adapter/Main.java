package Adapter;

public class Main {
    public static void main(String[] args) {
        RoundBag rBag = new RoundBag();
        rBag.setRadius(10D);
        RoundBox roundBox = new RoundBox(5D);
        SquareBox squareBox = new SquareBox(3D);
        SquareBoxAdapter adapter = new SquareBoxAdapter(squareBox);
        System.out.println(rBag.isFit(roundBox.getRadius()));
        System.out.println(rBag.isFit(adapter.getRadius()));


    }
}
