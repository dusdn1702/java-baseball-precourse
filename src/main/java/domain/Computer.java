package domain;

import domain.baseball.Ball;
import domain.baseball.RandomNumbers;
import domain.baseball.Strike;

import static domain.baseball.RandomNumbers.NUMBERS_SIZE;

public class Computer {
    public static final int INIT_COUNT = 0;
    public static final String NOTHING = "";
    private static final String PRINT_NOTHING = "낫싱";

    private final Ball ball;
    private final Strike strike;

    public Computer() {
        this.ball = new Ball();
        this.strike = new Strike();
    }

    public String makeResult(RandomNumbers randomNumbers, Player player) {
        for (int i = 0; i < NUMBERS_SIZE; i++) {
            if (player.getNumberWithIndex(i).equals(randomNumbers.getNumber(i))) {
                this.strike.increaseStrikes();
                continue;
            }
            if (player.isSameThanAnyWhere(randomNumbers.getNumber(i))) {
                this.ball.increaseBalls();
            }
        }
        return getResult();
    }

    public String getResult() {
        if (this.ball.toString().equals(NOTHING) && this.strike.toString().equals(NOTHING)) {
            return PRINT_NOTHING;
        }
        return this.ball.toString() + this.strike.toString();
    }

    public boolean isAnswer() {
        return this.strike.isAnswer();
    }
}
