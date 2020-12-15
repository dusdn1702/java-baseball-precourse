package baseball;

import java.util.List;

public class RandomNumbers {
    private static final int NUMBERS_SIZE = 3;

    private final List<RandomNumber> randomNumbers;

    public RandomNumbers(List<RandomNumber> randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    private void makeRandomNumbers() {
        for (int i = 0; i < NUMBERS_SIZE; i++) {
            randomNumbers.add(new RandomNumber());
        }
    }
}
