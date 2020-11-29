/*
 * Application.java            0.9       2020-11-25
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package baseball;

import baseball.controller.GameController;

import java.util.Scanner;

/**
 * 프로그램을 실행하는 클래스
 *
 * @author 조연우
 * @version 1.0 2020년 11월 25일
 */
public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
        final GameController gameController = new GameController();

        gameController.run(scanner);
    }
}
