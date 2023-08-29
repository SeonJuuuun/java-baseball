package baseball.view;

import java.util.ArrayList;
import java.util.List;

import baseball.constants.Constants;
import baseball.domain.Computer;
import baseball.domain.PlayerNumber;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

public class InputView {

	public Computer generateSuccessNumber() {
		List<Integer> computerNumber = new ArrayList<>();
		while (computerNumber.size() < 3) {
			int randomNumber = Randoms.pickNumberInRange(Constants.MIN_VALUE, Constants.MAX_VALUE);
			if (!computerNumber.contains(randomNumber))
				computerNumber.add(randomNumber);
		}
		for (Integer computerNumber1 : computerNumber) {
			System.out.println(computerNumber1);
		}
		return new Computer(computerNumber);
	}

	public PlayerNumber inputPlayerNumber() {
		List<Integer> playerNumber = new ArrayList<>();
		String number = Console.readLine();
		for (int i = 0; i < number.length(); i++) {
			playerNumber.add(number.charAt(i) - '0');
		}
		return new PlayerNumber(playerNumber);
	}

	public String inputRetryNumber() {
		return Console.readLine();
	}

	public void gameStartMessage(){
		System.out.println("숫자 야구 게임을 시작합니다.");
	}

	public void printInputMessage(){
		System.out.print("숫자를 입력해 주세요 : ");
	}
}