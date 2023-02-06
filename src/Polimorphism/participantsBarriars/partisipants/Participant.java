package Polimorphism.participantsBarriars.partisipants;

public interface Participant {
    void run(int length);

    void jump(int height);

    int getMaxRunLength();

    int getMaxJumpHeight();
}
