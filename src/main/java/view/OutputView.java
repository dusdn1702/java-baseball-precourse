package view;

import static domain.baseball.RandomNumbers.NUMBERS_SIZE;

public class OutputView {
    public static void printResult(String makeResult) {
        System.out.println(makeResult);
    }

    public static void printAnswer() {
        System.out.println(NUMBERS_SIZE + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
