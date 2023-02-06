package Polimorphism.participantsBarriars.partisipants;

public class Robot implements Participant {
    private  String name;
    private int maxRunLength;
    private int maxJumpHeight;

    public Robot(String name, int maxRunLength, int maxJumpHeight) {
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
            System.out.printf("Robot %s ran sprint with length %dm.\n",
                    name, length);
        } else if (length > maxRunLength) {
            System.out.printf("Robot %s did`t run sprint with length %dm. Just ran %dm.\n",
                    name, length, maxRunLength);
        } else {
            System.out.println("Length can`t be negative. Change parameter!");
        }
    }

    @Override
    public void jump(int height) {
        if (height >= 0 && height <= maxJumpHeight) {
            System.out.printf("Robot %s jumped over wall with height %dm.\n",
                    name, height);
        } else if (height > maxJumpHeight) {
            System.out.printf("Robot %s did`t jump over wall with height %dm. Just jumped %dm.\n",
                    name, height, maxJumpHeight);
        } else {
            System.out.println("Height can`t be negative. Change parameter!");
        }
    }
}
