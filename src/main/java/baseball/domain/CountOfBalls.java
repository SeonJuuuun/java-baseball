package baseball.domain;

public class CountOfBalls {

    private int strikeCount;
    private int ballCount;

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    public void increaseBallCount() {
        ballCount++;
    }

    public void increaseStrikeCount() {
        strikeCount++;
    }

    public boolean isStrikeCountZero() {
        return strikeCount == 0;
    }

    public boolean isBallCountZero() {
        return ballCount == 0;
    }

    public boolean isThreeStrike() {
        return strikeCount == 3;
    }

    public boolean isNothing() {
        return isBallCountZero() && isStrikeCountZero();
    }
}
