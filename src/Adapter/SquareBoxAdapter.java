package Adapter;

public class SquareBoxAdapter extends RoundBag{
    private SquareBox box;

    public SquareBoxAdapter(SquareBox box) {
      this.box=box;
    }

    @Override
    public Double getRadius(){
        return (Math.sqrt(Math.pow((box.getWight() / 2), 2) * 2));
    }
}
