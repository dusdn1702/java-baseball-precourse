package domain.baseball;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {
    public static final int NUMBERS_SIZE = 3;

    private final List<RandomNumber> randomNumbers = new ArrayList<>();

    public RandomNumbers() {
        makeRandomNumbers();
    }

    public void makeRandomNumbers() {
        for (int i = 0; i < NUMBERS_SIZE; i++) {
            this.randomNumbers.add(new RandomNumber());
        }
    }

    public boolean isSameNumber(int index, Integer comparedNumber) {
        return randomNumbers.get(index).isSameThan(comparedNumber);
    }

    public boolean isSameAnyWhere(Integer giveNumber) {
        return randomNumbers.stream().anyMatch(randomNumber -> randomNumber.isSameThan(giveNumber));
    }
}
