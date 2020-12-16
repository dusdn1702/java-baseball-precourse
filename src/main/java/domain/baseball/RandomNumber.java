package domain.baseball;

import utils.RandomUtils;

public class RandomNumber {
    private static final int LOWER_BOUNDARY = 1;
    private static final int UPPER_BOUNDARY = 9;

    public static Integer makeRandomNumber() {
        return RandomUtils.nextInt(LOWER_BOUNDARY, UPPER_BOUNDARY);
    }
}
