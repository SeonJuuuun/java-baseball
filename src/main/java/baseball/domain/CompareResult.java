package baseball.domain;

public class CompareResult {

    private static final String NOTHING_TEXT = "낫싱";
    private static final String BALL_TEXT = "볼";
    private static final String STRIKE_TEXT = "스트라이크";

    private final CountOfBalls count;

    public CompareResult(CountOfBalls count) {
        this.count = count;
    }

    @Override
    public String toString() {
        int ballCount = count.getBallCount();
        int strikeCount = count.getStrikeCount();
        ballCount -= strikeCount;

        if (count.isNothing()) {
            return NOTHING_TEXT;
        }
        if (count.isStrikeCountZero()) {
            return String.format("%d%s", ballCount, BALL_TEXT);
        }
        if (count.isBallCountZero()) {
            return String.format("%d%s", strikeCount, STRIKE_TEXT);
        }
        if (count.isThreeStrike()) {
            return String.format("%d%s", strikeCount, STRIKE_TEXT);
        }
        return String.format("%d%s %d%s", ballCount, BALL_TEXT, strikeCount, STRIKE_TEXT);
    }

    public CountOfBalls getCountOfBalls() {
        return count;
    }
}
