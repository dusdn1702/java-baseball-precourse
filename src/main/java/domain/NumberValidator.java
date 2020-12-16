package domain;

import java.util.ArrayList;
import java.util.List;

import static domain.baseball.RandomNumber.LOWER_BOUNDARY;

public class NumberValidator {
    private static final int NUMBERS_SIZE = 3;

    public static List<Integer> makeNumber(String receiveSomethingFromUser) {
        checkThreeNumbers(receiveSomethingFromUser);
        if (!isNumber(receiveSomethingFromUser)) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
        return makeThreeNumbers(receiveSomethingFromUser);
    }

    private static void checkThreeNumbers(String receiveSomethingFromUser) {
        if (receiveSomethingFromUser.length() != NUMBERS_SIZE) {
            throw new IllegalArgumentException("숫자는 " + NUMBERS_SIZE + " 글자를 입력해야 합니다.");
        }
    }

    private static boolean isNumber(String receiveSomethingFromUser) {
        try {
            Integer.parseInt(receiveSomethingFromUser);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static List<Integer> makeThreeNumbers(String receiveSomethingFromUser) {
        List<Integer> integers = new ArrayList<>();
        //    return Stream.of(receiveSomethingFromUser.toCharArray()).map(c->checkBoundary(Integer.parseInt(String.valueOf(c)))).collect(Collectors.toList());
        for (char c : receiveSomethingFromUser.toCharArray()) {
            Integer nowNumber = Integer.parseInt(String.valueOf(c));
            checkDistinctNumber(nowNumber, integers);
            checkBoundary(nowNumber);
            integers.add(nowNumber);
        }
        return integers;
    }

    private static void checkDistinctNumber(Integer nowNumber, List<Integer> enrolledNumbers) {
        if (enrolledNumbers.stream().anyMatch(integer -> integer.equals(nowNumber))) {
            throw new IllegalArgumentException("서로 다른 수를 입력해주세요.");
        }
    }

    private static void checkBoundary(Integer number) {
        if (number < LOWER_BOUNDARY) {
            throw new IllegalArgumentException("자연수를 입력해주세요.");
        }
    }
}
