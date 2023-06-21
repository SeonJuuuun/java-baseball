package baseball;

import java.util.List;

public class GameProgram {

	InputView inputView = new InputView();
	Computer computer = new Computer();
	Judge judge = new Judge();
	OutputView outputView = new OutputView();
	Retry retry = new Retry();

	public void startGame() {
		boolean again = true;
		inputView.startMessage();

		while (again) {
			inputView.inputMessage();
			List<Integer> computerNum = computer.addComputerNumber();
			String result = "";
			endPoint(computerNum, result);
			outputView.askRetry();
			again = retry.retryOrExit();
		}
	}

	public String setting(List<Integer> computer, List<Integer> player) {
		int totalCount = judge.totalCount(computer, player);
		int strike = judge.countStrike(computer, player);
		int ball = totalCount - strike;
		return outputView.message(strike, ball, totalCount);
	}

	public void endPoint(List<Integer> computerNum, String result) {
		while (!result.equals("3스트라이크")) {
			result = setting(computerNum, inputView.inputPlayerNumber());
			System.out.println(result);
		}
	}
	
	

}
