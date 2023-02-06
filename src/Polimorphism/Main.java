package Polimorphism;

import Polimorphism.participantsBarriars.Collaborator;
import Polimorphism.participantsBarriars.barriars.Barrier;
import Polimorphism.participantsBarriars.barriars.Sprint;
import Polimorphism.participantsBarriars.barriars.Wall;
import Polimorphism.participantsBarriars.partisipants.Cat;
import Polimorphism.participantsBarriars.partisipants.Human;
import Polimorphism.participantsBarriars.partisipants.Participant;
import Polimorphism.participantsBarriars.partisipants.Robot;
import Polimorphism.figures.Circle;
import Polimorphism.figures.Figure;
import Polimorphism.figures.Square;
import Polimorphism.figures.SquareCounter;
import Polimorphism.figures.Triangle;

public class Main {

    public static void main(String[] args) {
        SquareCounter squareCounter = new SquareCounter();
        Figure circle = new Circle(5);
        Figure triangle = new Triangle(7, 6, 9);
        Figure square = new Square(7);
        Figure[] figures = {circle, triangle, square};
        squareCounter.getSumSquares(figures);

        Collaborator collaborator = new Collaborator();
        Participant cat = new Cat("Leopold", 200, 2);
        Participant human = new Human("Denis", 751, 4);
        Participant robot = new Robot("Terminator", 853, 12);
        Participant[] participants = {cat, human, robot};
        Barrier sprint = new Sprint(50);
        Barrier wall = new Wall(11);
        Barrier[] barriers = {sprint, wall};
        collaborator.collaborate(participants, barriers);
    }
}
