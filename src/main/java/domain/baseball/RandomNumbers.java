package domain.baseball;

import java.util.ArrayList;
import java.util.List;

public class RandomNumbers {
    public static final int NUMBERS_SIZE = 3;

    private List<Integer> randomNumbers;

    public RandomNumbers() {
        this.randomNumbers = new ArrayList<>();
        this.randomNumbers = makeRandomNumbers();
    }

    public List<Integer> makeRandomNumbers() {
        do {
            addDistinctNumber();
        } while (this.randomNumbers.size() != NUMBERS_SIZE);
        return this.randomNumbers;
    }

    private void addDistinctNumber() {
        Integer nowRandomNumber = RandomNumber.makeRandomNumber();
        if (this.randomNumbers.stream().noneMatch(randomNumber -> randomNumber.equals(nowRandomNumber))) {
            this.randomNumbers.add(nowRandomNumber);
        }
    }

    public Integer giveNumber(int i) {
        return randomNumbers.get(i);
    }
}
