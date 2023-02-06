package Polimorphism.figures;

public class Square implements Figure {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        if (side >= 0) {
            return side * side;
        }
        return 0;
    }
}
