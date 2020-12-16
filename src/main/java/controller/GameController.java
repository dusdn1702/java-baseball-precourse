package controller;

import domain.Computer;
import domain.NumberValidator;
import domain.Player;
import domain.RestartFlag;
import domain.baseball.RandomNumbers;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Scanner;

public class GameController {
    private final InputView inputView;

    public GameController(Scanner scanner) {
        this.inputView = new InputView(scanner);
    }

    public void run() {
        do {
            RandomNumbers randomNumbers = new RandomNumbers();
            playUnitGame(randomNumbers);
        } while (makeRestartNumbers(inputView));
    }

    private void playUnitGame(RandomNumbers randomNumbers) {
        while (true) {
            Player player = new Player(makeValidNumbers(inputView));
            Computer computer = new Computer();
            OutputView.printResult(computer.makeResult(randomNumbers, player));
            if (computer.isAnswer()) {
                OutputView.printAnswer();
                break;
            }
        }
    }

    private boolean makeRestartNumbers(InputView inputView) {
        try {
            return RestartFlag.inputToFlag(inputView.receiveRestartFlag());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return makeRestartNumbers(inputView);
        }
    }

    private List<Integer> makeValidNumbers(InputView inputView) {
        try {
            return NumberValidator.makeNumber(inputView.receiveSomethingFromUser());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return makeValidNumbers(inputView);
        }
    }
}
