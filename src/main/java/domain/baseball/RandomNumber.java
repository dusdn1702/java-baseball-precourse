package domain.baseball;

import utils.RandomUtils;

public class RandomNumber {
    private static final int LOWER_BOUNDARY = 0;
    private static final int UPPER_BOUNDARY = 9;

    private static Integer randomNumber;

    public RandomNumber() {
        randomNumber = RandomUtils.nextInt(LOWER_BOUNDARY, UPPER_BOUNDARY);
    }

    public static boolean isSameThan(Integer comparedNumber) {
        return randomNumber.equals(comparedNumber);
    }
}
