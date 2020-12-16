package controller;

import domain.Computer;
import domain.Player;
import domain.baseball.RandomNumbers;
import view.InputView;
import view.OutputView;

import java.util.Scanner;

public class GameController {
    private final InputView inputView;

    public GameController(Scanner scanner) {
        this.inputView = new InputView(scanner);
    }

    public static Player makePlayerUntilValid(InputView inputView) {
        try {
            OutputView.printReceiveNumberNotice();
            return new Player(inputView.receiveSomethingFromUser());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            makePlayerUntilValid(inputView);
        }
        throw new IllegalArgumentException("무언가 이상이 있다");
    }

    public void run() {
        RandomNumbers randomNumbers = new RandomNumbers();

        Player player = makePlayerUntilValid(this.inputView);

        Computer.makeResult(randomNumbers, player);
    }
}
