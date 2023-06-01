package baseball;

import java.util.List;

public class Judge {

	public int countStrike(List<Integer> computer, List<Integer> player) {
		int strike = 0;
		for (int i = 0; i < computer.size(); i++) {
			if (computer.get(i) == player.get(i)) {
				strike++;
			}
		}
		return strike;
	}

	public int totalCount(List<Integer> computer, List<Integer> player) {
		int totalCount = 0;
		for (int i = 0; i < computer.size(); i++) {
			if (computer.contains(player.get(i))) {
				totalCount++;
			}
		}
		return totalCount;
	}

}
