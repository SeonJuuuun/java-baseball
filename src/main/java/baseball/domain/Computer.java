package baseball.domain;

import java.util.List;

public class Computer {

    private final List<String> computerNumber;

    public Computer(List<String> computerNumber) {
        this.computerNumber = computerNumber;
    }

    public List<String> getComputerNumber() {
        return computerNumber;
    }
}
