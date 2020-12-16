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
            return null;
        }
        return String.valueOf(countOfBalls) + "볼 ";
    }

    public String toStringStrike() {
        if (countOfStrikes == 0) {
            return null;
        }
        return String.valueOf(countOfStrikes) + "스트라이크 ";
    }
}
