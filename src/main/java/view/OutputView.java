package view;

public class OutputView {
    public static void printReceiveNumberNotice() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public static void printResult(String makeResult) {
        System.out.println(makeResult);
    }

    public static void printAnswer() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
