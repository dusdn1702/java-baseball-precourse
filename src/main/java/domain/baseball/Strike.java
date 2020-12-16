package domain.baseball;

import static domain.Computer.INIT_COUNT;
import static domain.Computer.NOTHING;

public class Strike {
    public static final int ANSWER_OF_COUNT = 3;
    private static final String PRINT_STRIKE = "스트라이크 ";

    private int countOfStrikes;

    public Strike() {
        this.countOfStrikes = INIT_COUNT;
    }

    public void increaseStrikes() {
        countOfStrikes++;
    }

    public boolean isAnswer() {
        return countOfStrikes == ANSWER_OF_COUNT;
    }

    @Override
    public String toString() {
        if (countOfStrikes == INIT_COUNT) {
            return NOTHING;
        }
        return countOfStrikes + PRINT_STRIKE;
    }
}
