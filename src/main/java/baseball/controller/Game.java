package baseball.controller;

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
}

