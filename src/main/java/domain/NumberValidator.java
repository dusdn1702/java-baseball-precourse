package domain;

import java.util.ArrayList;
import java.util.List;

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
            throw new IllegalArgumentException("숫자는 세 글자를 입력해야 합니다.");
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

    private static void checkDistinctNumber(Integer nowNumber, List<Integer> integers) {
        if (integers.stream().anyMatch(integer -> integer.equals(nowNumber))) {
            throw new IllegalArgumentException("서로 다른 세자리수를 입력해주세요.");
        }
    }

    private static void checkBoundary(Integer parseInt) {
        if (parseInt < 1) {
            throw new IllegalArgumentException("숫자는 1부터 입니다.");
        }
    }
}
