package Polimorphism.participantsBarriars;

import Polimorphism.participantsBarriars.barriars.Barrier;
import Polimorphism.participantsBarriars.partisipants.Participant;

public class Collaborator {
    public void collaborate(Participant[] participants, Barrier[] barriers) {
        if (participants == null || barriers == null
                || participants.length == 0 || barriers.length == 0) {
            System.out.println("Competition impossible! No participants or barriers");
            return;
        }
        for (Participant participant : participants) {
            if (participant == null) {
                continue;
            }
            for (Barrier barrier : barriers) {
                if (barrier == null) {
                    continue;
                }
                if (barrier.overcome().equals("wall")) {
                    participant.jump(barrier.getParameter());
                    if (barrier.getParameter() > participant.getMaxJumpHeight()) {
                        break;
                    }
                } else {
                    participant.run(barrier.getParameter());
                    if (barrier.getParameter() > participant.getMaxRunLength()) {
                        break;
                    }
                }
            }
        }
    }
}
