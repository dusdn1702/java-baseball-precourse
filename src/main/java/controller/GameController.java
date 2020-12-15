package controller;

import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class GameController {
    private final InputView inputView;

    public GameController(Scanner scanner) {
        this.inputView = new InputView(scanner);
    }

    public void run() {
        OutputView.printReceiveNumberNotice();
    }
}
