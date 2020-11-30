/*
 * GameController.java            1.0       2020-11-25
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.InputNumbersValidator;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.List;

import static baseball.domain.Computer.INDEX_OF_BALLS;
import static baseball.domain.Computer.INDEX_OF_STRIKES;
import static baseball.domain.RandomNumbers.NUMBER_LIST_SIZE;

/**
 * 전체 게임을 진행하는 클래스
 *
 * @author 조연우
 * @version 1.0 2020년 11월 25일
 */
public class GameController {
    public static final String RESTART_NUMBER = "1";
    public static final String EXIT_NUMBER = "2";

    private final InputView inputView;
    private final OutputView outputView;

    public GameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        do {
            playUnitGame(new Computer());
            this.outputView.printRestart();
        } while (isRestartFlag(this.inputView.receiveRestartFlag()));
    }

    private void playUnitGame(Computer computer) {
        while (true) {
            final List<Integer> inputNumbers = generateInputNumbers(this.inputView.receiveInputNumbers());
            final List<Integer> ballsAndStrikes = computer.calculateResult(inputNumbers);
            this.outputView.printResult(ballsAndStrikes.get(INDEX_OF_BALLS), ballsAndStrikes.get(INDEX_OF_STRIKES));
            if (isCorrectAnswer(ballsAndStrikes.get(INDEX_OF_STRIKES))) {
                break;
            }
        }
    }

    private List<Integer> generateInputNumbers(String uncheckedInputNumbers) {
        final InputNumbersValidator inputNumbersValidator = new InputNumbersValidator();
        return inputNumbersValidator.makeInputNumbers(uncheckedInputNumbers);
    }

    private boolean isCorrectAnswer(int countsOfStrike) {
        return NUMBER_LIST_SIZE == countsOfStrike;
    }

    private boolean isRestartFlag(String userInput) {
        if (!RESTART_NUMBER.equals(userInput) && !EXIT_NUMBER.equals(userInput)) {
            throw new IllegalArgumentException("입력이 올바르지 않습니다.");
        }
        return RESTART_NUMBER.equals(userInput);
    }
}
