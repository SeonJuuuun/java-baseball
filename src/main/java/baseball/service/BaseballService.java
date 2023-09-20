package baseball.service;

import baseball.domain.Computer;
import baseball.domain.Player;

public class BaseballService {

    private static final int MAX_SIZE = 3;

    public int getStrikeCount(Computer computer, Player player) {
        int strikeCount = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            if (computer.getComputerNumberByIndex(i) == player.getPlayerNumberByIndex(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int getBallCount(Computer computer, Player player) {
        int ballCount = 0;
        for (int i = 0; i < MAX_SIZE; i++) {
            if (computer.isComputerNumberContainsPlayerNumber(player.getPlayerNumberByIndex(i))) {
                ballCount++;
            }
        }
        return ballCount;
    }
}
