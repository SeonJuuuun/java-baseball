package baseball.domain;

import java.util.List;

public class Computer {

	private final List<Integer> computerNumber;

	public Computer(List<Integer> computerNumber) {
		this.computerNumber = computerNumber;
	}

	public List<Integer> getComputerNumber() {
		return computerNumber;
	}
}

