/*
 * RandomNumbers.java            1.0       2020-11-25
 *
 * Copyright (c) 2020 Yeonwoo Cho
 * ComputerScience, ProgrammingLanguage, Java, Seoul, KOREA
 * All rights reserved
 */

package baseball.domain;

import utils.RandomUtils;

import java.util.List;

/**
 * 랜덤한 숫자 리스트를 만드는 클래스
 *
 * @author 조연우
 * @version 1.0 2020년 11월 25일
 */
public class RandomNumbers {
    public static final int NUMBER_LIST_SIZE = 3;
    private static final int LOWER_BOUNDARY = 1;
    private static final int UPPER_BOUNDARY = 9;

    public List<Integer> makeRandomNumbers(List<Integer> randomNumbers) {
        while (isSizeIncorrect(randomNumbers.size())) {
            addDistinctNumber(makeRandomNumber(), randomNumbers);
        }
        return randomNumbers;
    }

    private boolean isSizeIncorrect(int listSize) {
        return listSize != NUMBER_LIST_SIZE;
    }

    private void addDistinctNumber(Integer checkingNumber, List<Integer> randomNumbers) {
        if (randomNumbers.stream().noneMatch(integer -> integer.equals(checkingNumber))) {
            randomNumbers.add(checkingNumber);
        }
    }

    private int makeRandomNumber() {
        return RandomUtils.nextInt(LOWER_BOUNDARY, UPPER_BOUNDARY);
    }
}
