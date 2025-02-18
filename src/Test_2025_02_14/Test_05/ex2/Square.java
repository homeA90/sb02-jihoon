package src.Test_2025_02_14.Test_05.ex2;

public class Square implements Shape {

    private int side;

    public Square(int side) {
        setSide(side);
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("side must be > 0");
        }
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
