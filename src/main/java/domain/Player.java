package domain;

import java.util.List;

public class Player {
    private final List<Integer> inputNumbers;

    public Player(List<Integer> inputNumbers) {
        this.inputNumbers = inputNumbers;
    }

    public Integer getNumberWithIndex(int index) {
        return inputNumbers.get(index);
    }

    public boolean isSameThanAnyWhere(Integer number) {
        return inputNumbers.stream().anyMatch(integer -> integer.equals(number));
    }
}
