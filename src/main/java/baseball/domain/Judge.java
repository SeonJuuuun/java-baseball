package baseball.domain;

public class Judge {

	private final int strikeCount;
	private final int ballCount;

	public Judge(int strikeCount, int ballCount) {
		this.strikeCount = strikeCount;
		this.ballCount = ballCount;
	}

	public int getBallCount() {
		return ballCount;
	}

	public int getStrikeCount() {
		return strikeCount;
	}
}
