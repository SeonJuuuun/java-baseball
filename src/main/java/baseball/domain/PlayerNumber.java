package baseball.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlayerNumber {

	private final List<Integer> playerNumber;

	public PlayerNumber(List<Integer> playerNumber) {
		this.playerNumber = playerNumber;
	}

	private void duplicatePlayerNumber(List<Integer> playerNumber) throws IllegalArgumentException {
		Set<Integer> numberSet = new HashSet<>();
		for (int num : playerNumber) {
			if (!numberSet.add(num)) {
				throw new IllegalArgumentException("입력된 숫자는 중복될 수 없습니다.");
			}
		}
	}

	public List<Integer> getPlayerNumber() {
		return playerNumber;
	}
}