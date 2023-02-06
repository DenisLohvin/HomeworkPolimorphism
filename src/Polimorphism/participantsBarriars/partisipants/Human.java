package Polimorphism.participantsBarriars.partisipants;

public class Human implements Participant {
    private final String name;
    private final int maxRunLength;
    private final int maxJumpHeight;

    public Human(String name, int maxRunLength, int maxJumpHeight) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public int getMaxRunLength() {
        return maxRunLength;
    }

    @Override
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public void run(int length) {
        if (length >= 0 && length <= maxRunLength) {
            System.out.printf("Human %s ran sprint with length %dm.\n",
                    name, length);
        } else if (length > maxRunLength) {
            System.out.printf("Human %s did`t run sprint with length %dm. Just ran %dm.\n",
                    name, length, maxRunLength);
        } else {
            System.out.println("Length can not be negative!");
        }
    }

    @Override
    public void jump(int height) {
        if (height >= 0 && height <= maxJumpHeight) {
            System.out.printf("Human %s jumped over wall with height %dm.\n",
                    name, height);
        } else if (height > maxJumpHeight) {
            System.out.printf("Human %s did`t jump over wall with height %dm. Just jumped %dm.\n",
                    name, height, maxJumpHeight);
        } else {
            System.out.println("Height can not be negative!");
        }
    }
}
