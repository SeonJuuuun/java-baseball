package baseball.view;

import java.util.ArrayList;
import java.util.List;

import baseball.constants.Constants;
import baseball.domain.Computer;
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
}