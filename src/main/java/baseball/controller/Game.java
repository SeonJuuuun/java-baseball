package baseball.controller;

import baseball.constants.Constants;
import baseball.domain.Judge;
import baseball.domain.Retry;
import baseball.domain.Computer;
import baseball.domain.PlayerNumber;
import baseball.view.GameResult;
import baseball.view.InputView;

public class Game {

	InputView inputView = new InputView();
	GameResult gameResult = new GameResult();

	public void play() {
		inputView.gameStartMessage();
		boolean restart = true;
		while (restart) {
			startGame(inputView.generateSuccessNumber());
			restart = tryRetry();
		}
	}

	private void startGame(Computer computer) {
		while (true) {
			inputView.printInputMessage();
			PlayerNumber inputPlayerNumber = inputView.inputPlayerNumber();
			Judge judge = judge(computer, inputPlayerNumber);
			gameResult.printResult(judge.getStrikeCount(), judge.getBallCount());
			if (judge.getStrikeCount() == Constants.successStrikeNum) {
				break;
			}
		}
	}

	public Judge judge(Computer computer, PlayerNumber playerNumber) {
		int strikeCount = 0;
		int ballCount = 0;
		for (int i = 0; i < Constants.MAX_SIZE; i++) {
			if (computer.getComputerNumber().get(i).equals(playerNumber.getPlayerNumber().get(i))) {
				strikeCount++;
			}
			if (computer.getComputerNumber().contains(playerNumber.getPlayerNumber().get(i))) {
				ballCount++;
			}
		}
		ballCount -= strikeCount;
		return new Judge(strikeCount, ballCount);
	}

	private boolean tryRetry() {
		String retryNumber = inputView.inputRetryNumber();
		Retry retry = new Retry(retryNumber);
		return retry.isRetry();
	}
}

