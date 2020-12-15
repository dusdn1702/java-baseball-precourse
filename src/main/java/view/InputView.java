package view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String receiveSomethingFromUser() {
        return this.scanner.nextLine();
    }
}
