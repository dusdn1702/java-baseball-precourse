package domain.baseball;

import static domain.Computer.INIT_COUNT;
import static domain.Computer.NOTHING;

public class Ball {
    private static final String PRINT_BALL = "볼 ";

    private int countOfBalls;

    public Ball() {
        this.countOfBalls = INIT_COUNT;
    }

    public void increaseBalls() {
        countOfBalls++;
    }

    @Override
    public String toString() {
        if (countOfBalls == INIT_COUNT) {
            return NOTHING;
        }
        return countOfBalls + PRINT_BALL;
    }
}
