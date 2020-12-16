package domain;

import java.util.List;

public class Player {
    private List<Integer> inputNumbers;

    public Player(String inputNumbers) {
        this.inputNumbers = NumberValidator.makeNumber(inputNumbers);
    }

    public Integer giveNumber(int index) {
        return inputNumbers.get(index);
    }
}
