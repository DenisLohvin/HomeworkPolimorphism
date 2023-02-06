package Polimorphism.participantsBarriars.barriars;

public class Wall implements Barrier {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getParameter() {
        return height;
    }

    @Override
    public String overcome() {
        return "wall";
    }
}
