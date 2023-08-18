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

}

