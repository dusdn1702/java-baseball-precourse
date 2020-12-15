package baseball;

import utils.RandomUtils;

public class RandomNumber {
    private static final int LOWER_BOUNDARY = 0;
    private static final int UPPER_BOUNDARY = 9;

    private final Integer randomNumber;

    public RandomNumber() {
        this.randomNumber = RandomUtils.nextInt(LOWER_BOUNDARY, UPPER_BOUNDARY);
    }
}
