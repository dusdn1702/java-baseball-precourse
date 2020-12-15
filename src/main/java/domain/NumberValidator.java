package domain;

import java.util.ArrayList;
import java.util.List;

public class NumberValidator {
    private static final int NUMBERS_SIZE = 3;

    public static List<Integer> makeNumber(String receiveSomethingFromUser) {
        checkThreeNumbers(receiveSomethingFromUser);
        if (isNumber(receiveSomethingFromUser)) {
            return makeThreeNumbers(receiveSomethingFromUser);
        }
        throw new IllegalArgumentException("무언가 오류가 있다.");
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
            integers.add(checkBoundary(Integer.parseInt(String.valueOf(c))));
        }
        return integers;
    }

    private static Integer checkBoundary(int parseInt) {
        if (parseInt < 1) {
            throw new IllegalArgumentException("숫자는 1부터 입니다.");
        }
        return parseInt;
    }
}
