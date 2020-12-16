package view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String receiveSomethingFromUser() {
        System.out.print("숫자를 입력해주세요 : ");
        return this.scanner.next();
    }

    public String receiveRestartFlag() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return this.scanner.next();
    }
}
