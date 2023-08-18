package baseball.view;

public class GameResult {

	public void printResult(int strikeCount, int ballCount) {
		if (strikeCount == 3) {
			System.out.println("3스트라이크");
			endMessage();
			restartMessage();
		}
		if (strikeCount == 0 && ballCount >= 1) {
			System.out.println(ballCount + "볼");
		}
		if (strikeCount >= 1 && ballCount == 0 && strikeCount < 3) {
			System.out.println(strikeCount + "스트라이크");
		}
		if (strikeCount == 0 && ballCount == 0) {
			System.out.println("낫싱");
		}
		if (strikeCount >= 1 && ballCount >= 1) {
			System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
		}
	}
}
