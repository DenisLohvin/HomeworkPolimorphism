package Polimorphism.participantsBarriars.barriars;

public class Sprint implements Barrier {
    private final int length;

    public Sprint(int length) {
        this.length = length;
    }

    @Override
    public int getParameter() {
        return length;
    }

    @Override
    public String overcome() {
        return  "sprint";
    }
}
