package domain.baseball;

public class BallStrike {
    private static int countOfBalls;
    private static int countOfStrikes;

    public BallStrike() {
        countOfBalls = 0;
        countOfStrikes = 0;
    }

    public void increaseBalls() {
        countOfBalls++;
    }

    public void increaseStrikes() {
        countOfStrikes++;
    }

    public String toStringBall() {
        if (countOfBalls == 0) {
            return "";
        }
        return countOfBalls + "볼 ";
    }

    public String toStringStrike() {
        if (countOfStrikes == 0) {
            return "";
        }
        return countOfStrikes + "스트라이크 ";
    }

    public boolean isAnswer() {
        return countOfStrikes == 3;
    }
}
