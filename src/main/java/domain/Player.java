package domain;

import java.util.List;

public class Player {
    private List<Integer> inputNumbers;

    public Player(List<Integer> inputNumbers) {
        this.inputNumbers = inputNumbers;
    }

    public Integer giveNumber(int index) {
        return inputNumbers.get(index);
    }

    public boolean isSameThanAnyWhere(Integer number) {
        return inputNumbers.stream().anyMatch(integer -> integer.equals(number));
    }

    public boolean isSameThanSameWhere(int index, List<Integer> numbers) {
        return inputNumbers.get(index).equals(numbers.get(index));
    }

}
