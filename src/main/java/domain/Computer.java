package domain;

import domain.baseball.BallStrike;
import domain.baseball.RandomNumbers;

import static domain.baseball.RandomNumbers.NUMBERS_SIZE;

public class Computer {
    private final BallStrike ballStrike;

    public Computer() {
        this.ballStrike = new BallStrike();
    }

    public String makeResult(RandomNumbers randomNumbers, Player player) {
        for (int i = 0; i < NUMBERS_SIZE; i++) {
            if (player.giveNumber(i).equals(randomNumbers.giveNumber(i))) {
                this.ballStrike.increaseStrikes();
                continue;
            }
            if (player.isSameThanAnyWhere(randomNumbers.giveNumber(i))) {
                this.ballStrike.increaseBalls();
            }
        }
        return getResult();
    }

    public String getResult() {
        if (this.ballStrike.toStringBall().equals("") && this.ballStrike.toStringStrike().equals("")) {
            return "낫싱";
        }
        return this.ballStrike.toStringBall() + this.ballStrike.toStringStrike();
    }

    public boolean isAnswer() {
        return this.ballStrike.isAnswer();
    }
}
