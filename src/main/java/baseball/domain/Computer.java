package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Integer> computerNumber;

    public Computer(List<Integer> computerNumber) {
        this.computerNumber = computerNumber;
    }

    public int getComputerNumberByIndex(int index) {
        return computerNumber.get(index);
    }

    public boolean isComputerNumberContainsPlayerNumber(Integer playerNumber) {
        return computerNumber.contains(playerNumber);
    }
}
