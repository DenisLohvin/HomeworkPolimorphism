package Polimorphism.figures;

public class SquareCounter {
    public void getSumSquares(Figure[] figures) {
        if (figures == null || figures.length == 0) {
            System.out.println("No figures!");
            return;
        }
        double sumSquares = 0;
        for (Figure figure : figures) {
            sumSquares += figure != null ? figure.getSquare() : 0;
        }
        System.out.println(sumSquares);
    }
}
